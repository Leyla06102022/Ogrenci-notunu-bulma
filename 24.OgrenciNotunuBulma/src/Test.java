import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// vize1 %30 -- vize2 %30 -- final %40
		// GEÇME NOTU 60
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adinizi giriniz:");
		String isim = scanner.nextLine();
		
		System.out.print("Soyadinizi giriniz:");
		String soyisim = scanner.nextLine();
		
		System.out.print("Dersi giriniz:");
		String ders = scanner.nextLine();
		
		System.out.print("Vize1 giriniz:");
		double vize1 = scanner.nextDouble();
		
		System.out.print("Vize2 giriniz:");
		double vize2 = scanner.nextDouble();
		
		System.out.print("Final notunuzu giriniz:");
		double FinalNot = scanner.nextDouble();
		
		double  sonuc = (vize1*0.3)+(vize2*0.3)+(FinalNot*0.4);
		
		if (sonuc>=60) {
			System.out.println(isim+" "+soyisim+" "+"adli ogrenci"+" "+ders+" "+"dersinden"+" " +sonuc+" "+"ortalama ile gecmistir.");
		}
		else {
			System.out.println("Dersten kaldiniz");
		}
		

	}

}
