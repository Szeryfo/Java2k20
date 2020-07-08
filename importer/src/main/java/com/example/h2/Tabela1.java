package com.example.h2;



import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tabela1")
public class Tabela1 {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wartosc")
    private String wartosc;

    @OneToOne(mappedBy = "tabela1")
    @JsonBackReference
    private Tabela2 tabela2;
    //listy przy many to many
    //dwie listy



}

