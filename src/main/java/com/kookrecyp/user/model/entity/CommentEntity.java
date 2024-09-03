package com.kookrecyp.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * packageName : com.kookrecyp.user.model.entity
 * fileName    : CommentEntity
 * author      : jaejun
 * date        : 2024-08-27
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-27         jaejun
 */
@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("댓글 내용")
    private String commentContent;

    @Comment("댓글 생성 일자")
    @CreationTimestamp
    private LocalDateTime commentCreateDate;

    @Comment("댓글 수정 일자")
    @UpdateTimestamp
    private LocalDateTime commentUpdateDate;
}
