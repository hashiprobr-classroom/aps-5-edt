package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PromptPagoTest {

    @Test
    public void constroi() {
        PromptPago p = new PromptPago("pergunta", 0.5);
        assertEquals("pergunta", p.getPergunta());
        assertNull(p.getResposta());
    }

    @Test
    public void mudaResposta() {
        PromptPago p = new PromptPago("xyz", 1.0);
        p.setResposta("minhaResposta");
        assertEquals("minhaResposta", p.getResposta());
    }

    @Test
    public void preco() {
        PromptPago p = new PromptPago("pergunta", 0.1);
        assertEquals(0.8, p.calculaPreco(), 0.01);
    }
}
