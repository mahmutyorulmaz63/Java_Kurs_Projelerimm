import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1= 23;
        int sayi2=24;
        int sayi3=25;
        int sayi4=26;
        int sayi5=27;

        int toplam = sayi1 +sayi2 + sayi3 + sayi4 + sayi5;
        System.out.println("toplam = "+ toplam);

        System.out.println("-----------------");

        int dizi[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(dizi));

        System.out.println("----------------------");

        String isimler []={"berk","ayça","sevim","esma"};
        System.out.println(Arrays.toString(isimler));
        isimler[1] = "ali";
        System.out.println("güncellenmiş hali="+Arrays.toString(isimler));



    }


}