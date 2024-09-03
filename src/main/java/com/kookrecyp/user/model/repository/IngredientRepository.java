package com.kookrecyp.user.model.repository;

import com.kookrecyp.user.model.entity.CookRecipeEntity;
import com.kookrecyp.user.model.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.kookrecyp.user.model.repository
 * fileName    : IngredientRepository
 * author      : jaejun
 * date        : 2024-08-28
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-28         jaejun
 */
@Repository
public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {
}
