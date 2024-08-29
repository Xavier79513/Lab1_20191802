package com.example.lab1_20191802.Controller;

import com.example.lab1_20191802.beans.Datos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller1 {

    @RequestMapping(value = "paginaPrincipal", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal() {
        return "index";
    }
    @PostMapping("datos/guardar")
    public String guardar (Datos datos) {

        return "pagina2";
    }
}
