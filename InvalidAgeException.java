class InvalidAgeException extends Exception{
    InvalidAgeException(String s){ super(s); }
}
public class InvalidAgeTest{
    public static void main(String[] args){
        int age=15;
        try{
            if(age<18) throw new InvalidAgeException("Invalid Age");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}