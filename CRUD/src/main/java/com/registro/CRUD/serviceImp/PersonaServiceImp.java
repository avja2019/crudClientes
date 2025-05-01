/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.registro.CRUD.serviceImp;

import com.registro.CRUD.model.Persona;
import com.registro.CRUD.repository.PersonaRepositorio;
import com.registro.CRUD.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhon
 */
@Service
public class PersonaServiceImp implements PersonaService{
    @Autowired
    private PersonaRepositorio personaRepository;

    @Override
    public List<Persona> listarTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona obtenerId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
         personaRepository.deleteById(id);
    }
}
