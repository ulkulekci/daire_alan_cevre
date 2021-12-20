import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner yaricap=new Scanner(System.in);
        System.out.println("dairenin yarıçapını girin:");
       int r=yaricap.nextInt();
       double pi=3.14, alan, cevre;
       alan=pi*r*r;
       cevre=2*pi*r;
       System.out.println("dairenin alanı:"+alan);
       System.out.println("dairenin çevresi:"+cevre);
    }
}
