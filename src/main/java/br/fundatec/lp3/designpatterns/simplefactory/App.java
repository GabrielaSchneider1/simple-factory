package br.fundatec.lp3.designpatterns.simplefactory;

import br.fundatec.lp3.designpatterns.simplefactory.pizzaria.Pizza;
import br.fundatec.lp3.designpatterns.simplefactory.pizzaria.Pizzaria;

public class App {

	public static void main(String[] args) {

		Pizzaria pizzaria = new Pizzaria();
		Pizza pizza = pizzaria.pedirPizza();

	}

}
