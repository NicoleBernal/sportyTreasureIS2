package spotyTreasure.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
    @RequestMapping("/")
    public String registarse(){
        return "registro";
    }


}
