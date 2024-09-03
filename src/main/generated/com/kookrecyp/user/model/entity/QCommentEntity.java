package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommentEntity is a Querydsl query type for CommentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommentEntity extends EntityPathBase<CommentEntity> {

    private static final long serialVersionUID = -396154581L;

    public static final QCommentEntity commentEntity = new QCommentEntity("commentEntity");

    public final StringPath commentContent = createString("commentContent");

    public final DateTimePath<java.time.LocalDateTime> commentCreateDate = createDateTime("commentCreateDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> commentUpdateDate = createDateTime("commentUpdateDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCommentEntity(String variable) {
        super(CommentEntity.class, forVariable(variable));
    }

    public QCommentEntity(Path<? extends CommentEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommentEntity(PathMetadata metadata) {
        super(CommentEntity.class, metadata);
    }

}

