package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
    
    public Optional<Cliente> getCliente (long idCliente);
    
}
