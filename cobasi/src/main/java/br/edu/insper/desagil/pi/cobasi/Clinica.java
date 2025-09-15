package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private final List<Historico> historicos;

    private static final int CACHORRO = 0;
    private static final int GATO = 1;
    private static final int COBRA = 2;
    private static final int ELEFANTE = 3;

    public Clinica() {
        this.historicos = new ArrayList<>();
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void addHistoricoCachorro(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String tipoBanho) {
        addHistorico(CACHORRO, nomeTutor, nome, dataNascimento, peso, tipoBanho);
    }

    public void addHistoricoGato(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String doenca) {
        addHistorico(GATO, nomeTutor, nome, dataNascimento, peso, doenca);
    }

    public void addHistoricoCobra(String nomeTutor, String nome, LocalDate dataNascimento, double peso, boolean venenosa) {
        addHistorico(COBRA, nomeTutor, nome, dataNascimento, peso, Boolean.toString(venenosa));
    }

    public void addHistoricoElefante(String nomeTutor, String nome, LocalDate dataNascimento, double peso, int pesoComida) {
        addHistorico(ELEFANTE, nomeTutor, nome, dataNascimento, peso, Integer.toString(pesoComida));
    }

    private void addHistorico(int especie, String nomeTutor, String nome, LocalDate dataNascimento, double peso, String extraInfo) {
        historicos.add(new Historico(nomeTutor, nome, especie, dataNascimento, peso, extraInfo));
    }
}
