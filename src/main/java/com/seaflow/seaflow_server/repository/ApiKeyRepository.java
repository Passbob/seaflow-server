package com.seaflow.seaflow_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seaflow.seaflow_server.entity.ApiKey;

import java.util.Optional;

@Repository
public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer> {

    Optional<ApiKey> findByMemberNo(Integer memberNo);

    boolean existsBySecretKey(String secretKey);

}
