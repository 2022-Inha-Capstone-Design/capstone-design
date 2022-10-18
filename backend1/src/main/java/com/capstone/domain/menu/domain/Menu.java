package com.capstone.domain.menu.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false)
    private Integer kcal;

    @Column(nullable = false)
    private Double nutrient1;

    @Column(nullable = false)
    private Double nutrient2;

    @Column(nullable = false)
    private Double nutrient3;

    private String method1;

    private String method2;

    private String method3;

    private String method4;

    private String method5;

    private String method6;

    private String method7;

    private String method8;

    private String method9;

    private String method10;
}
