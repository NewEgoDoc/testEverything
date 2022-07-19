package com.example.testeverything.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Person {
    final private String name;
    final private Integer age;
    final private Job job;
}
