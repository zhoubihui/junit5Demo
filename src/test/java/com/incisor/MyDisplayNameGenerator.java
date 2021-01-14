package com.incisor;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class MyDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        String[] strings = testClass.getName().split(".");
        return "培优" + strings[strings.length - 1];
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        String[] strings = testClass.getName().split(".");
        return strings[strings.length - 1] + "-" + testMethod.getName();
    }
}
