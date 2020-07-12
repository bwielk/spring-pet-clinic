package services;

import model.Owner;
import model.Pet;

import java.util.Set;

public interface PetService {

    Set<Pet> findAll(long id);
    Pet findByName(String name);
    Pet findByOwner(Owner owner);
    Pet create(Pet pet);
}
