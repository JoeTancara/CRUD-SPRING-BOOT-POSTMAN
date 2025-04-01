
package com.crud_estudiantes.repo;

import com.crud_estudiantes.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JOE
 */
@Repository
public interface EstudianteRepo extends JpaRepository<Estudiante, Integer>{
}