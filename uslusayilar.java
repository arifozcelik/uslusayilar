import java.util.Scanner;
public class uslusayilar {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.println("üssü alınacak sayıyı giriniz : ");
        n = input.nextInt();
        System.out.println("üs olacak sayiyi giriniz : ");
        k = input.nextInt();
        int total = 1;

        int i=1;
        while(i <= k) {
            total *= n;
            i++;
        }
        System.out.println("cevap : " + total);
    }
}
