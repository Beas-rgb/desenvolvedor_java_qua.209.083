package com.eventos.app.repository;

import com.eventos.app.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventosRepository extends CrudRepository<Evento, String> {
}