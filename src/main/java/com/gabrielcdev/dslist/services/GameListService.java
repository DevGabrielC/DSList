package com.gabrielcdev.dslist.services;

import com.gabrielcdev.dslist.dto.GameDTO;
import com.gabrielcdev.dslist.dto.GameListDTO;
import com.gabrielcdev.dslist.dto.GameMinDTO;
import com.gabrielcdev.dslist.entities.Game;
import com.gabrielcdev.dslist.entities.GameList;
import com.gabrielcdev.dslist.repositories.GameListRepository;
import com.gabrielcdev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
