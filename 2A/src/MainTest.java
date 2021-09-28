import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {
		Resultados teste;
		
		@Before
		public void init(){
			teste = new Resultados();
		}
		
		@Test
		public void testResultadosC1() {
			int times = 5;
			int jogadas = times*(times-1)/2;
			int[][] jogos = new int[jogadas][4];
			jogos[0][0] =1; jogos[0][1] = 102; jogos[0][2] = 2; jogos[0][3] = 62;
			jogos[1][0] =1; jogos[1][1] = 128; jogos[1][2] = 3; jogos[1][3] = 127;
			jogos[2][0] =1; jogos[2][1] = 144; jogos[2][2] = 4; jogos[2][3] = 80;
			jogos[3][0] =1; jogos[3][1] = 102; jogos[3][2] = 5; jogos[3][3] = 101;
			jogos[4][0] =2; jogos[4][1] = 62; jogos[4][2] = 3; jogos[4][3] = 61;
			jogos[5][0] =2; jogos[5][1] = 100; jogos[5][2] = 4; jogos[5][3] = 80;
			jogos[6][0] =2; jogos[6][1] = 88; jogos[6][2] = 5; jogos[6][3] = 82;
			jogos[7][0] =3; jogos[7][1] = 79; jogos[7][2] = 4; jogos[7][3] = 90;
			jogos[8][0] =3; jogos[8][1] = 87; jogos[8][2] = 5; jogos[8][3] = 100;
			jogos[9][0] =4; jogos[9][1] = 110; jogos[9][2] = 5; jogos[9][3] = 99;
			int[] vencedores = new int [times+1];
			vencedores = teste.solve(times, jogadas, jogos);				
			assertEquals("1 2 4 5 3\n", teste.respostacorreta(vencedores));
		}

}
