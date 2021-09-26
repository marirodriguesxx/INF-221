package trabalho1;
import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {
	Impedido impedido;
	
	@Before
	public void init(){
		impedido = new Impedido();
	}
	
	@Test
	public void testImpedidosC1() {
		int[] atacantesgol = {500, 700};
		int[] defensoresgol = {700, 500, 500};
		impedido.impedidos(2, 3, atacantesgol, defensoresgol);
		assertFalse(impedido.getImpedido(atacantesgol,defensoresgol));
	}
	public void testImpedidosC2() {
		int[] atacantesgol = {200, 400};
		int[] defensoresgol = {200, 1000};
		impedido.impedidos(2, 2, atacantesgol, defensoresgol);
		assertTrue(impedido.getImpedido(atacantesgol,defensoresgol));
	}
	public void testImpedidosC12() {
		int[] atacantesgol = {530, 510, 490};
		int[] defensoresgol = {480, 470, 50, 310};
		impedido.impedidos(3, 4, atacantesgol, defensoresgol);
		assertFalse(impedido.getImpedido(atacantesgol,defensoresgol));
	}
	public void testImpedidosC13() {
		int[] atacantesgol = {500, 600};
		int[] defensoresgol = {100, 150, 68, 250, 45, 1000, 670};
		impedido.impedidos(2, 6, atacantesgol, defensoresgol);
		assertFalse(impedido.getImpedido(atacantesgol,defensoresgol));
	}
	

}
