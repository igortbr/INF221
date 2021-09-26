import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int nA, nB;
		while(true) {
			nA = ler.nextInt();
			nB = ler.nextInt();
			
			if(nA == 0 & nB == 0) {
				break;
			}
			
			int[] A = new int[nA];
			int[] B = new int[nB];
			
			for(int i = 0; i < nA; i++) {
				A[i] = ler.nextInt();
			}
			
			for(int i = 0; i < nB; i++) {
				B[i] = ler.nextInt();
			}
			
			if(Impedimento.impedido(A, B)) {
				System.out.printf("Y\n");
			} else {
				System.out.printf("N\n");
			}
		}

	}

}
