package com.example.jenkinsDemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.Assert

@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    fun contextLoads() {
    }
    @Test
    fun test(){
        val test = "test1"
        Assert.isTrue(test.equals("test"))
    }
}
