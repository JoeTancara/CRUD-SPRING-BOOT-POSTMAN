
package com.crud_estudiantes.controller;

import com.crud_estudiantes.entity.Estudiante;
import com.crud_estudiantes.service.EstudianteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author JOE
 * SERVICIO DEL BACKEND A TRAVES DE TIPO REST
 */
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteservice;
    
    @GetMapping
    public List<Estudiante> listar(){
        return estudianteservice.listar();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> buscarPorId(@PathVariable Integer id){
        return estudianteservice.buscarPorId(id);
    }

    @PostMapping
    public Estudiante insertar(@RequestBody Estudiante est){
        return estudianteservice.insertar(est);
    }

    @PutMapping
    public Estudiante actualizar(@RequestBody Estudiante est){
        return estudianteservice.actualizar(est);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        estudianteservice.eliminar(id);
    }

}
