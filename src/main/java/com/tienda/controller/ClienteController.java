package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import com.tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
     @Autowired
    private ClienteDao clienteIT;
      
      @GetMapping("/cliente/listado")
    public String inicio(Model model) {
   
        var clientes = clienteService.getClientes();
        
        model.addAttribute("clientes",clientes);

        return "/cliente/listado";

    }

    @GetMapping ("/Cliente/nuevo")
    public String nuevoCliente(Cliente cliente){
    return "/cliente/modifica";
}
    
    @PostMapping("cliente/guardar")
    public String guardarCliente(Cliente cliente){
    clienteService.save(cliente);
    return "redirect:/cliente/loistado";
}

      @GetMapping("/cliente/modificarCliente/{idCliente}")
       public String modificarCliente(Cliente cliente, Model model){ 
     
           cliente=  clienteService.getCliente(cliente.getIdCliente()).get();
 model.addAttribute("cliente",cliente);
              return"/cliente/modifica";
    }
    
             @GetMapping("/cliente/eliminar/{idCliente}")
       public String eliminarCliente(Cliente cliente){
      clienteService.delete(cliente);
       return "redirect:/cliente/listado";
    }
    
          @GetMapping("/cliente/modificarCliente/{apellido}")
       public String buscarporApellido (Cliente cliente, Model model){ 
           Cliente c=new Cliente();
           c=clienteIT.findByApellido(cliente.getApellido());
           model.addAttribute("clientes",c);
     return "redirect:/cliente/listado";
           
           
}
       
       
}