package spotyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spotyTreasure.finalProject.entity.Actividad;


@Repository
public interface ActividadRespository extends JpaRepository<Actividad,Long> {
}
