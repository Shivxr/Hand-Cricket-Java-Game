import java.util.*;
public class Main {
    public static void main(String[] args) {
        int tf=0;
        int mf=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice odd or even : ");
        String s=sc.nextLine().toLowerCase();
        System.out.println("Enter Number for Toss : ");
        int uc=sc.nextInt();
        sc.nextLine();
        int bc=(int)(Math.random()*6)+1;
        System.out.println(bc);
        int sm=uc+bc;
        if(sm%2==0 && s.equals("even")){
            tf=1;
            System.out.println("User won the Toss");
        }
        else if(sm%2!=0 && s.equals("odd")) {
            tf = 1;
            System.out.println("User won the Toss");
        }
        else{
            System.out.println("Bot won the toss");
        }
        if(tf==1){
            System.out.print("Enter choice for Batting or Bowling : ");
            String choice=sc.nextLine().toLowerCase();
            if(choice.equals("bat")) {
                System.out.println("User Chose to Bat");
                mf = 1;
            }
            else{
                System.out.println("User Chose to Bowl");
            }
        }
        else{
            int ch=(int)(Math.random()*2)+1;
            if(ch==1){
                System.out.println("Bot chose to Bat");
            }
            else{
                System.out.println("Bot Chose to Bowl");
                mf=1;
            }
        }
        Bat ob1=new Bat();
        Bowl ob2=new Bowl();
        if(mf==1){
            int z=ob1.play(0,0);
            ob2.play(z,1);
        }
        else{
            int z=ob2.play(0,0);
            ob1.play(z,1);
        }
    }
}
