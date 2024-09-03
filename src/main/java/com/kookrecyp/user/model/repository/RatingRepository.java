package com.kookrecyp.user.model.repository;

import com.kookrecyp.user.model.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.kookrecyp.user.model.repository
 * fileName    : RatingRepository
 * author      : jaejun
 * date        : 2024-08-28
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-28         jaejun
 */

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
}
