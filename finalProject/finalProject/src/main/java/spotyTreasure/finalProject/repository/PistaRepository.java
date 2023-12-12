package spotyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spotyTreasure.finalProject.entity.Pista;

@Repository
public interface PistaRepository extends JpaRepository <Pista,Long> {
}
