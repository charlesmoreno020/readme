package chapter1;
public class Toy {
    public String name = "Lego" ;
    public String brand = "LEGO Company" ; 
    public double price;
    public int quantity; 


// set the amount of the toy to the argument example setPrice(1000) //
    void setPrice (double price) {this.price = price;

    }

    // psvm //
    public static void main (String [] args ) {


        System.out.println("Hello Java Trainees");

        Toy toy1 = new Toy();

        System.out.println(toy1.name);

        System.out.println(toy1.brand);
        
        
    }
}
    
    

    class Fruit {}
    class Fruit2 {}
    class Fruit3 {

    int numberofLeaves;

    }
      


    class Fruit4 {

 //PSVM//
    public static void main (String [] args ) {


        Fruit f3 = new Fruit3 ;

        f3.numberofLeaves = 31;

        System.out.println("I am Fruit 4");

        System.out.println(f3.numberofLeaves);
    

    
  
}



    }





