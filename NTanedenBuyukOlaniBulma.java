import java.util.Scanner;
public class NTanedenBuyukOlaniBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("K�yaslama Adedini Giriniz = ");
		int n = in.nextInt();
		int sayi , sayac =0 , buyukSayi ;
		do {
			System.out.print("Say� giriniz = ");
			sayi = in.nextInt();
			buyukSayi = sayi ;
			sayac ++;
			if (sayi > buyukSayi) {
				buyukSayi = sayi ;
				sayac ++;
			}
		}while(sayac< n);
		in.close();
			System.out.print("B�y�k Say� = " + buyukSayi);
		
	}

}
