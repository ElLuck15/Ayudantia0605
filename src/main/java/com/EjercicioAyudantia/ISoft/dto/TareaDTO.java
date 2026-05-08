package com.EjercicioAyudantia.ISoft.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class TareaDTO {
    String titulo;
    String prioridad;
    String fechaLimite;
}
