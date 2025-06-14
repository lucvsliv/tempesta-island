package com.lucvs.temperium.repository;

import com.lucvs.temperium.dto.Tempino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TempinoRepository extends JpaRepository<Tempino, Long> {

    Optional<Tempino> findByName(String name);
}
