package com.gabrielcdev.dslist.repositories;

import com.gabrielcdev.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}