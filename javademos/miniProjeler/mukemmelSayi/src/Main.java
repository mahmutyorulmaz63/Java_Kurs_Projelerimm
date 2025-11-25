//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //6--->1,2,3
        //28--->1,2,4,7,14

        int number = 27;
        int toplam = 0;

        if (number < 0){
            System.out.println("geçersiz");
        }

        // Bölenleri toplama ekle
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        // Döngü bittikten sonra kontrol
        if (toplam == number) {
            System.out.println(number + " mükemmel sayıdır=");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
