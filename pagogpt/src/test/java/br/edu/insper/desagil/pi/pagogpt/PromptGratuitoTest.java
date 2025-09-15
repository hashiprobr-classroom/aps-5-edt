package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromptGratuitoTest {

    @Test
    public void precoCurto() {
        PromptGratuito p = new PromptGratuito("pergunta", 10);
        assertEquals(0.0, p.calculaPreco(), 0.0);
    }

    @Test
    public void precoLongo() {
        PromptGratuito p = new PromptGratuito("pergunta longa", 10);
        assertEquals(14.0, p.calculaPreco(), 0.0);
    }
}
