//  I, 10958661 pledge that I wrote this codes by myself
//  A java code to print prime numbers below any given input
import java.util.Scanner;
    
class Main{
    static void isPrime() {
        int number;
        int sum=0;
        float count=0;
        float average;
        System.out.print("Please enter number: ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        System.out.println("*******************************************");
        System.out.println("Prime numbers below "+number+" are");
        for(int x=2; x<number;x++){
            int follow=0;
            for(int i=2; i<=x/2; i++){
                if(x%i==0){
                    follow=1; break;
                }
            }
            if(follow==0){
                System.out.println(x);
                sum=sum+x;
                count+=1;
            input.close();
            }
        }
        System.out.println("*******************************************");
        average=sum/count;
        System.out.println("The count of prime numbers below "+number+" is "+count);
        System.out.println("___________________________________________");
        System.out.println("The sum of prime numbers printed is "+sum);
        System.out.println("___________________________________________");
        System.out.println("The average of the prime numbers is "+average);
        System.out.println("___________________________________________");
    }
    public static void main(String[] args){
      isPrime();
    }
}
