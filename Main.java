
public class Main {
//To jest moj sprawdzajacy komentarz
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gr_dol=0;
		double gr_gora=1;
		double gr_dol_poprz = 0;
		char  z[] = {'A','B','C','D','E'};
		double p[] = {0.3,0.2,0.1,0.2,0.2};
		String wej = "DEABCCCBACBECDEAAA";
		char znak[] = new char[wej.length()];
		for(int i=0;i<wej.length();i++){
			znak[i]=wej.charAt(i);
		}
	/*	for(int i=0;i<znak.length;i++){
			System.out.println(znak[i]);
		}*/
		
		for(int i=0;i<znak.length;i++){ // przerabia kazdy znak w stringu
			for(int j=0;j<z.length;j++){ // przerabia kazdy znak z tablicy dozwolonych
				if(znak[i]==z[j]){		//zrobic breaki w forach zeby dzialaly szybciej
					if(j==0) gr_gora=gr_dol+(gr_gora-gr_dol)*p[0]; // jak jest pierwszy znak to tylko gorna sie zmienia
					else{
						double sum_dol=0;
						double sum_gora=0;
				for(int u=0;u<j;u++)sum_dol=sum_dol+p[u];
				for(int v=0;v<=j;v++) sum_gora=sum_gora+p[v];
						gr_dol_poprz = gr_dol;
						gr_dol=gr_dol+(gr_gora-gr_dol)*sum_dol;	
						gr_gora=gr_dol_poprz+(gr_gora-gr_dol_poprz)*sum_gora;
					//tutaj pozmienialem granice gorna i dolna
					}
				}
			}
		}
			
			double srednia = (gr_dol+gr_gora)/2;
	System.out.println("dolna "+gr_dol+ ", gorna "+gr_gora);	
	Dekoduj.Dekoduj(srednia,wej.length(),z,p);
	
	}
	
}

