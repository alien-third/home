package com.logotype.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=5, max=50, message = "제목은 5자 이상 50자 이하입니다.")
    private String title;
    @NotNull
    @Size(min=12, max=2000, message = "내용은 12자 이상 2000자 이하입니다.")
    private String content;

}
