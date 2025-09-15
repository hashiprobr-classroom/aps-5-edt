package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversaTest {

    @Test
    public void subTotalVazio() {
        Usuario u = new Usuario("Lebanan", "lebanan@exemplo.com");
        Conversa conversa = new Conversa(u);

        assertEquals(0.0, conversa.calculaTotal(), 0.0);
    }

    @Test
    public void subTotal() {
        Usuario u = new Usuario("Lucas", "lucas@exemplo.com");
        Conversa conversa = new Conversa(u);

        PromptGratuito pg1 = new PromptGratuito("abcdefghijk", 10);
        conversa.adiciona(pg1);

        PromptPago pp1 = new PromptPago("abc", 0.5);
        conversa.adiciona(pp1);

        PromptPago pp2 = new PromptPago("abc", 0.55);
        conversa.adiciona(pp2);

        assertEquals(14.15, conversa.calculaTotal(), 0.01);
    }

    @Test
    public void porPostVazio() {
        Usuario u = new Usuario("Lucas", "lucas@exemplo.com");
        Conversa conversa = new Conversa(u);
        try {
            conversa.calculaMedia();
        } catch (IllegalStateException e) {
            assertEquals("Nenhum prompt!", e.getMessage());
        }
    }

    @Test
    public void porPost() {
        Usuario u = new Usuario("Lucas", "lucas@exemplo.com");
        Conversa conversa = new Conversa(u);
        PromptGratuito pg1 = new PromptGratuito("abcdefghijk", 10);
        PromptPago pp1 = new PromptPago("abc", 0.5);
        PromptPago pp2 = new PromptPago("abc", 0.55);

        conversa.adiciona(pg1);
        conversa.adiciona(pp1);
        conversa.adiciona(pp2);

        assertEquals(4.7166667, conversa.calculaMedia(), 0.01);
    }
}

