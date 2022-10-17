package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int SumaC(int n)
    {
        int suma=0;
        while(n!=0)
        {
            suma+=n%10;
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("unesite broj n");
        int n=in.nextInt();
        for(int i=2;i<n;i++)
        {
            if(i%SumaC(i)==0)System.out.print(i);
            if(i<n-1 && i%SumaC(i)==0)System.out.print(", ");
        }
    }
}