package com.seaflow.seaflow_server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    @Column(name = "no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "project_id", nullable = false)
    private String projectId;

    @Column(name = "project_description", nullable = false)
    private String projectDescription;

    @Column(name = "member_no", nullable = false)
    private Integer memberNo;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
