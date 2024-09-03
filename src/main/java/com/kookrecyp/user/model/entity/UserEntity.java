package com.kookrecyp.user.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * packageName : com.kookrecyp.user.model.entity
 * fileName    : UserEntity
 * author      : jaejun
 * date        : 2024-08-23
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-23         jaejun
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("유저 ID")
    private String username;

    @Comment("유저 비밀번호")
    private String password;

    @Comment("유저 이메일")
    private String email;

    @Comment("유저 전화번호")
    private String phone;

    @Comment("유저 주소")
    private String address;

    @Comment("유저 닉네임")
    private String nickName;

    @Comment("유저 생성 일자")
    @CreationTimestamp
    private LocalDateTime userCreateDate;

    @Comment("유저 정보 수정 일자")
    @UpdateTimestamp
    private LocalDateTime userUpdateDate;


}
