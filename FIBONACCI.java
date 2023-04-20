import java.util.Scanner;
public class FIBONACCI {
    public static void main(String[] args) {
        int n=0,x=0,c=1,sonuc = 0;
        Scanner inp=new Scanner(System.in);
        System.out.println("fibonacci kaç elemanlı olmalı?");
        n= inp.nextInt();
        for(int i=1;i<n;i++){
            sonuc=x+c;
            System.out.println(x+"+"+c+"="+(x+c));
            x=c;
            c=sonuc;



        }
    }
}
