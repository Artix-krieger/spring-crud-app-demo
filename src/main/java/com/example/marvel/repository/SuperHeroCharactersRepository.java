package com.example.marvel.repository;

import com.example.marvel.models.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroCharactersRepository extends JpaRepository<Characters,Integer> {

}
