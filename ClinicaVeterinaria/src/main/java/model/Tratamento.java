package model;

/**
 *
 * @author Victor Calebe
 */

import java.util.Calendar;

public class Tratamento {
    private int id;
    private String nome;
    private Calendar dtInicio;
    private Calendar dtFim;
    private int idAnimal;
    private boolean terminou;

    public Tratamento(int id, String nome, Calendar dtInicio, Calendar dtFim, int idAnimal, boolean terminou) {
        this.id = id;
        this.nome = nome;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.idAnimal = idAnimal;
        this.terminou = terminou;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Calendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Calendar getDtFim() {
        return dtFim;
    }

    public void setDtFim(Calendar dtFim) {
        this.dtFim = dtFim;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public boolean isTerminou() {
        return terminou;
    }

    public void setTerminou(boolean terminou) {
        this.terminou = terminou;
    }
    
    
}
