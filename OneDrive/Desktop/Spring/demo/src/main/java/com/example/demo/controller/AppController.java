package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.AppService;
import com.example.demo.model.AppModel;

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
    @GetMapping("/getById/{id}")
    public AppModel getById(@PathVariable Long id) {
        return service.getById(id);
    }
    @PostMapping("/update/{id}")
    public AppModel update(@PathVariable Long id, @RequestBody AppModel table){
        return service.updateById(id, table);
    }
    
}