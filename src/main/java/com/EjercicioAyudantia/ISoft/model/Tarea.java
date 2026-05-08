package com.EjercicioAyudantia.ISoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tarea {

    final Long id;
    final String titulo;
    final String prioridad;
    String fechaLimite;
    boolean completada;
}
