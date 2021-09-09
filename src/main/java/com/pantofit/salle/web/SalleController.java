package com.pantofit.salle.web;
import com.pantofit.salle.dao.SalleRepository;
import com.pantofit.salle.entities.Salle;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class SalleController {
    private SalleRepository salleRepository;


    public SalleController(SalleRepository salleRepository){
        this.salleRepository=salleRepository;
    }

    @GetMapping(path="/getSalleCode/{code}")
    public  Long getSalle(@PathVariable(name="code") String code){
        Salle salle=this.salleRepository.findSalleByCode(code);
        if(salle!=null){
            System.out.println(salle.getId());
            return salle.getId();
        }
        else{
            return 0L;

        }


    }


}