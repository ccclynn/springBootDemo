package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试springBoot
 * @author Austin
 */
@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {

	
	@RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
