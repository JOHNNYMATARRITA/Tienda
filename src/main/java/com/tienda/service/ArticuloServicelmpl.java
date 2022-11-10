package com.tienda.service;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ArticuloServicelmpl implements ArticuloService {

    @Autowired
    private ArticuloDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activos) {
        var lista= (List<Articulo>) clienteDao.findAll();
  
        if(activos){lista.removeIf(e −> ! e.isActivo() );}
        return lista;
    }

    @Override
    
    public void save(com.tienda.domain.Articulo cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(com.tienda.domain.Articulo cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Articulo> getArticulo(long idArticulo) {
     return clienteDao.findById(idArticulo);
    }



}
