package com.github.buuhsmead.openshift.fabric8.jboss;

public class HelloService {

    String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }

}