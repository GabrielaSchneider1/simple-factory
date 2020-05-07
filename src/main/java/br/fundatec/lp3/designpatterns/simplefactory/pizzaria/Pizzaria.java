package br.fundatec.lp3.designpatterns.simplefactory.pizzaria;

public class Pizzaria {

	public Pizzaria() {
	}

	public Pizza pedirPizza() {

		Pizza pizza = new Pizza();

		pizza.preparar();
		pizza.cozinhar();
		pizza.cortar();
		pizza.embalar();

		return pizza;
	}

}
