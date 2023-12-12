package spotyTreasure.finalProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
public class HomeController {
    @GetMapping("/home")
    public  String homeIniciar(){
        System.out.println("SI ENTRO ACA");
        return "home";
    }
}*/
@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<String> actualizarUbicacion(@RequestBody UbicacionRequest ubicacionRequest) {
        // Aquí puedes procesar los datos de ubicación como sea necesario
        System.out.println("ENTRAMOS4s");
        double latitud = ubicacionRequest.getLatitud();
        double longitud = ubicacionRequest.getLongitud();

        // Puedes realizar operaciones adicionales, almacenar en una base de datos, etc.

        // Devolver una respuesta al cliente
        return new ResponseEntity<>("Ubicación actualizada correctamente", HttpStatus.OK);
    }

    // Clase para representar la solicitud de ubicación en formato JSON
    public static class UbicacionRequest {
        private double latitud;
        private double longitud;

        // Getters y setters

        public double getLatitud() {
            return latitud;
        }

        public void setLatitud(double latitud) {
            this.latitud = latitud;
        }

        public double getLongitud() {
            return longitud;
        }

        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }
    }
}
