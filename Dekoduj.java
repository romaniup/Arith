
public class Dekoduj {

	
	public static void Dekoduj(double value, int length,char znaki[],double prop[]){
		
		System.out.println("Fiutek");
		String wynik = "";
		StringBuilder str = new StringBuilder(wynik);
		
		
		int iter = length;
		double p[] = prop;
		char z[] = znaki;
		double granica_dol_old=0;
		//for(int i=0;i<length;i++){
		
		double granica_dol = 0;
		double granica_gora = 1;
		double diff = granica_gora - granica_dol;
		
		
		for(int i=0;i<iter;i++){
			if(i>0) diff=granica_gora - granica_dol;
			int j=0;
			
		do{
			System.out.println("J to: "+j);
			if(j==0){
				System.out.println("Diff to: "+diff);
			//granica_dol_old = granica_dol;
				granica_gora = granica_dol + diff*((granica_dol+p[j])-granica_dol);
			}
			//jeszcze jest troche zle, ewentualnie zla dokladnosc
			else{
			granica_dol=granica_gora;
			
			granica_gora=granica_gora+diff*((granica_dol+p[j])-granica_dol);
			}
			System.out.println(granica_dol);
			System.out.println(granica_gora);		
			if (value>=granica_dol && value<granica_gora) {
				System.out.println(i+1+" litera to: "+z[j]);
				str.append(z[j]);


				break;
			}
			j++;
		}
		while(true);
		}
		wynik = str.toString();
		System.out.println(wynik);
	}
	
}
