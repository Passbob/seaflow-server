package com.seaflow.seaflow_server.repository;

import com.seaflow.seaflow_server.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findByMemberNoOrderByCreatedAtDesc(Integer memberNo);

    Optional<Project> findByProjectId(String projectId);

    Optional<Project> findByProjectIdAndMemberNo(String projectId, Integer memberNo);

    boolean existsByProjectIdAndMemberNo(String projectId, Integer memberNo);

} 