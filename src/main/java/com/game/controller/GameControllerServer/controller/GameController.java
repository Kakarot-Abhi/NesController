package com.game.controller.GameControllerServer.controller;

import com.game.controller.GameControllerServer.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game-controller")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/getStatus")
    public String getServiceStatus(){
        return gameService.getService();
    }
}
