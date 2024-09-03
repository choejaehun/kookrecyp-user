package com.kookrecyp.user.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

/**
 * packageName : com.kookrecyp.user.model.entity
 * fileName    : AdminEntity
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
@NoArgsConstructor
@Entity
@Table(name="admins")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("관리자 ID")
    private String adminName;
    
    @Comment("관리자 Email")
    private String adminEmail;

    @Comment("관리자 비밀번호")
    private String adminPassword;

    @Comment("관리자 닉네임")
    private String adminNickName;

    @Comment("관리자 직급")
    private String adminGrade;

    @Comment("관리자 가입일자")
    @CreationTimestamp
    private LocalDateTime adminCreateDate;

}
