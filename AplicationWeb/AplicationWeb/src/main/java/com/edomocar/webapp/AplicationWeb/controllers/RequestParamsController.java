package com.edomocar.webapp.AplicationWeb.controllers;

import com.edomocar.webapp.AplicationWeb.models.dto.ParamDto;
import com.edomocar.webapp.AplicationWeb.models.dto.ParamMixDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "ALARM") String mensaje) {

        ParamDto param = new ParamDto();
        param.setMensaje(mensaje);
        return param;
    }

    @GetMapping("/var")
    public ParamDto bar(
            @RequestParam(defaultValue = "MICRONICS SATA MODELO I545") String texto,
            @RequestParam(name = "codigo", defaultValue = "8112") int codigo) {

        ParamDto params = new ParamDto();
        params.setMensaje(texto);
        params.setCodigo(codigo);
        return params;
    }

    /*Forma Directa de Optener los parametros */
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {

        ParamMixDto params = new ParamMixDto();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setName(request.getParameter("name"));

        return params;
    }
}
