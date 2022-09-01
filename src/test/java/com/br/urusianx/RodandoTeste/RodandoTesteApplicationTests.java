package com.br.urusianx.RodandoTeste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RodandoTesteApplicationTests {

	@Test
	void validandoCPFValido() {
		var verdadeiro = ValidadorCPF.validar("01915078067");
		assertEquals(true, verdadeiro);
	}

	@Test
	void validandoCPFInalido() {
		var verdadeiro = ValidadorCPF.validar("01915078065");
		assertEquals(false, verdadeiro);
	}

}
