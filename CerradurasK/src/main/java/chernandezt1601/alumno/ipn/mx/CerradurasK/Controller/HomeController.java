package chernandezt1601.alumno.ipn.mx.CerradurasK.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Bienvenido a la aplicación Spring Boot del curso de Ingenieria de Software!";
    }
}
