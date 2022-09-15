package introJava;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin ="ilginizi çekebilir";
		String altMetin ="Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false ;
		
		String okYonu ="";
		
		if (dolarDun<dolarBugun) {
			okYonu="up.jpeg";
			System.out.println(okYonu);
			
		} 
		else if(dolarBugun<dolarDun){
			okYonu="down.jpeg";
			System.out.println(okYonu);
			
		}
		
		else {
			okYonu="equal.jpeg";
			System.out.println(okYonu);

		}
		
		
		String[] krediler = {"Hızlı Kredi","Halkbank Kredisi","Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
				
				
				
				
				
				
				}

}
