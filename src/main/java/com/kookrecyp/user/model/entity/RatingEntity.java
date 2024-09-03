package com.kookrecyp.user.model.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * packageName : com.kookrecyp.user.model.entity
 * fileName    : RatingEntity
 * author      : jaejun
 * date        : 2024-08-27
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-27         jaejun
 */
@Getter
@Setter
@ToString
@Entity
@Table(name="ratings")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("요리평점")
    private Double ratingValue;

    @Comment("평점 등록 일자")
    @CreationTimestamp
    private LocalDateTime ratingCreateDate;

}
