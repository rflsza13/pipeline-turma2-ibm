package com.br.urusianx.RodandoTeste;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RodandoTesteApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Informe o CPF: ");

		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		String cpf = reader.readLine();
		
		System.out.println("O CPF digitado é: " + (ValidadorCPF.validar(cpf)));
	}

}
