package com.seaflow.seaflow_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seaflow.seaflow_server.entity.FlowLog;

import java.util.List;
import java.util.Optional;


@Repository
public interface FlowLogRepository extends JpaRepository<FlowLog, Integer> {
    List<FlowLog> findByProjectNoOrderByCreatedAtDesc(Integer projectNo);

}
