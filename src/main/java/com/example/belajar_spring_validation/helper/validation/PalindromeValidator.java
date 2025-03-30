package com.example.belajar_spring_validation.helper.validation;

import com.example.belajar_spring_validation.helper.StringHelper;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component --> tidak wajib
public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(s);
    }
}
