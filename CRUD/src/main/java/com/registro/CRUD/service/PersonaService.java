/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.registro.CRUD.service;

import com.registro.CRUD.model.Persona;
import java.util.List;

/**
 *
 * @author Jhon
 */
public interface PersonaService {
    public List<Persona> listarTodas();
    public Persona guardar(Persona persona);
    public Persona obtenerId(Long id);
    public void eliminar(Long id);
}
