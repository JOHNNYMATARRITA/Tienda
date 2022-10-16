package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ClienteServicelmpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<com.tienda.domain.Cliente> getClientes() {
        return (List <Cliente> clienteDao.findAll())
    }

    @Override
    public void save(com.tienda.domain.Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void delete(com.tienda.domain.Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public void Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object <error>(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
