import java.util.Scanner;

public class bolumdenKalan {
    public static void main(String[] args) {
        int k, adet = 0, toplam = 0;
        double ortalama ;


        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i%12==0) {
                toplam+=i;
                adet++;
                System.out.println("sayi1:" +i);

            }

        }
        ortalama = toplam / (adet -1);
        System.out.println("sonuç:" + ortalama);

    }
}
