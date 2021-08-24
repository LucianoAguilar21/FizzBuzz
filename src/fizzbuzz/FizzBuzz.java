package fizzbuzz;

public class FizzBuzz {

	String fizzBuzz ;


	public static void main(String[] args) {
		
	}


	public void FizzB(int numero) {
		for (int i = 1; i <=numero;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				fizzBuzz = "FizzBuzz";	
				System.out.println(fizzBuzz);
			}else if(i % 3 == 0 && i % 5 != 0) {
				fizzBuzz = "Fizz";
				System.out.println(fizzBuzz);
			}else if(i % 3 != 0 && i % 5 == 0) {
				fizzBuzz = "Buzz";
				System.out.println(fizzBuzz);
			}else {
				System.out.println(i);
				}
			}
	}
}
