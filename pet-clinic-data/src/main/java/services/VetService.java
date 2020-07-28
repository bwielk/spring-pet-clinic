package services;

import model.Owner;
import model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Owner, Long> {

    Vet findByLastName(String lastName);
    Vet findByFirstName(String name);

}
