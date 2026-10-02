package constructor_chaining;
class FRUIT {
    String colour;
    String taste;
    int price;
    
    FRUIT(){
    this("Unknown", "Unknown",0);
    }

    FRUIT(String c){
    this(c, "Unknown",0);
    }
    
    FRUIT(String c, String t){
    this(c, t,0);
    }  
    
    FRUIT(String c, String t, int p){
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

public class Constructor_chaining {
    public static void main(String[] args) {
        FRUIT f1 = new FRUIT();
        FRUIT f2 = new FRUIT("Yellow");
        FRUIT f3 = new FRUIT("Red", "Sweet");
        FRUIT f4 = new FRUIT("Green", "Sour", 40);

        f1.display();
        f2.display();
        f3.display(); 
        f4.display();       
    }   
}
