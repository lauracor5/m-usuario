package com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.services;

import java.util.List;

import com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.services.CommonService;


public interface AlumnoService extends CommonService<Alumno>{

	
	public List<Alumno> finddByNombreOrApellido(String termino);

}
