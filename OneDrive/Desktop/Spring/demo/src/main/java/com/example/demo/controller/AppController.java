package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AppService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.AppModel;
import java.util.List;
@RestController
public class AppController {
    @Autowired
    AppService service;
    @PostMapping("/create")
    public AppModel create(@RequestBody AppModel take1){
       return service.create(take1);
    }
    @GetMapping ("/getAll")
    public List<AppModel> getAll(){
        return service.getAll();
    }
    
    
}