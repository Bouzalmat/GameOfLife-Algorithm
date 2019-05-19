package gameOfLife;

public class Game {

	public static int[] toBinary(int value){
		int[] result = new int[8];
		int indice = 7;
		while(value > 0) {
			result[indice] = value%2;
			indice--;
			value = value/2;
		}
		
		
		
			return result;
		
	}
	
	public static int[] automata(int input[]) {
		int[] inputTwo = new int[input.length+2];
		int[] output = new int[input.length];
		inputTwo[0]=inputTwo[inputTwo.length-1]=0;
		for(int i=0; i<input.length; i++)
			inputTwo[i+1]=input[i];
		
		for(int i=1; i<inputTwo.length-1; i++) {
			output[i-1] = (inputTwo[i-1] ^ (inputTwo[i] | inputTwo[i+1]));
		}
		
		return output;
		}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,0,0,0,0,1,0,0,0,0,0};
		int j=0;
		
		for(int i = 0; i<input.length; i++) {
			
			System.out.print(input[i]);
		}
		System.out.println("");
		int[] output = Game.automata(input);
		
		do {
			
			for(int i = 0; i<output.length; i++) {
				
				System.out.print(output[i]);
			}
			output = Game.automata(output);
			j++;
			System.out.println("");
			
		}while(j<10);
		
		
			
		
	}
	
}


