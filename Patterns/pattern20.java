/* 
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/
import java.util.Scanner;
public class pattern20 {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height :- ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
