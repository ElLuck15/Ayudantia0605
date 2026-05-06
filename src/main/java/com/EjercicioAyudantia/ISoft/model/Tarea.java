package com.EjercicioAyudantia.ISoft.model;

import lombok.Getter;

@Getter
public class Tarea {
    Long id;
    String titulo;
    String prioridad;
    String fechaLimite;
    boolean completada;

    public Tarea(Long id, String titulo, String prioridad, String fechaLimite,boolean completada){
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completada = completada;
    }
}
