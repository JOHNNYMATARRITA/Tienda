package com.tienda.controller;

import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;

        @Autowired
    private ArticuloService categoriaService;
        
    @GetMapping("/articulo/listado")
    public String inicio(Model model) {
   
        var articulos = articuloService.getArticulos(false);
        
        model.addAttribute("articulos",articulos);

        return "/articulo/listado";

    }

    @GetMapping ("/Articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model model){
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias", categorias);
    return "/articulo/modifica";
}
    
    @PostMapping("articulo/guardar")
    public String guardarArticulo(Articulo articulo){
    articuloService.save(articulo);
    return "redirect:/articulo/listado";
}

      @GetMapping("/articulo/modificarArticulo/{idArticulo}")
       public String modificarArticulo(Articulo articulo, Model model){ 
     
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias", categorias);
              return"/articulo/modifica";
    }
    
             @GetMapping("/articulo/eliminar/{idArticulo}")
       public String eliminarArticulo(Articulo articulo){
      articuloService.delete(articulo);
       return "redirect:/articulo/listado";
    }
    
}
