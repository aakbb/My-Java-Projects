import java.util.Scanner;

public class EkokHesabi {

	public static void main(String[] args) {
		int sayi1 , sayi2 ;
		Scanner input = new Scanner (System.in);
		System.out.print("1. Say�y� Gir = ");
		sayi1 = input.nextInt();
		System.out.print("2. Say�y� Giriniz = ");
		sayi2 = input.nextInt();
		input.close();
		for (int sayac =1 ; sayac <= sayi1*sayi2 ; sayac++) {
			if (sayac%sayi1 ==0 && sayac%sayi2 ==0) {
				System.out.printf("EKOK = %d ", sayac);
			}
		}
	}

}
