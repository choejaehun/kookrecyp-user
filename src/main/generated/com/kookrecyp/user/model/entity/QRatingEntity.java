package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRatingEntity is a Querydsl query type for RatingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatingEntity extends EntityPathBase<RatingEntity> {

    private static final long serialVersionUID = 228770999L;

    public static final QRatingEntity ratingEntity = new QRatingEntity("ratingEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ratingCreateDate = createDateTime("ratingCreateDate", java.time.LocalDateTime.class);

    public final NumberPath<Double> ratingValue = createNumber("ratingValue", Double.class);

    public QRatingEntity(String variable) {
        super(RatingEntity.class, forVariable(variable));
    }

    public QRatingEntity(Path<? extends RatingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRatingEntity(PathMetadata metadata) {
        super(RatingEntity.class, metadata);
    }

}

