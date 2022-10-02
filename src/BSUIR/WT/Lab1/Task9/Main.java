package BSUIR.WT.Lab1.Task9;

import BSUIR.WT.Lab1.Task9.Classes.Ball;
import BSUIR.WT.Lab1.Task9.Classes.Basket;
import BSUIR.WT.Lab1.Task9.Classes.Color;

public class Main {

	public static void main(String[] args){
		var basket = new Basket(
			new Ball[]{
					new Ball(1.4, Color.BLUE),
					new Ball(0.6, Color.RED),
					new Ball(2.3, Color.GREEN),
					new Ball(0.7, Color.BLUE)
			});
		System.out.println("General weight: " + basket.getGeneralWeight());
		System.out.println("Blue balls amount: " + basket.getBlueBallsAmount());
	}
}