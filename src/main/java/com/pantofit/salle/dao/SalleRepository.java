package com.pantofit.salle.dao;

import com.pantofit.salle.entities.Salle;
import com.pantofit.salle.web.SalleController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle,Long> {
    Salle findSalleByCode(String code);
}
