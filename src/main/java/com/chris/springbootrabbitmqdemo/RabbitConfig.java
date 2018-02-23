package com.chris.springbootrabbitmqdemo;/*
 * Copyright (c) 201 3 , FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}