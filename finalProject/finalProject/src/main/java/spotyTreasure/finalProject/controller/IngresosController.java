package spotyTreasure.finalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import spotyTreasure.finalProject.entity.Usuario;
import spotyTreasure.finalProject.repository.UsuarioRepository;
import spotyTreasure.finalProject.service.UsuarioService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public  class IngresosController {
    private final UsuarioService usuarioService;
    private final UsuarioRepository usuarioRepository;
    @PostMapping("/ingresos")
    public String iniciarse(@RequestBody Usuario usuario){
        System.out.println("ENTRAMOS2");
        System.out.println(usuario.getUsuario());
        System.out.println(usuario.getContrasenia());
        Optional<Usuario> usuarioOptional = usuarioRepository.findByUsuario(usuario.getUsuario());
        System.out.println(usuarioOptional);
        Usuario usuarioTemp=usuarioOptional.get();

        System.out.println(usuarioTemp.getContrasenia()==usuario.getContrasenia());
        if(usuarioOptional.isPresent() && usuarioTemp.getContrasenia().equals(usuario.getContrasenia())){
            System.out.println("ENTRAMOS3");
            return "redirect:/home";
        }
        else
            return "inicioSesion";
    }
}
