package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = 351432229L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final StringPath address = createString("address");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.time.LocalDateTime> userCreateDate = createDateTime("userCreateDate", java.time.LocalDateTime.class);

    public final StringPath username = createString("username");

    public final DateTimePath<java.time.LocalDateTime> userUpdateDate = createDateTime("userUpdateDate", java.time.LocalDateTime.class);

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata metadata) {
        super(UserEntity.class, metadata);
    }

}

