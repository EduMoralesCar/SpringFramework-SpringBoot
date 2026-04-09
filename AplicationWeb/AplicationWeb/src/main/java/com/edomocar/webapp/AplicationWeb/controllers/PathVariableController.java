package com.edomocar.webapp.AplicationWeb.controllers;

import com.edomocar.webapp.AplicationWeb.models.User;
import com.edomocar.webapp.AplicationWeb.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    // Atributos de config.properties
    @Value("${config.name}")
    private String name;

    @Value("${config.code}")
    private int code;

    @Value("${config.message}")
    private String message;

    @Value("${config.listValue}")
    private String[] listValue;

    // Atributos de values.properties
    @Value("${values.nombre}")
    private String nombre;

    @Value("${values.codigo}")
    private int codigo;

    @Value("${values.mensaje}")
    private String mensaje;

    @Value("${values.lista}")
    private String[] lista;


    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable("message") String message) {

        ParamDto param = new ParamDto();
        param.setMensaje(message);
        return param;
    }

    // Ahora pasaremos multiples parametros de la ruta @PathVariable
    @GetMapping("/mix/{product}/{code}")
    public Map<String, Object> mix(@PathVariable String product, @PathVariable int code) {

        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("code", code);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // Hacer algo con el usuario save en la bbdd
        return user;
    }

    @GetMapping("/config")
    public Map<String, Object> config() {

        Map<String, Object> json = new HashMap<>();
        json.put("name", name);
        json.put("code", code);
        json.put("message", message);
        json.put("listValue", listValue);

        return json;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {

        Map<String, Object> json = new HashMap<>();
        json.put("nombre", nombre);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("lista", lista);

        return json;
    }
}
