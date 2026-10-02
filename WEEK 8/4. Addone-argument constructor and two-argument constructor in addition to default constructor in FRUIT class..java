package argument;
class FRUIT {
    String colour;
    String taste;
    int price;
    
    FRUIT(){
      colour = "Unknown";
      taste = "Unknown";
      price = 0;
    }

    FRUIT(String c){
      colour = c;
      taste = "Unknown";
      price = 0;
    }
    
    FRUIT(String c, String t){
      colour = c;
      taste = t;
      price = 0;
    }    
    
     void display(){
        System.out.println("Colour: "+ colour);
        System.out.println("Taste: "+ taste);
        System.out.println("Price: "+ price);
        System.out.println();
    } 
}

public class Argument {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        FRUIT f2 = new FRUIT("Yellow");
        FRUIT f3 = new FRUIT("Green", "Sour");
        
        f1.display();
        f2.display();
        f3.display();      
    }   
}
