package services;

import model.Owner;
import model.Vet;

import java.util.Set;

public interface VetService {

    Set<Vet> findAll(long id);
    Vet findByLastName(String lastName);
    Vet findByFirstName(String name);
    Vet create(Vet owner);

}
