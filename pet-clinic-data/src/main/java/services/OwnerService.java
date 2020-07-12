package services;

import model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll(long id);
    Owner findByLastName(String lastName);
    Owner findByFirstName(String name);
    Owner create(Owner owner);

}
