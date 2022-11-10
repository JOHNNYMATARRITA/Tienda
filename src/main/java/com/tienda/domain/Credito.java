package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="credito")

public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
  
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="id_credito")
    private Long idCredito;
    private Long limite;

    public Credito() {
    }

    public Credito(Long limite) {
        this.limite=limite;
        
        
    }

}
