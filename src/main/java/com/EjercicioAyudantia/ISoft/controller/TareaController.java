package com.EjercicioAyudantia.ISoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.dto.TareaDTO;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.service.TareaService;




@RestController
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @PostMapping("/task")
    public ResponseEntity<Tarea> crearTarea(@RequestBody TareaDTO entity) {
        Tarea nuevaTarea = tareaService.crearTarea(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaTarea);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Tarea>> buscarTarea(@RequestParam(required = false) String prioridad,
    @RequestParam(required = false) String titulo,
    @RequestParam(required = false) String fechaLimite) {
        List<Tarea> tareasBuscadas = tareaService.buscarTarea(prioridad, titulo, fechaLimite);
        return ResponseEntity.ok(tareasBuscadas);
    }

    @PatchMapping("/tasks/{id}/complete")
    public ResponseEntity<Object> marcarTarea(@PathVariable("id") Long idLong) {
        try{
            Tarea tareaMarcada = tareaService.marcarTarea(idLong);
            return ResponseEntity.ok(tareaMarcada);
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage() +" Hola");
        }
    }
}
