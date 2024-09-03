package com.kookrecyp.user.model.repository;

import com.kookrecyp.user.model.entity.CookRecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.kookrecyp.user.model.repository
 * fileName    : CookRecipeRepository
 * author      : jaejun
 * date        : 2024-08-27
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-27         jaejun
 */
@Repository
public interface CookRecipeRepository extends JpaRepository<CookRecipeEntity, Long> {
}
