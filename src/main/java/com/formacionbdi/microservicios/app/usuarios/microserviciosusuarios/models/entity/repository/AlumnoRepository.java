package com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.models.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.models.entity.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	@Query("Select a from Alumno as a where a.nombre like %?1% or a.apellido like %?1%")
	public List<Alumno> finddByNombreOrApellido(String termino);
	
}
