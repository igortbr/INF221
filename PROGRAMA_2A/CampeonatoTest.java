import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CampeonatoTest {
	@Test
	public void resultadoTest() {
		Campeonato c = new Campeonato(5);
		c.times[0].pontosMarcados = 476;
		c.times[0].pontosRecebidos = 370;
		c.times[0].pontosCampeonato = 8;
		
		c.times[1].pontosMarcados = 312;
		c.times[1].pontosRecebidos = 325;
		c.times[1].pontosCampeonato = 7;
		
		c.times[2].pontosMarcados = 354;
		c.times[2].pontosRecebidos = 380;
		c.times[2].pontosCampeonato = 4;
		
		c.times[3].pontosMarcados = 360;
		c.times[3].pontosRecebidos = 422;
		c.times[3].pontosCampeonato = 6;
		
		c.times[4].pontosMarcados = 382;
		c.times[4].pontosRecebidos = 387;
		c.times[4].pontosCampeonato = 5;
		
		c.classificacao();
		
		assertEquals("1 2 4 5 3\n",c.resultado());
	}
}
