import java.util.Scanner;
/**
 * Created by ArthurArt on 16.12.2016.
 */
public class HomeWork {

    public static void a(Scanner sc){
        System.out.println(sc.nextInt() + sc.nextInt());//Во имя БУДДЫ!!!

    }
    public static void b(Scanner sc){
        int k =sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a<0)&&(b>=0))
            System.out.println(((b-a)+2)/k);
        else  System.out.println(((b-a)+1)/k);



    }
    public static void c(Scanner sc){
        int n =Integer.parseInt(sc.nextLine());
        String[] str = new String[n];
        for ( int i = 0;i<n;i++)
            str[i] = sc.nextLine();
        for ( int i = n-1;i>=0;i--)
            System.out.println(str[i]);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a(sc);
        //b(sc);
        // c(sc);

    }
}
