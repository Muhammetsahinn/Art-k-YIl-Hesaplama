import java.util.Scanner;

public class main4 {

    public static void main(String[] args){

        int yil;

        Scanner grs = new Scanner(System.in);

        System.out.println("Yil giriniz");

        yil = grs.nextInt();

        if(yil%4==0){
            System.out.println(yil+" bir artik yildir");
        }
        else if(yil%400==0){
            System.out.println(yil+" bir artik yildir");
        }
        else {
            System.out.println(yil+" bir artik yil degildir");
        }



    }
}
