package com.example.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Map<String, String> hello() {
        logger.info("Se recibió una solicitud GET en /hello");

        // Puedes agregar un log de depuración
        logger.debug("Preparando respuesta con el mensaje 'Hello World'");

        // Simulamos una condición para log de error (solo como demostración)
        if (Math.random() < 0.1) {
            logger.error("Simulación de error en el controlador /hello");
        }

        return Map.of("message", "Hello World");
    }
}
