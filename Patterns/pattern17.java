/* WAP to print the "Floyd's Triangle"
 
*/
import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the height of Floyd's Triangle:- ");
        int n=scn.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
