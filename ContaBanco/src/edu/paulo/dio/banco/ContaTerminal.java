package edu.paulo.dio.banco;

/**
 * @author paulo
 * @version 1.0
 * @since 2024
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO Importar a classe scaner e locale
		try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
			//TODO exibir mensagens solicitando dados
			System.out.println("Digite o Número da conta : ");
			int numeroConta = scanner.nextInt();
			System.out.println("Digite o numero da Agencia");
			String agencia = scanner.next();
			System.out.println("Digite seu nome: ");
			String nome = scanner.next();
			float saldo = (float) 245.68;
			//TODO imprimir informaçõe na tela
			System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
					+ " Sua conta é " + numeroConta + " e seu saldo de R$" + saldo + " já esta disponível");
		}

	}

}
