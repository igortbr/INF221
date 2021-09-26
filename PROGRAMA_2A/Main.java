import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner ler = new Scanner(System.in);
		n = ler.nextInt();
		
		Campeonato camp = new Campeonato(n);
		camp.le();
		camp.classificacao();
		System.out.print(camp.resultado());
	}

}
