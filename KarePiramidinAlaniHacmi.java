import java.util.Scanner;
public class KarePiramidinAlaniHacmi {

	public static void main(String[] args) {
		int alan = 0, hacim = 0 , a , h , y ;
		Scanner klavye = new Scanner (System.in);
		System.out.print("Taban kenar uzunlu�unu giriniz = ");
		a = klavye.nextInt();
		System.out.print("Piramidin y�ksekli�ini giriniz = ");
		h = klavye.nextInt();
		System.out.print("Yanal y�zeyin y�ksekli�ini giriniz = ");
		y = klavye.nextInt();
		klavye.close();
		alan +=(int) Math.pow(a, 2) + 4*a*y/2;
		System.out.println("Alan = " + alan);
		hacim +=(int) Math.pow(a, 2)*h/3;
		System.out.print("Hacim = " + hacim);
	} 

}
