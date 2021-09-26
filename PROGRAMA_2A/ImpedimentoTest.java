import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class ImpedimentoTest {
	@Test
	public void testImpedido() {
		int[] A = {40, 70, 10};
		int[] B = {100, 20, 50};
		assertTrue(Impedimento.impedido(A, B));
	}
	
	@Test
	public void testNaoImpedidoMesmaLinhaPenultimo() {
		int[] A = {100, 120, 90};
		int[] B = {1000, 10, 90};
		assertFalse(Impedimento.impedido(A, B));
	}
	
	@Test
	public void testNaoImpedidoMesmaLinhaDoisUltimos() {
		int[] A = {70, 80, 100};
		int[] B = {70, 100, 70};
		assertFalse(Impedimento.impedido(A, B));
	}
}
