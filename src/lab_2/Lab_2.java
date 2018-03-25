
package lab_2;
import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i=1; i<101; i++) if((i%2)==0) System.out.print(i+ " ");
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 2");
        System.out.println("Введите числа m и n");
        int m, n;
        m=int_in();
        n=int_in();
        System.out.println();
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) System.out.print(8);
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 3");
         for (int i=0; i<m; i++) {
            for (int j=-1; j<i; j++) System.out.print(8);
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
         
        System.out.println("Задание 4");
        System.out.println("Введите два числа");
        m=int_in();
        n=int_in();
        System.out.print(min(m, n));
        
        System.out.println();
        System.out.println();
        System.out.println("Введите четыре числа");
        System.out.print(min(int_in(), int_in(), int_in(), int_in() ));
    }
    
    private static int min (int a, int b, int c, int d){
        return min(min(a, b), min(b, c));
    }
    
    private static int min (int a, int b){
        return ((a<b)?a:b);
    }
    
    public static int int_in() {
        Scanner sc= new Scanner(System.in);
        while (!(sc.hasNextInt())) { 
             System.out.println("Повторите ввод");
             sc.next();
         }
        int Number =Integer.parseInt(sc.next());
        return Number;
    }
}