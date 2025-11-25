import java.util.Scanner; // Scanner sınıfını içe aktar

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vizeyi gir=");

        int vize =scanner.nextInt();

        System.out.println("finali gir= ");
        int  finall = scanner.nextInt();

        double ortalama= (vize*0.4)+(finall*0.6);
        System.out.println("ortalama"+ortalama);

        if (ortalama>60){
            System.out.println("geçtiniz");
        }else{
            System.out.println("geçemediniz");
        }
    }


}

