import java.util.Scanner;

public class EbobHesap {

	public static void main(String[] args) {
		int sayi1 , sayi2 , buyukSayi=1 ;
		boolean durum = true;
		Scanner input = new Scanner (System.in);
		
			do {
				System.out.print("K���k Say�y� Girin = ");
				sayi1 = input.nextInt();
				System.out.print("B�y�k Say�y� Girin = ");
				sayi2 = input.nextInt();
				if (sayi1<sayi2) {
					durum =false;
				}
			} while (durum);
			input.close();
	
			for (int sayac =1; sayac<=sayi1 ; sayac++) {
				if (sayi1 % sayac == 0 && sayi2 % sayac ==0) {
				buyukSayi = sayac;
				}
			}
			if (buyukSayi ==1) {
				System.out.print("Say�lar Aralar�nda Asald�r .");
			}
			System.out.print("EBOB = " + buyukSayi );
		}
	}
