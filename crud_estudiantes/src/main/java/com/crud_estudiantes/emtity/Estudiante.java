
package com.crud_estudiantes.entity;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author JOE
 */
@Entity
@Table(name="estudiante")
public class Estudiante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(unique = true, length = 13, nullable = false)
    private String cedula;

    private Integer edad;
    private String telefono;
    private Date fecha_nacimiento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}