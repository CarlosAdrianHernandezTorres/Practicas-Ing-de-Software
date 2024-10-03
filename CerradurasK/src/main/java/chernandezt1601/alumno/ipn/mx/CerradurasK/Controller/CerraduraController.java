package chernandezt1601.alumno.ipn.mx.CerradurasK.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import chernandezt1601.alumno.ipn.mx.CerradurasK.Controller.Modelo.CerraduraService;

import java.util.Map;

@RestController
@RequestMapping("/api/cerradura")
public class CerraduraController {
    
    private final CerraduraService cerraduraService;

    @Autowired
    public CerraduraController(CerraduraService cerraduraService){
        this.cerraduraService = cerraduraService;
    }

    //Endpoint para la cerradura de Kleene (REST)
    @GetMapping("/estrella/{n}")
    public Map<String, String> getCerraduraKleene(@PathVariable("n") int n){
        return cerraduraService.kleeneCerradura(n);
    }

    //Endpoint para la cerradura positiva (REST)
    @GetMapping("/positiva/{n}")
    public Map<String, String>getCerraduraPositiva(@PathVariable("n") int n){
        return cerraduraService.kleeneClausuraPositiva(n);
    }
}
