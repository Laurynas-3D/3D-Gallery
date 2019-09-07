package lt.laurynas.practical;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {

    @RequestMapping("/gal")
  //  @ResponseBody
    public String home() {
        return "gallery.html";
    }
}