package com.example.com.onitoAssignment.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class movies {
    @Id
    @Column(name = "tconst")
    private String tconst;

    @Column(name = "titletype" , columnDefinition = "VARCHAR(255)")
    private String titletype;

    @Column(name = "primarytitle", columnDefinition = "VARCHAR(255)")
    private String primaryTitle ;

    @Column(name = "runtimeminutes")
    private Integer runtimeMinutes;

    @Column(name = "genres", columnDefinition = "VARCHAR(255)")
    private  String genres ;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "tconst")
   private ratings rating ;


}
