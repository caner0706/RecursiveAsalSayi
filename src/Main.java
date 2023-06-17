
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();

        boolean asalMi = isAsal(sayi, 2);
        if (asalMi)
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");
        
    }
    
    public static boolean isAsal(int sayi, int i) {
        if (sayi <= 2)
            return (sayi == 2);
        
        if (sayi % i == 0)
            return false;
        
        if (i * i > sayi)
            return true;
        
        return isAsal(sayi, i + 1);
    }
    
}
