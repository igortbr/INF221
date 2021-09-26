import java.util.Arrays;

public class Impedimento {
	public static boolean impedido(int[] vA, int[] vB) {
		Arrays.sort(vB);
		Arrays.sort(vA);
		
		if(vA[0] < vB[1]) {
			return true;
		} else {
			return false;
		}
	}
}
