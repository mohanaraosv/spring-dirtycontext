package com.mycompany.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {

    private String name = "mohan";

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee(" + name + ")";
    }
}
