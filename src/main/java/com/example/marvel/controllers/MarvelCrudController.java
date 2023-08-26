package com.example.marvel.controllers;

import com.example.marvel.models.Characters;
import com.example.marvel.services.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarvelCrudController {

    @Autowired
    CRUDService crudService;
    @PostMapping(path = "create")
    public void createSuperHero(@RequestBody Characters superhero) {
        crudService.createSuperHero(superhero);
    }

    //localhost:8080/read?id=1
    @GetMapping("read")
    public Characters readSuperHeroById(@RequestParam(name = "id") int val) {
        return crudService.readSuperHeroById(val);
    }

    @PutMapping("update")
    public void updateSuperHeroHumanName(@RequestBody Characters superhero, int id) {
        crudService.updateSuperHeroHumanName(superhero,id);
    }

    @DeleteMapping("delete")
    public void deleteSuperHero(@RequestParam(name = "id") int id) {
        crudService.deleteSuperHero(id);
    }
}
