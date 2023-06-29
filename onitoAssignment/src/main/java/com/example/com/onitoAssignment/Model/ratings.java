package com.example.com.onitoAssignment.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "rating")

public class ratings {

    @Id
    @Column(name = "tconst")
    private String tconst ;

    @Column(name = "averagerating")
    private Double  averageRating ;

    @Column(name = "numvotes")
    private Integer numVotes ;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    private movies movies;



}
