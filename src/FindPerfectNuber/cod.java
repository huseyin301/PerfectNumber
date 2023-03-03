package FindPerfectNuber;
import java.util.Scanner;
public class cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, c = 1, tool = 0;

        System.out.print("Sayı girin : ");
        c = sc.nextInt();

        for (i = 1; i <= c; i++){

            if (c % i == 0){

                tool += i;

            }

        }

        tool -= c;

        if (tool == c){

            System.out.println(c + " bir mükemmel sayıdır.");

        }else{

            System.out.println(c + " bir mükemmel sayı değildir.");

        }

    }
}
