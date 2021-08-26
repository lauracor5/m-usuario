package com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.controllers;

import com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.models.entity.Alumno;
import com.formacionbdi.microservicios.app.usuarios.microserviciosusuarios.services.AlumnoService;
import com.formacionbdi.microservicios.commons.controllers.CommonController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController extends CommonController<Alumno, AlumnoService> {
  

    @PutMapping("/{id}")
    public ResponseEntity<?> editar (@RequestBody Alumno alumno, @PathVariable Long id){
        Optional<Alumno> alumno1 = service.findById(id);
        if(alumno1.isEmpty()){
            ResponseEntity.notFound().build();
        }
        Alumno alumnoDb = alumno1.get();
        alumnoDb.setNombre(alumno.getNombre());
        alumnoDb.setApellido(alumno.getApellido());
        alumnoDb.setEmail(alumno.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumno));
    }

    @GetMapping("/filtrar/{term}")
    public ResponseEntity<?> filtar(@PathVariable String term ){
    	return ResponseEntity.ok(service.finddByNombreOrApellido(term));
    }

}
