package com.tarea.tarea_api.Controlador;

import com.tarea.tarea_api.Model.tarea;
import com.tarea.tarea_api.servicio.tareaservicio;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("Api/tarea")
public class controlador {

    private final tareaservicio tareaservicio;

    public controlador(tareaservicio tareaservicio) {
        this.tareaservicio =tareaservicio;
    }

    @PostMapping
    public tarea agregarTarea(@Valid @RequestBody tarea tarea){
        return tareaservicio.salvartarea(tarea);
    }
    @GetMapping
    public List<tarea> listarTareas(){
        return tareaservicio.obtenerTareas();
    }
    @GetMapping("/{id}")
    public tarea obtenerTarea(@PathVariable Long id,@Valid @RequestBody tarea tarea){
        return tareaservicio.obtenerTarea(id);
    }
    @PutMapping("/{id}")
    public tarea actualizarTarea(@PathVariable Long id,@Valid @RequestBody tarea tarea){
        return tareaservicio.cargartarea(id,tarea);
    }
    @DeleteMapping("/{id}")
    public String eliminarTarea(@PathVariable Long id){
        tareaservicio.borrarTarea(id);
        return "Tarea eliminada con Exito";
    }
}
