//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object aranacak;

    public static void main(String[] args) {
        int [] sayilar = new int[] {1,2,3,5,7,9};
        int aranacak = 3 ;
        boolean varMi = false;


        
        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;

            }
        }
        if (varMi){
            System.out.println("sayı mevcuttur");

        }else {
            System.out.println("sayı mevut değildir");
        }

    }
}