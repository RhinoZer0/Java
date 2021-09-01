import java.util.Scanner;

public class BookStore {
    public static void main(String args[])
    {
        String sBookName;
        int iId;
        double dPrice;
        boolean bFreeShipping;        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Introduce book name: ");
        sBookName = console.nextLine();
        System.out.println("Introduce ID: ");
        iId = Integer.parseInt( console.nextLine() );
        System.out.println("Introduce the price: ");
        dPrice = Double.parseDouble( console.nextLine() );
        System.out.println("Free shipping? ");
        bFreeShipping = Boolean.parseBoolean(console.nextLine() );
        
        System.out.println(sBookName + " #" + iId);
        System.out.println("Price $" + dPrice);
        System.out.println("FreeShipping: " + bFreeShipping);        
    }
}
