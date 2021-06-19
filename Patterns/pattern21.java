/* 

*/
import java.util.Scanner;
public class pattern21 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height:- ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            //for spaces
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //in decreasing order
            int k=i;
            for(;j<=n;j++){
                System.out.print(k-- +" ");
              
            }
            //for increasing order
            /*k=2;
            for(;j<=(n+i)-1;j++){
                System.out.print(k++ +" ");
              
            }*/
            System.out.println();
        } 
    }
}
