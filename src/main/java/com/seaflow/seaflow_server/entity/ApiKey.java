package com.seaflow.seaflow_server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "api_keys")
@Getter
@Setter
@NoArgsConstructor
public class ApiKey {
    @Id
    @Column(name = "member_no")
    private Integer memberNo;

    @Column(name = "secret_key", nullable = false, unique = true)
    private String secretKey;

    @Column(name = "is_active")
    private boolean isActive;
}
