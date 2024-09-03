package com.kookrecyp.user.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QIngredientEntity is a Querydsl query type for IngredientEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIngredientEntity extends EntityPathBase<IngredientEntity> {

    private static final long serialVersionUID = 1930644075L;

    public static final QIngredientEntity ingredientEntity = new QIngredientEntity("ingredientEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ingredientName = createString("ingredientName");

    public QIngredientEntity(String variable) {
        super(IngredientEntity.class, forVariable(variable));
    }

    public QIngredientEntity(Path<? extends IngredientEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIngredientEntity(PathMetadata metadata) {
        super(IngredientEntity.class, metadata);
    }

}

