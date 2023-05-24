package com.redistut.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TestEntity {

    private Long id;

    private String name;

    private LocalDateTime createdAt;
}
