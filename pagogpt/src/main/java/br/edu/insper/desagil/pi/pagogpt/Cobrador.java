package br.edu.insper.desagil.pi.pagogpt;

import java.util.List;

public class Cobrador {
    private List<Conversa> conversas;

    public Cobrador(List<Conversa> conversas) {
        this.conversas = conversas;
    }

    public double cobra(Usuario usuarioRecebido) {
        double total = 0.0;
        for (Conversa c : conversas) {
            Usuario u = c.getUsuario();
            if (u.getEmail().equals(usuarioRecebido.getEmail())) {
                total += c.calculaTotal();
            }
        }
        return total;
    }
}