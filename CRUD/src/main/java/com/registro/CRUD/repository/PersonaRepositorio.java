/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.registro.CRUD.repository;

import com.registro.CRUD.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jhon
 */
public interface PersonaRepositorio extends JpaRepository <Persona, Long>{

    
}
