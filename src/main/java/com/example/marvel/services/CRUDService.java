package com.example.marvel.services;

import com.example.marvel.models.Characters;
import com.example.marvel.repository.SuperHeroCharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CRUDService {

    @Autowired
    SuperHeroCharactersRepository superHeroCharactersRepository;
    public void createSuperHero(Characters character) {
        superHeroCharactersRepository.save(character);
    }

    public Characters readSuperHeroById(int val) {
        return superHeroCharactersRepository.findById(val).get();
    }

    public void updateSuperHeroHumanName(Characters superhero, @RequestParam(name = "id") int id) {
        Characters superHeroToBeUpdated = readSuperHeroById(id);
        superHeroToBeUpdated.setHumanName(superhero.getHumanName());
        superHeroCharactersRepository.save(superHeroToBeUpdated);
    }

    public void deleteSuperHero(int id) {
        superHeroCharactersRepository.deleteById(id);
    }
}
