package oo.composicao;

public class CarroTest {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		c1.ligar();
		System.out.println(c1.estaLigado());
		/* 
		 * Carro não consegue acessar giro do motor, pois motor é outra classe
		 * Mas se chamarmos o objeto carro, teremos acesso ao objeto motor e consequentemente acesso
		 * a seus atributos e métodos, como se fosse o objeto System que chama o objeto out
		 * */ 
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
	}
}
