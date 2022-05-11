import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double alan,c,cevre;
        System.out.println("Birinci dik kenar uzunluğunu giriniz ");
        a=input.nextInt();
        System.out.println("İkinci dik kenar uzunluğunu giriniz ");
        b=input.nextInt();
        c= (int) Math.sqrt(a*a+b*b);
        cevre=a+b+c;
        alan=a*b/2.0;

        if(a+b>c&&a+c>b&&b+c>a) {
            System.out.println("Girilen iki dik kenar ile bir üçgen oluşturulabilir. Oluşturulan dik üçgenin hipotenüsü =" + c);
            System.out.println("Üçgenin çevresi =" + cevre);
            System.out.println("Üçgenin alanı =" + alan);
        }
        else{
            System.out.println("Girilen değerler ile bir üçgen oluşturulamaz.");
        }


    }
}
