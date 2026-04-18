interface A{ void show(); }
interface B{ void display(); }
public class TwoInterfaces implements A,B{
    public void show(){ System.out.println("A"); }
    public void display(){ System.out.println("B"); }
    public static void main(String[] args){
        TwoInterfaces t=new TwoInterfaces();
        t.show(); t.display();
    }
}