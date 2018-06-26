package com.cloud.demo;


import com.cloud.demo.swagger2.Swagger2Test;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/21 上午10:26
 * @modified
 */
@AutoConfigureMockMvc
@AutoConfigureRestDocs(outputDir = "target/generated-snippets")
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = AppServerUserApplication.class)
public class AppServerUserApplicationTest {

    @Autowired
    private Swagger2Test swagger2Test;

    @After
    public void TestSwagger() throws Exception {
        swagger2Test.Test();
    }

    @Test
    public void TestApi() throws Exception {
        swagger2Test.TestApi();

    }

}
