import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bal=1000;
        System.out.println("1.Withdraw 2.Deposit");
        int ch=sc.nextInt();
        int amt=sc.nextInt();
        if(ch==1 && amt<=bal) bal-=amt;
        else if(ch==2) bal+=amt;
        System.out.println("Balance="+bal);
    }
}