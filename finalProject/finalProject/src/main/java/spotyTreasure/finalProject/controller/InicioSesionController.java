package spotyTreasure.finalProject.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioSesionController {
    @RequestMapping("/login")

    public String iniciarSesion(){
        return "inicioSesion";
    }
}
