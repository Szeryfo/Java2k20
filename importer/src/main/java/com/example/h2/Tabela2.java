package com.example.h2;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "tabela2")
public class Tabela2 {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wartosc")
    private String wartosc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tabela1")
    private Tabela1 tabela1;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWartosc() {
        return wartosc;
    }

    public void setWartosc(String wartosc) {
        this.wartosc = wartosc;
    }

    public Tabela1 getTabela1() {
        return tabela1;
    }

    public void setTabela1(Tabela1 tabela1) {
        this.tabela1 = tabela1;
    }
}