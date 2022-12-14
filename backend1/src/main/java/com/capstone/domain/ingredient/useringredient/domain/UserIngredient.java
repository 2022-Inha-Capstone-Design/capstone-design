package com.capstone.domain.ingredient.useringredient.domain;

import com.capstone.domain.ingredient.ingridient.domain.Ingredient;
import com.capstone.domain.user.domain.User;
import com.capstone.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class UserIngredient extends BaseEntity {

    public enum Location {
        FREEZING, REFRIGERATING, ROOM
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String expiration;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
}
