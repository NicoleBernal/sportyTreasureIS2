package spotyTreasure.finalProject.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuarios")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String documento;
    private String nombre;
    private String apellido;
    private String usuario;
    private  int edad;
    private String telefono;
    private String correo;
    private String contrasenia;
    private UsuarioRole rol;
    private String geolocalizacion;

}
