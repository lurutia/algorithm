import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n;
		int han = 99;
		
		n = sc.nextInt();
		
		if(n < 100) {
			System.out.println(n);
			return;
		}
		
		for(int i=100; i<=n ; i++) {
			String next = String.valueOf(i);
			Integer diff = null;
			boolean isHan = true;
			for(int j = 1; j<next.length(); j++) {
				int a = getNumberByCharacter(next.charAt(j-1));
				int b = getNumberByCharacter(next.charAt(j));
				
				if(diff == null) {
					diff = b - a;
					continue;
				}
					
				if(diff != (b-a)) {
					isHan = false;
				}
			}
			
			if(isHan) {
				han = han + 1;
			}
		}
		
		System.out.println(han);
    }
    
    private static int getNumberByCharacter(char c) {
		return Character.getNumericValue(c);
	}
}