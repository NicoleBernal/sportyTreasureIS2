package spotyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotyTreasure.finalProject.entity.Usuario;
import spotyTreasure.finalProject.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario guardarUsuario(Usuario usuario){ return usuarioRepository.save(usuario);}
    public Optional<Usuario> buscarUsuario(String documento){ return usuarioRepository.findByDocumento(documento);}
    public void actualizarUsuario(Usuario usuario){ usuarioRepository.save(usuario);}
    public void eliminarUsuario(Long id){usuarioRepository.deleteById(id);}

}
