class BankException extends Exception{
    BankException(String s){ super(s); }
}
public class BankAccount{
    public static void main(String[] args){
        int bal=500;
        try{
            int withdraw=1000;
            if(withdraw>bal) throw new BankException("Insufficient Balance");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}