package BSUIR.WT.Lab1.Task9.Classes;

public class Basket {

	public Ball[] content;

	public Basket (Ball[] content){
		this.content = content;
	}

	public double getGeneralWeight(){
		double result = 0;
		for (var ball : content){
			result = result + ball.weight;
		}
		return result;
	}

	public int getBlueBallsAmount(){
		int result = 0;
		for (var ball : content){
			if (ball.color == Color.BLUE){
				result = result + 1;
			}
		}
		return result;
	}
}

