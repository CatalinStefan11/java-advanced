package _7_polymorphism;

public class Main {
	public static void main(String[] args) {
		BinaryOperator binaryOperator = new BinaryOperator(6, 5);
		BinaryOperator operatorAdd = new AdditionOperator(6, 5);
		BinaryOperator operatorSub = new SubtractionOperator(6, 5);
		
		System.out.println("Binary: "+binaryOperator.operate());
		System.out.println("Addition: "+operatorAdd.operate());
		System.out.println("Subtraction: "+operatorSub.operate());
	}
}