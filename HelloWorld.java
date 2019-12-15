import java.util.Scanner;

public class AAsecimsorusuKomplex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sehirMvSayısı = 0;
		boolean validInput = false;

		do {
			System.out.println("Sehrin Mv Toplam Sayısı: ");
			String sehirMvSayısıStr = scanner.next();
			
			try {
				sehirMvSayısı = Integer.parseInt(sehirMvSayısıStr);
				validInput = true;
			} catch (Exception ime) {
				System.out.println("Please enter a valid value!!!");
			}
		} while (!validInput);

		System.out.println("Secime Giren Parti Sayısı: ");
		int partiSayısı = scanner.nextInt();

		String[] partiAdı = new String[partiSayısı];
		int[] partiOySayısı = new int[partiSayısı];
		int[] partiMvSayısı = new int[partiSayısı];

		for (int i = 0; i < partiSayısı; i++) {
			System.out.println("Parti Adı: ");
			partiAdı[i] = scanner.next();
			System.out.println("Parti Oy Sayısı: ");
			partiOySayısı[i] = scanner.nextInt();
		}

		for (int i = 0; i < sehirMvSayısı; i++) {

			int enYuksekOyIndex = 0;
			int enYuksekOy = partiOySayısı[0];
			for (int k = 1; k < partiSayısı; k++) {
				if (partiOySayısı[k] > enYuksekOy) {
					enYuksekOy = partiOySayısı[k];
					enYuksekOyIndex = k;
				}
			}
			partiMvSayısı[enYuksekOyIndex] = partiMvSayısı[enYuksekOyIndex] + 1;
			partiOySayısı[enYuksekOyIndex] = partiOySayısı[enYuksekOyIndex] / 2;
		}
		for (int i = 0; i < partiSayısı; i++) {
			System.out.print("Parti Adı: " + partiAdı[i]);
			System.out.println(",\t\tMilletvekili Sayısı: " + partiMvSayısı[i]);
		}
		scanner.close();
	}
}
