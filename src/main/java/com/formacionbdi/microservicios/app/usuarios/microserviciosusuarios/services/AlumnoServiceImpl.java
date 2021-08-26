package com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.services;


import com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.models.entity.repository.AlumnoRepository;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;
import com.formacionbdi.springboot.microservicios.commons.alumnos.models.entity.Alumno;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> finddByNombreOrApellido(String termino) {		
		return repository.finddByNombreOrApellido(termino);
	}

   
}
