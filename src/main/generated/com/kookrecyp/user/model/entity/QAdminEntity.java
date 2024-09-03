package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminEntity is a Querydsl query type for AdminEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminEntity extends EntityPathBase<AdminEntity> {

    private static final long serialVersionUID = -989743013L;

    public static final QAdminEntity adminEntity = new QAdminEntity("adminEntity");

    public final DateTimePath<java.time.LocalDateTime> adminCreateDate = createDateTime("adminCreateDate", java.time.LocalDateTime.class);

    public final StringPath adminEmail = createString("adminEmail");

    public final StringPath adminGrade = createString("adminGrade");

    public final StringPath adminName = createString("adminName");

    public final StringPath adminNickName = createString("adminNickName");

    public final StringPath adminPassword = createString("adminPassword");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAdminEntity(String variable) {
        super(AdminEntity.class, forVariable(variable));
    }

    public QAdminEntity(Path<? extends AdminEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminEntity(PathMetadata metadata) {
        super(AdminEntity.class, metadata);
    }

}

