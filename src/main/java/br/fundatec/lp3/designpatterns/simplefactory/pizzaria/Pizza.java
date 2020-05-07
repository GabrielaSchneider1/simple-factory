package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class Pizza {

	public void preparar() {
		System.out.println("Preparando Pizza");
	}

	public void cozinhar() {
		System.out.println("Assando por 25 min. a 350 graus");
	}

	public void cortar() {
		System.out.println("Cortando em fatias diagonais");
	}

	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}

}
