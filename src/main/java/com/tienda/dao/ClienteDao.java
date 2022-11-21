package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

    @Query("select c from Cliente c where c.apellido= :apellido")
     Cliente findByApellido(String apellido);
}
