package trabalho1;

import java.util.Scanner;

public class Main {

	public static void main(String[] arq) {
		int atacantes =-1;
		int defensores =-1;
		int atacantestogol[] = null;
		int defensorestogol[] = null;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			atacantes = in.nextInt();
			defensores = in.nextInt();
			if(atacantes==0 && defensores==0){in.close();break;} // se não houver nenhum jogador
			
			atacantestogol = new int[atacantes];
			defensorestogol = new int [defensores];
			
	        for( int i = 0 ; i < atacantes ; i++ ){
	            atacantestogol[i] = in.nextInt();
	        }
	        for( int i = 0 ; i < defensores ; i++ ){
	            defensorestogol[i] = in.nextInt();
	        }
			Impedido I = new Impedido();
			I.impedidos(atacantes,defensores,atacantestogol,defensorestogol);	
		}
			
		in.close();
	}
}
