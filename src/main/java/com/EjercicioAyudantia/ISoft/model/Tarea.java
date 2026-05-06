package com.EjercicioAyudantia.ISoft.model;

public record Tarea(
    Long id,
    String titulo,
    String prioridad,
    String fechaLimite,
    boolean completada
) {}
