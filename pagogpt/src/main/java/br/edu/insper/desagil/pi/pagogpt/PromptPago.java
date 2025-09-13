package br.edu.insper.desagil.pi.pagogpt;

public class PromptPago extends Prompt {
    private double fator;

    public PromptPago(String pergunta, double fator) {
        super(pergunta);
        this.fator = fator;
    }

    @Override
    public double calculaPreco() {
        int tamanho = getPergunta().length();
        return fator * tamanho;
    }
}

