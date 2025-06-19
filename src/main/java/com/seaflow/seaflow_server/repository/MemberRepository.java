package com.seaflow.seaflow_server.repository;

import com.seaflow.seaflow_server.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    
    // userId로 회원 찾기
    Optional<Member> findByUserId(String userId);
    
    // email로 회원 찾기  
    Optional<Member> findByEmail(String email);
    
    // userId 중복 체크
    boolean existsByUserId(String userId);
    
    // email 중복 체크
    boolean existsByEmail(String email);
    
    // 활성 회원 찾기 (밴 당하지 않은 회원)
    Optional<Member> findByUserIdAndIsBanFalse(String userId);
} 