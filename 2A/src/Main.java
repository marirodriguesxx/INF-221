import java.util.Scanner;

public class Main {
	
	public static void main(String[] entrada) {
		int num_times;
		Scanner in = new Scanner(System.in);
		
		num_times = in.nextInt();
		
		int jogadas = num_times*(num_times-1)/2;
		
		int[][] jogos = new int[jogadas][4];
		//coluna 0 = vitorias, coluna 1 = derrotas, coluna 2 = cesta average, coluna 3 = pontos totais, coluna 4 = inscr do time
		int[][] resultados = new int [num_times+1][5];
		
		for (int i = 0; i < jogadas; i++) {
			jogos[i][0] = in.nextInt();
			jogos[i][1] = in.nextInt();
			jogos[i][2] = in.nextInt();
			jogos[i][3] = in.nextInt();

		}
		
		for(int i=0; i<jogadas; i++) {
			//se o ponto obtido pelo time um (jogos[i][0]) ganhou
			if (jogos[i][1] > jogos[i][3]) {
				resultados[jogos[i][0]][0] +=2; //o time de inscrição jogos[i][0] incrementa dois pontos pela vitoria
				resultados[jogos[i][2]][1] ++; //o time de inscrição jogos[i][2] incrementa um ponto pela derrota
				//pontos totais
				resultados[jogos[i][0]][3] +=2;
				resultados[jogos[i][2]][3] ++;
				//cesta average
				if((resultados[jogos[i][0]][1])!=0 && (resultados[jogos[i][2]][1])!=0){
				resultados[jogos[i][0]][2] = (resultados[jogos[i][0]][0])/(resultados[jogos[i][0]][1]);
				resultados[jogos[i][2]][2] = (resultados[jogos[i][2]][0])/(resultados[jogos[i][2]][1]);
				}
				else {
				resultados[jogos[i][0]][2] = resultados[jogos[i][0]][0];
				resultados[jogos[i][2]][2] = resultados[jogos[i][2]][0];
				}
				//salvando as inscrições dos times
				resultados[jogos[i][0]][4] = jogos[i][0];
				resultados[jogos[i][2]][4] = jogos[i][2];
				
			}
			//se o ponto obtido pelo time um (jogos[i][2]) ganhou
			if (jogos[i][3] > jogos[i][1]) {
				resultados[jogos[i][2]][0] +=2;
				resultados[jogos[i][0]][1] ++;
				//pontos totais
				resultados[jogos[i][2]][3] +=2;
				resultados[jogos[i][0]][3] ++;
				//cesta average
				if((resultados[jogos[i][0]][1])!=0 && (resultados[jogos[i][2]][1])!=0){
				 resultados[jogos[i][2]][2] = (resultados[jogos[i][2]][0])/(resultados[jogos[i][2]][1]);
				 resultados[jogos[i][0]][2] = (resultados[jogos[i][0]][0])/(resultados[jogos[i][0]][1]);
				}
				else {
				resultados[jogos[i][0]][2] = resultados[jogos[i][0]][0];
				resultados[jogos[i][2]][2] = resultados[jogos[i][2]][0];
				}
				//salvando as inscrições dos times
				resultados[jogos[i][0]][4] = jogos[i][0];
				resultados[jogos[i][2]][4] = jogos[i][2];
			}
		}
		int[] vencedores = new int [num_times];
		Resultados results = new Resultados();
		vencedores = results.solve(num_times, jogadas, resultados);	
		for(int i=0; i<vencedores.length-1; i++) {
			System.out.println(vencedores[i]);			
		}
		// For para verificar se o preenchimento ocorreu corretamente...OK
		/*for(int i=0; i<resultados.length; i++) {
			System.out.println("resultado do time " + i);
			for(int j=0; j<resultados[i].length; j++) {
				System.out.println(resultados[i][j]);
			}
			System.out.println("");
		}*/
			
		in.close();
	}

}
