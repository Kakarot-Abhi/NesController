package com.game.controller.GameControllerServer.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public String getService(){
        return "MyController Service is Running " + System.currentTimeMillis();
    }
}
