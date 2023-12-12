package spotyTreasure.finalProject.entity;
import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="estaciones")
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_estacion;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String geolocalizacion;
    @OneToOne
    private Actividad actividad;
    @OneToOne
    private Pista pista;


    public Actividad siguienteActividad(){
        return actividad;
    }

}
