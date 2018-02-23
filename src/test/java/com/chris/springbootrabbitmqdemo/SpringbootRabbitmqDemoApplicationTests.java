package com.chris.springbootrabbitmqdemo;

import com.chris.springbootrabbitmqdemo.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebAppConfiguration
public class SpringbootRabbitmqDemoApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads() {
    }

    @Test
    public void hello() throws Exception {
        sender.send();
    }

}
