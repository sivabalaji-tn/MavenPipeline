import java.util.*;
public class Maintest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Maven Pipeline Build Successfully");
        }
        else{
            System.out.println("Error While creating a Pipeline");
        }
    }
}