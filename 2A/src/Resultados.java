
public class Resultados {
	
	public String respostacorreta(int[] vencedores){
		String resp = "";
		for(int i=0; i<vencedores.length-1; i++) {
			//System.out.println(vencedores[i]);		
			resp += Integer.toString(vencedores[i]) + " ";
		}
		
		return resp;		
	}
	
	//retorna o cesta average do melhor time
	public int[] solve(int num_time, int jogadas, int[][] resultados){ 
		int[] listaganhadores = new int [num_time+1];
		
		//ordenando o vetor de acordo com os pontos totais obtidos (coluna 3 da matriz de resultados)
		for(int i=0; i<num_time+1; i++){
			for(int j=i+1; j<num_time+1; j++) {
				if(resultados[j][3]>resultados[i][3]){ // se o resultado do time seguinte foi maior
					int[] aux = resultados[j];
					resultados[j] = resultados[i];
					resultados[i] = aux;	
				}				
			}	
			listaganhadores[i] = resultados[i][4];
		}
		
		//percorrendo o vetor e verificando se houve empate
		for(int i=0; i<num_time+1; i++){		
			for(int j=i+1; j<num_time+1; j++) {
			if (resultados[i]==resultados[j]) {
				//primeiro, verificaremos o cesta average
				if(resultados[i+1][2]>resultados[i][2]) { //se o cesta average do proximo for maior, troca
					int[] aux = resultados[j];
					resultados[j] = resultados[i];
					resultados[i] = aux;
				}
				//Verificando quem marcou mais pontos, se ainda houver empate
				else if(resultados[j][2] == resultados[i][2]){
					if(resultados[j][3]>resultados[i][3]) { //se os pontos do proximo for maior, troca
						int[] aux = resultados[j];
						resultados[j] = resultados[i];
						resultados[i] = aux;
					}					
				}
				if(resultados[j][3]==resultados[i][3]) {		
					if(resultados[j][4]<resultados[i][4]) { //se a inscr do prox for maior
						int[] aux = resultados[j];
						resultados[j] = resultados[i];
						resultados[i] = aux;
					}
				}
			}
			listaganhadores[i] = resultados[i][4];
			}
		}

		
		return listaganhadores;
	}
}



