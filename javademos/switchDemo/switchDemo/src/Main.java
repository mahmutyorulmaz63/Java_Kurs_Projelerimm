//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("iyi notla geçtiniz ");
                break;
            case 'C':
                System.out.println("iyi not");
                break;
            case 'D':
                System.out.println("iyi");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("geçersiz not");
        }
    }
}