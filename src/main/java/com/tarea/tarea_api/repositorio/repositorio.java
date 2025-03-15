package com.tarea.tarea_api.repositorio;

import com.tarea.tarea_api.Model.tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorio extends  JpaRepository<tarea,Long> {

}

