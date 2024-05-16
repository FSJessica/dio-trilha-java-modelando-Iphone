package aparelhoIphone;

import papeisIphone.AparelhoTelefonico;
import papeisIphone.NavegadorInternet;
import papeisIphone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para um número");
    }

    @Override
    public void atender() {
        System.out.println("Número atendido!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Página inicial do navegador!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

