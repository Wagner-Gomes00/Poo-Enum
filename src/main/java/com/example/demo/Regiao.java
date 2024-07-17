package com.example.demo;

import java.util.Scanner;

public enum Regiao {
    NORTE("Norte", new String[] { "AC", "AP", "AM", "PA", "RO", "RR", "TO" }),
    NORDESTE("Nordeste", new String[] { "AL", "BA", "CE", "MA", "PB", "PE", "PI", "RN", "SE" }),
    CENTRO_OESTE("Centro-Oeste", new String[] { "GO", "MS", "MT", "DF" }),
    SUDESTE("Sudeste", new String[] { "ES", "MG", "RJ", "SP" }),
    SUL("Sul", new String[] { "PR", "RS", "SC" });

    private String nome;
    private String[] estados;

    Regiao(String nome, String[] estados) {
        this.nome = nome;
        this.estados = estados;
    }

    public String getNome() {
        return nome;
    }

    public String[] getEstados() {
        return estados;
    }

    public static void imprimirEstados(String nomeRegiao) {

        for (Regiao regiao : Regiao.values()) {
            if (regiao.getNome().equalsIgnoreCase(nomeRegiao)) {
                System.out.println("Estados da região " + nomeRegiao + ":");
                for (String estado : regiao.getEstados()) {
                    System.out.println(estado);

                }
                return;
            }
        }
        System.out.println("Região não encontrada.");
    }
}
