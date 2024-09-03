package com.kookrecyp.user.model.repository;

import com.kookrecyp.user.model.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.kookrecyp.user.model.repository
 * fileName    : AdminRepository
 * author      : jaejun
 * date        : 2024-08-27
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-27         jaejun
 */
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
}
