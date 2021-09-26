package trabalho1;

public class Impedido {
	
	public void impedidos(int atacantes, int defensores, int[] atacantestogol, int[] defensorestogol) {
       
		//executando o bubble sort para verificar a distância dos atacantes e defensores ate o gol
		for( int i = 0 ; i < atacantes ; i++ ){
            for( int j = i + 1 ; j < atacantes ; j++ ){
                if ( atacantestogol[ i ] > atacantestogol[ j ] ){
                    int temp = atacantestogol[i]; 	
                    atacantestogol[i] = atacantestogol[j];
                    atacantestogol[j] = temp;	
                }
            }
        }
        for( int i = 0 ; i < defensores ; i++ ){
            for( int j = i + 1 ; j < defensores ; j++ ){
                if ( defensorestogol[ i ] > defensorestogol[ j ] ){
                    int temp = defensorestogol[i]; 	
                    defensorestogol[i] = defensorestogol[j];
                    defensorestogol[j] = temp;					
                	}
            }
        }
        
        if( atacantestogol[0] < defensorestogol[1] ){ System.out.println("Y"); return; }
        else { System.out.println("N");return; }

	}
	
}