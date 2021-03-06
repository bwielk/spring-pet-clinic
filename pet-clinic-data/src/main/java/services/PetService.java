package services;

import model.Owner;
import model.Pet;

import java.util.Set;

public interface PetService  extends CrudService<Pet, Long>{
    Pet findByName(Owner owner);
    Pet findByOwner(Owner owner);
}
