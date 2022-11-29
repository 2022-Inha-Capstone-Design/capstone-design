package com.capstone.domain.user.domain;

import com.capstone.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseEntity {

    public enum Gender{
        MALE, FEMALE;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long kakaoId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Gender gender;

    @Builder
    public User(Long id, Long kakaoId, String name, Gender gender) {
        this.id = id;
        this.kakaoId = kakaoId;
        this.name = name;
        this.gender = gender;
    }
}
