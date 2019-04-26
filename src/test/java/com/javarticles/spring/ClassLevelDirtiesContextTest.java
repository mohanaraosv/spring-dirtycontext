package com.javarticles.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.spring.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class ClassLevelDirtiesContextTest {

    @Autowired
    protected Employee emp;

    @Before
    public void beforeTest() {
        System.out.println("beforeTest: " + emp);
        emp.setName("Roy");
    }

    @Test
    public void emp1Test() {
        System.out.println("emp1Test: " + emp);
    }

    @Test
    public void emp2Test() {
        System.out.println("emp2Test " + emp);
        emp.setName("Sam");
    }

    @Test
    public void emp3Test() {
        System.out.println("emp3Test " + emp);
        emp.setName("Kim");
    }

    @Test
    public void emp4Test() {
        System.out.println("emp4Test " + emp);
        emp.setName("Rita");
    }

    @After
    public void afterTest() {
        System.out.println("afterTest: " + emp);
    }

    @Configuration
    @ComponentScan("com.mycompany.spring")
    static class Config {

    }
}