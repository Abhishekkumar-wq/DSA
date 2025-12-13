import java.util.Scanner;
public class fizzfuzz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println(n);
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                System.out.print("fizzbuzz");
            } else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    } 
}