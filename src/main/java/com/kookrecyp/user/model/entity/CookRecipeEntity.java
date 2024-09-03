package com.kookrecyp.user.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * packageName : com.kookrecyp.user.model.entity
 * fileName    : CookRecipe
 * author      : jaejun
 * date        : 2024-08-26
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-26         jaejun
 */
@Getter
@Setter
@ToString
@Entity
@Table(name="cookrecipes")
public class CookRecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("레시피 제목")
    private String recipeTitle;

    @Comment("레시피 소개")
    private String recipeDescription;

    @Comment("*인분")
    private String recipeServing;

    @Comment("레시피 등록 일자")
    @CreationTimestamp
    private LocalDateTime recipeCreateDate;

    @Comment("레시피 수정 일자")
    @UpdateTimestamp
    private LocalDateTime recipeUpdateDate;
}
