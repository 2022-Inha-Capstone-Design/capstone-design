package com.capstone.domain.menu.domain;

import lombok.AccessLevel;
import lombok.Builder;
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

    private String image_url;

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

    @Builder
    public Menu(String name, String image_url, String method1, String method2, String method3, String method4,
                String method5, String method6, String method7, String method8, String method9, String method10) {
        this.name = name;
        this.image_url = image_url;
        this.method1 = method1;
        this.method2 = method2;
        this.method3 = method3;
        this.method4 = method4;
        this.method5 = method5;
        this.method6 = method6;
        this.method7 = method7;
        this.method8 = method8;
        this.method9 = method9;
        this.method10 = method10;
    }
}
