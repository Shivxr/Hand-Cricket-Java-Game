import java.util.*;
public class Bowl {
    public int play(int t,int f){
        Scanner sc=new Scanner(System.in);
        int score=0;
        int target=0;
        while(true){
            System.out.println("Enter your Bowling Choice between 1 to 6 : ");
            int uip=sc.nextInt();
            int bip=(int)(Math.random()*6)+1;
            System.out.println("The user choice is : "+uip);
            System.out.println("The bot choice is : "+bip);
            if(uip==bip) {
                System.out.println("The score is " + score + " and the Bot is out");
                break;
            }
            else{
                score+=bip;
                System.out.println("The score is :"+score);
            }
            if(score>=t && f==1){
                break;
            }
        }
        if (f == 0) {
            target=score+1;
            System.out.println("The Target is : "+target);
            return target;}
        else{
            if(score>=t){
                System.out.println("Bot won the match");
            }
            else if(score<=t){
                System.out.println("User won the Match");
            }
            else{
                System.out.print("Its a Tie");
            }
            return 0;
        }
    }
}
