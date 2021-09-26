import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {
	public int n;
	public Time[] times;
	public String result;
	
	Campeonato(int n){
		this.n = n;
		times = new Time[n];
		result = "";
		
		for(int i = 0; i < n; i++) {
			times[i] = new Time(i);
		}
	}
	
	public void le() {
		Scanner ler = new Scanner(System.in);
		
		int time1,time2;
		int pontosTime1,pontosTime2;
		int p;
		
		for(int i = 0; i < (n*(n-1)/2); i++) {
			time1 = ler.nextInt();
			pontosTime1 = ler.nextInt();
			time2 = ler.nextInt();
			pontosTime2 = ler.nextInt();
			
			times[time1-1].pontosMarcados += pontosTime1;
			times[time1-1].pontosRecebidos += pontosTime2;
			
			times[time2-1].pontosMarcados += pontosTime2;
			times[time2-1].pontosRecebidos += pontosTime1;
			
			if(pontosTime1 > pontosTime2) {
				times[time1-1].pontosCampeonato += 2;
				times[time2-1].pontosCampeonato += 1;
			} else {
				times[time2-1].pontosCampeonato += 2;
				times[time1-1].pontosCampeonato += 1;
			}
		}
	}
	
	public void classificacao() {
		Arrays.sort(times, new Comparator<Time>() {
			int pR1,pR2;
			double cestaAverage1,cestaAverage2;
			@Override
			public int compare(Time time1, Time time2) {
				if(time1.pontosCampeonato > time2.pontosCampeonato) {
					
					return -1;
				} else if (time1.pontosCampeonato == time2.pontosCampeonato) {
					if(time1.pontosRecebidos == 0) {
						pR1 = 1;
					} else {
						pR1 = time1.pontosRecebidos;
					}
					
					if(time2.pontosRecebidos == 0) {
						pR2 = 1;
					} else {
						pR2 = time2.pontosRecebidos;
					}
					
					cestaAverage1 = (double)time1.pontosMarcados / (double)pR1;
					cestaAverage2 = (double)time2.pontosMarcados / (double)pR2;
					
					if(cestaAverage1 > cestaAverage2) {
						
						return -1;
					} else if(cestaAverage1 == cestaAverage2) {
						if(time1.pontosMarcados > time2.pontosMarcados) {
							
							return -1;
						} else if(time1.pontosMarcados == time2.pontosMarcados) {
							if(time1.inscricao < time2.inscricao) {
								
								return -1;
							}
							
							return 1;
						}
						
						return 1;
					}
					
					return 1;
				}
				
				return 1;
			}
		}); 
	}
	
	public String resultado() {
		for(int i = 0; i < (n-1); i++) {
			result += Integer.toString(times[i].inscricao) + " ";
		}
		result += Integer.toString(times[n-1].inscricao) + "\n";
		
		return result;
	}
	
}
