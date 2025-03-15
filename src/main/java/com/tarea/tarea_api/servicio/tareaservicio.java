package com.tarea.tarea_api.servicio;

import com.tarea.tarea_api.Model.tarea;
import com.tarea.tarea_api.repositorio.repositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tareaservicio {

    private final repositorio repositorio;

    public tareaservicio(repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public tarea salvartarea(tarea tarea){
        return repositorio.save(tarea);
    }

    public List<tarea> obtenerTareas(){
        return repositorio.findAll();
    }
    public tarea obtenerTarea(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public tarea cargartarea(Long id , tarea tarea){
        tarea.setId(id);
        return repositorio.save(tarea);
    }
    public void borrarTarea(Long id){
        repositorio.deleteById(id);
    }
}

