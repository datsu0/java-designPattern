import framework.*;
import idcard.*;

public class Main{
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("水瀬いのり");
        Product card2 = factory.create("大西沙織");
        card1.use();
        card2.use();
    }
}