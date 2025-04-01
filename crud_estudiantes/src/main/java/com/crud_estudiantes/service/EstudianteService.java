package com.crud_estudiantes.service;

import com.crud_estudiantes.entity.Estudiante;
import com.crud_estudiantes.repo.EstudianteRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author JOE
 */

@Service
public class EstudianteService{
    @Autowired
    private EstudianteRepo estudianterepo;
    
    public Estudiante insertar(Estudiante est){
        return estudianterepo.save(est);
    }
    
    public Estudiante actualizar(Estudiante est){
        if(estudianterepo.existsById(est.getCodigo())){
            return estudianterepo.save(est);
        } else {
            throw new RuntimeException("No se encontró el estudiante con ID: " + est.getCodigo());
        }
    }

    public List<Estudiante> listar(){
        return estudianterepo.findAll();
    }
    
    public void eliminar(Integer id){
        estudianterepo.deleteById(id);
    }


    public Optional<Estudiante> buscarPorId(Integer id){
        return estudianterepo.findById(id);
    }
}