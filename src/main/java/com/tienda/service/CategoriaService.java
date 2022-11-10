package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public void save (Categoria cliente);
    
    public void delete (Categoria cliente);
    
    public Optional<Categoria> getCategoria (long idCategoria);
    
}
