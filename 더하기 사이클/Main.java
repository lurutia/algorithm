import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String n;
		int cycle = 0;
		n = String.valueOf(sc.nextInt());

		String firstNumber = makeTwoLength(n);
		n = firstNumber;
		
		while(true) {
			cycle = cycle + 1;
			n = sumEachNumberAndNewNumber(n);
			if(firstNumber.equals(n)) {
				System.out.println(cycle);
				return;
			}
		}
    }
    
    private static String makeTwoLength(String number) {
		if(number.length() == 1) {
			return "0" + number;
		} else {
			return number;
		}
	}
	
	private static String sumEachNumberAndNewNumber(String number) { 
		int a = Character.getNumericValue(number.charAt(0));
		int b = Character.getNumericValue(number.charAt(1));
		String sum = String.valueOf(a + b);
		sum = makeTwoLength(sum);
		
		return "" + Character.getNumericValue(number.charAt(1)) + Character.getNumericValue(sum.charAt(1));
	}
}