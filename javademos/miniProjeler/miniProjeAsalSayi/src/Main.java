//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 2;

        boolean isPrime = true;

        if (number == 1 ){
            System.out.println("sayı asal değildir");
            return;
        }
        if (number == 2){
            System.out.println("sayı asaldır");
        }
        if (number<1){
            System.out.println("geçersiz sayı");
            return;
        }
        for (int i =2;i<number;i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
            if (isPrime){
                System.out.println("sayı asaldır ");

            }else {
                System.out.println("sayı asal değildir");
            }
        }


    }
}

