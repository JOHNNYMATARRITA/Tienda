package com.tienda.service;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CategoriaServicelmpl implements CategoriaService {

    @Autowired
    private CategoriaDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista= (List<Categoria>) clienteDao.findAll();
       
        if(activos){lista.removeIf(e-> !e.isActivo() );}
        return lista;
    }

    @Override
    
    public void save(com.tienda.domain.Categoria cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(com.tienda.domain.Categoria cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> getCategoria(long idCategoria) {
     return clienteDao.findById(idCategoria);
    }



}
