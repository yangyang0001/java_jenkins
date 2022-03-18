package com.deepblue.classloader;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@Component
public class Parent {

    private Child child;

    public Parent() throws InterruptedException {
        System.out.println("parent constructor invoke");
        Thread.sleep(10000L);
    }

    {
        System.out.println("parent instance invoke");
        Thread.sleep(10000L);
    }
}
