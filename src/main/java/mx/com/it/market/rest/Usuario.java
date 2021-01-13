package mx.com.it.market.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/usuario")
public class Usuario {
    
    @GetMapping(value = "/saludo")
    public String saludo(){
      
        return "Hola mundo";
    }
}
