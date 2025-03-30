package com.example.belajar_spring_validation;

import com.example.belajar_spring_validation.data.Person;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;

    @Test
    void personNotValid() {
        var person = new Person("", "");
        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);
        Assertions.assertFalse(constraintViolationSet.isEmpty());
        Assertions.assertEquals(2, constraintViolationSet.size());
    }

    @Test
    void personValid() {
        var person = new Person("1", "Eva");
        Set<ConstraintViolation<Person>> constraintViolationSet = validator.validate(person);
        Assertions.assertTrue(constraintViolationSet.isEmpty());
    }

}
