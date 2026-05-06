package com.EjercicioAyudantia.ISoft.controller;

import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.dto.TareaDTO;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.service.TareaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;



@RestController
public class TareaController {

    private final TareaService tareaService = new TareaService();

    @PostMapping("/crearTarea")
    public ResponseEntity<Tarea> creaTarea(@RequestBody TareaDTO entity) {
        Tarea nuevaTarea = tareaService.crearTarea(entity);
        return ResponseEntity.ok(nuevaTarea);
    }

}
