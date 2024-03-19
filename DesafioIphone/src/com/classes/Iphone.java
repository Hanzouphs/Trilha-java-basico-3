package com.classes;
import java.util.Scanner;

import com.interfaces.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica { 

    public void tocar(){System.out.println("Tocando musica.");}
    public void pausar(){System.out.println("Pausando musica.");}

    public void selecionarMusica(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual nome da musica que você deseja ouvir?");
        String musica = sc.nextLine();
        System.out.println("Musica selecionada: " + musica);

        sc.close();
    }

    public void ligar(){System.out.println("Chamando...");}
    public void atender(){System.out.println("Atendendo...");}
    public void iniciarCorreioVoz(){System.out.println("Iniciando correio por voz.");}

    public void exibirPagina(){System.out.println("Exibindo nova pagina.");}
    public void adicionarNovaAba(){System.out.println("Adicionando nova aba.");}
    public void atualizarPagina(){System.out.println("Atualizando pagina.");}
}
