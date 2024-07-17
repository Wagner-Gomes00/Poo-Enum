package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha uma Unidade Federativa pelo seu código (UF)");
		for (UFS ufs : UFS.values()) {
			System.out.println(ufs.name() + " - " + ufs.getnome());
		}
		System.out.println("Digite UF pelo código");
		String codigoUFS = scanner.next() .toUpperCase();

		try {
			UFS ufsEscolhida = UFS.valueOf(codigoUFS);
			System.out.println("vc escolheu: " +ufsEscolhida.getnome());
		} catch (IllegalArgumentException e){
			System.out.println("Código de UF inválido");
		}
		scanner.close();

	}

}
