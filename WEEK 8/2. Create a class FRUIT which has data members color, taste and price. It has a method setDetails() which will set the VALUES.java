package fruit;
class FRUIT {
    String colour;
    String taste;
    int price;
    
    void setDetails(String c, String t, int p){
        colour = c;
        taste = t;
        price = p;
    }
    
    void display(){
        System.out.println("Colour: "+ colour);
        System.out.println("Taste: "+ taste);
        System.out.println("Price: "+ price);
        System.out.println();
    }
}   
public class Setmain {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        FRUIT f2 = new FRUIT();
        FRUIT f3 = new FRUIT();
        
        f1.setDetails("Red", "Sweet", 100);
        f2.setDetails("Yellow", "Sweet", 60);
        f3.setDetails("Green", "Sour", 50);

        f1.display();
        f2.display();
        f3.display();    
    }
}


