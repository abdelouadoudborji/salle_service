package com.pantofit.salle.entities;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


import javax.persistence.*;
import java.util.Set;
@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data
@EqualsAndHashCode(exclude="ville")
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String Code;
    @Column(length = 75)
    private String nom; 
    private double latitude;
    private double longitude;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "salle")
    private Set<Media> MediaList ;
    @JsonIgnore
    @ManyToOne
    private Ville ville;

}
