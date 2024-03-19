package com.classes;
public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }

}
