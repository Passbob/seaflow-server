package com.seaflow.seaflow_server.logflow.service;

import com.seaflow.seaflow_server.dto.FlowLogRequestDto;
import com.seaflow.seaflow_server.entity.FlowLog;
import com.seaflow.seaflow_server.entity.Project;
import com.seaflow.seaflow_server.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seaflow.seaflow_server.repository.FlowLogRepository;

import java.util.List;
import java.util.Optional;


@Service
public class LogFlowService {

    @Autowired
    private FlowLogRepository flowLogRepository;

    @Autowired
    private ProjectRepository projectRepository;
    
    public List<FlowLog> findByProjectNoOrderByCreateAtDesc(Integer projectNo){

        //여기에서 해당 회원의 정보와 프로젝트가 일치하는지 먼저 판단 이 부분은 멤버의 해당 부분을 조회할 때
        //Spring Security를 사용할 예정이라 흐름만 짜놓자
        //1. 토큰 혹은 해당 회원을 검증한다(추후 회원 레벨 구분 확장성 + 보안) 실패한다면 return null(메세지도 담겨야하나?)
        //2. 회원에 해당하는 프로젝트가 맞는지 검증한다 아니면 return null
        //3. 그 후에는 밑에꺼 반환
        //1번과 2번은 생각해보니 컨트롤러 측면에서 검증 즉, common/auth로 구분시켜서 컨트롤러 레이어에서
        // 검증 후 메세지 반환하는게 좋을 것 같네
        //그렇다면 사실상 이 서비스는 그냥 레포만 이어주면 되겠네?

        return flowLogRepository.findByProjectNoOrderByCreatedAtDesc(projectNo);
    }

    public String saveFlowLog(FlowLogRequestDto flowLogRequest, Integer memberNo){

        String message = "";

        Optional<Project> project = projectRepository.findByProjectIdAndMemberNo(flowLogRequest.getProjectName(), memberNo);

        if(project.isPresent()){
            FlowLog flowLog = new FlowLog();
            flowLog.setProjectNo(project.get().getNo());
            flowLog.setTitle(flowLogRequest.getTitle());
            flowLog.setLogText(flowLogRequest.getLogText());
            flowLog.setRequestJson(flowLogRequest.getRequestJson());
            flowLogRepository.save(flowLog);
            message = "로그가 저장되었습니다.";
        }else{
            Project newProject = new Project();
            newProject.setProjectId(flowLogRequest.getProjectName());
            newProject.setMemberNo(memberNo);
            newProject.setProjectDescription("자동생성 프로젝트");
            Project savedProject = projectRepository.save(newProject);

            FlowLog flowLog = new FlowLog();
            flowLog.setProjectNo(savedProject.getNo());
            flowLog.setTitle(flowLogRequest.getTitle());
            flowLog.setLogText(flowLogRequest.getLogText());
            flowLog.setRequestJson(flowLogRequest.getRequestJson());
            flowLogRepository.save(flowLog);
            message = "프로젝트가 자동생성되었습니다.";
        }

        return message;
    }

    public List<Project> findByMemberNo(Integer memberNo){
        return projectRepository.findByMemberNoOrderByCreatedAtDesc(memberNo);
    }

}