
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz =");
        String kelime = input.nextLine();

        String ters = tersCevir(kelime);
        System.out.println("ters çevir :" + ters);


    }

    public static String tersCevir(String metin) {
        String ters = " ";

        for (int i = metin.length() - 1; i >= 0; i--) {
            ters += metin.charAt(i);

        }
        return ters;
    }
}