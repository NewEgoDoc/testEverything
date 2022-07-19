package com.example.testeverything.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void test(){
        Person person = new Person("Name", 28, Job.Programmer);
        Assertions.assertThat(person.getName()).isEqualTo("Name");
        Assertions.assertThat(person.getAge()).isEqualTo(28);
        Assertions.assertThat(person.getJob()).isEqualTo(Job.Programmer);
    }

}
