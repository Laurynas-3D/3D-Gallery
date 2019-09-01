package lt.laurynas.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class PracticalApplication extends SpringBootServletInitializer {

    @RequestMapping("/")
    public @ResponseBody
    String root() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(PracticalApplication.class, args);
    }

}
