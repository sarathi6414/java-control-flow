import java.util.*;
public class pratice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        System.out.println("your number:"+ num);

        if(num>0){
            System.out.println("number is postitive");
        }else{
            System.out.println("number is negative");
        }
   switch(num){
       case 1:System.out.print("sunday");
       break;
       case 2:System.out.print("Monday");
       break;
       case 3:System.out.print("tuesday");
       break;
       case 4:System.out.print("Wednesday");
       break;
       case 5:System.out.print("thursday");
       break;
       case 6:System.out.print("Friday");
       break;
       case 7:System.out.print("Saturday");
       break;
   }
        for(int i=1;i<=num;i++){
            System.out.println("loop number"+i);
        }
        for(int i=num ;i>=1;i--){
            System.out.println("loop reverse number"+i);
        }
        while(num!=0){
            System.out.println(num);
            num=num-1;
        }do{
            System.out.println("1234");
        }while(num!=0);
    }
}
