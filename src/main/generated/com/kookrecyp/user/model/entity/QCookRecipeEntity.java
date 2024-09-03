package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCookRecipeEntity is a Querydsl query type for CookRecipeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCookRecipeEntity extends EntityPathBase<CookRecipeEntity> {

    private static final long serialVersionUID = 1563427792L;

    public static final QCookRecipeEntity cookRecipeEntity = new QCookRecipeEntity("cookRecipeEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> recipeCreateDate = createDateTime("recipeCreateDate", java.time.LocalDateTime.class);

    public final StringPath recipeDescription = createString("recipeDescription");

    public final StringPath recipeServing = createString("recipeServing");

    public final StringPath recipeTitle = createString("recipeTitle");

    public final DateTimePath<java.time.LocalDateTime> recipeUpdateDate = createDateTime("recipeUpdateDate", java.time.LocalDateTime.class);

    public QCookRecipeEntity(String variable) {
        super(CookRecipeEntity.class, forVariable(variable));
    }

    public QCookRecipeEntity(Path<? extends CookRecipeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCookRecipeEntity(PathMetadata metadata) {
        super(CookRecipeEntity.class, metadata);
    }

}

