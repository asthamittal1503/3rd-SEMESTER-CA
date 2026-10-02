package javamain;
class FRUIT{
    String colour;
    String taste;
    int price;
    
    void display(){
        System.out.println("Colour: "+ colour);
        System.out.println("Taste: "+ taste);
        System.out.println("Price: "+ price);
        System.out.println();
    }
}
public class JavaMain {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        f1.colour = "Red";
        f1.taste = "Sweet";
        f1.price = 100;
        f1.display();

        FRUIT f2 = new FRUIT();
        f2.colour = "Yellow";
        f2.taste = "Sweet";
        f2.price = 60;
        f2.display();

        FRUIT f3 = new FRUIT();
        f3.colour = "Green";
        f3.taste = "sour";
        f3.price = 40;
        f3.display(); 
        
    }
}

