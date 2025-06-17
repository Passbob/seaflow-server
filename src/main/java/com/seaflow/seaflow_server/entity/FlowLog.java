package com.seaflow.seaflow_server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "flow_logs")
@Getter
@Setter
@NoArgsConstructor
public class FlowLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "project_no", nullable = false)
    private Integer projectNo;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "log_text")
    private String logText;

    @Column(name = "request_json")
    private String requestJson;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    
}
