package cse360assign2;

public class Main {
	
	public static void main(String[] args){
		
		Calculator myCalculator = new Calculator();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		myCalculator.divide(3);
		
		System.out.println("Total = " + myCalculator.getTotal() + "\n");;
		
		//System.out.println(myCalculator.getHistory());;
		myCalculator.getHistory();
	}
}
