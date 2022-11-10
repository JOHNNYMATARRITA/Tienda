package com.tienda.controller;

import com.tienda.service.articuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired

    private articuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando arquitectura mvc");

        var articulos = articuloService.getarticulos(true);

        model.addAttribute("articulos", articulos);

        return "index";

    }

}
