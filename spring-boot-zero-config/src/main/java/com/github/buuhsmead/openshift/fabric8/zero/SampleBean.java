package com.github.buuhsmead.openshift.fabric8.zero;

// https://github.com/apache/camel/blob/master/examples/camel-example-spring-boot/src/main/java/sample/camel/SampleBean.java

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class SampleBean {
    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return say;
    }
}
