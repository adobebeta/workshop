package com.example.workshop.feature1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sayHello(){
        HelloResponse response = restTemplate.getForObject(
                "/hello/test", HelloResponse.class);

        //Validate เป็นการตรวจสอบ ว่า output ที่ออกมาด้วย inputนี้จะได้อะไรกลับมา มันจะต้องออกตามนี้
        assertEquals("Hello test", response.getMessage());
    }


//    public void exampleTest() {
//        String body = this.restTemplate.getForObject("/", String.class);
//        assertThat(body).isEqualTo("Hello World");
//    }

}