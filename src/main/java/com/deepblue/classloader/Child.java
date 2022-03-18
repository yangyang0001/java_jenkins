package com.deepblue.classloader;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@Component
public class Child {

    private Parent parent;

    public Child() throws InterruptedException {
        System.out.println("child constructor invoke");
        Thread.sleep(10000L);
    }

    {
        System.out.println("child instance invoke");
        Thread.sleep(10000L);
    }

}
