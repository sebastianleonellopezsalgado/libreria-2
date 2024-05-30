package com.libreria.repository;

import com.libreria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByFechaDeFallecimientoGreaterThan(Integer fechaDeFallecimiento);
}
