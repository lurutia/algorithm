import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
		
		n = Integer.valueOf(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			calculateMinMoveCount();
		}
    }
    
    private static void calculateMinMoveCount() {
		long start = sc.nextInt();
		long end = sc.nextInt();
		long length = end - start;
		long turn= 0;
		
		int gg = 1;
		for(long i = 0; i<=length;) {
			
			i = i + gg;
			turn = turn + 1;
			if(i >= length) break;
			
			i = i + gg;
			turn = turn + 1;
			if(i >= length) break;
			
			gg = gg + 1;	
		}
		
		
		System.out.println(turn);
	}
}