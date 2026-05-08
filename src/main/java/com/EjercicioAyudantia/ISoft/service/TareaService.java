package com.EjercicioAyudantia.ISoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.EjercicioAyudantia.ISoft.dto.TareaDTO;
import com.EjercicioAyudantia.ISoft.model.Tarea;

@Service
public class TareaService {
    private List<Tarea> tareas = new ArrayList<Tarea>();
    private Long id = 1L;

    private void agregarTareaALista(Tarea tarea){
        tareas.add(tarea);
    }

    public Tarea crearTarea(TareaDTO dto){
        Tarea tarea = new Tarea(id++,dto.getTitulo(),dto.getPrioridad(),dto.getFechaLimite(),false);
        agregarTareaALista(tarea);
        return tarea;
    }
    public List<Tarea> buscarTarea(String prioridad, String titulo,String fechaLimite){
        return tareas.stream().filter(tarea -> prioridad == null|| prioridad.isBlank() ||tarea.getPrioridad().equalsIgnoreCase(prioridad))
        .filter(tarea -> titulo == null||titulo.isBlank()||tarea.getTitulo().equalsIgnoreCase(titulo))
        .filter(tarea -> fechaLimite == null||fechaLimite.isBlank() || tarea.getFechaLimite().equalsIgnoreCase(fechaLimite)).toList();
    }

    public Tarea marcarTarea(Long idLong){
        Tarea tareaCompletada = tareas.stream().filter(tarea -> tarea.getId() == idLong).findFirst().get();
        tareaCompletada.setCompletada(true);
        return tareaCompletada;
    }
}
