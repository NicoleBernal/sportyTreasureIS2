package spotyTreasure.finalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spotyTreasure.finalProject.entity.Usuario;
import spotyTreasure.finalProject.repository.UsuarioRepository;
import spotyTreasure.finalProject.service.UsuarioService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class registrosController {
    private final UsuarioService usuarioService;

    private final UsuarioRepository usuarioRepository;
    @PostMapping("/registros")
    public String guardarUnsuario(@RequestBody Usuario usuario){
        if (usuarioService.buscarUsuario(usuario.getDocumento()).isPresent()){
            System.out.println("El usuario ya existe en la base de datos.");
        }
        else{
            if(usuarioRepository.findByUsuario(usuario.getUsuario()).isEmpty())
                usuarioService.guardarUsuario(usuario);
                System.out.println("Usuario guardado exitosamente.");
        }
        System.out.println("ENTRAX3");
        return "redirect:/login";
    }

}
