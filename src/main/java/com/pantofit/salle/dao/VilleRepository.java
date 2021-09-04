package com.pantofit.salle.dao;

import com.pantofit.salle.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {
}
