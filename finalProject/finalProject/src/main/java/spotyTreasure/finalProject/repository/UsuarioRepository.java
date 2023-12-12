package spotyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotyTreasure.finalProject.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>, CrudRepository<Usuario,Long> {
        Optional<Usuario> findByUsuario(String usuario);
        Optional<Usuario> findByDocumento (String documento);

}
