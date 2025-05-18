/* single inheritance */

// public class Inheritance {
//     public void car(){
//         System.out.println("Car is running .............");
//     }
// }

// class Child extends Inheritance {
//     public void volvo(){
//         System.out.println("Volvo is driving........");
//     }

//     public static void main(String [] args){
//         Child c = new Child();
//         c.volvo();
//     }
// }


/* multi level Inheritance */

// public class Inheritance {
//     public void bird(){
//         System.out.println("This is a bird");
//     }
// }

// class Parrot extends Inheritance {
//     public void birdisparrot(){
//         System.out.println("bird is parrot");
//     }
// }

// class parrotcolor extends Parrot {
//     public void birdcolor(){
//         System.out.println("Parrot is Green");
//     }
// }

// class Main{
//     public static void main(String[] args){
//         parrotcolor pc = new parrotcolor();
//         pc.bird();
//         pc.birdisparrot();
//         pc.birdcolor();
//     }
// }


/* Hierarchical level inheritance */

public class Inheritance{
    public void Animal(){
        System.out.println("Animall.....");
    }
}

class dog extends Inheritance {
    public void isdog(){
        System.out.println("Dog is barking");
    }
}

class cat extends Inheritance {
    public void iscat(){
        System.out.println("Cat is Mewwing");
    }
}

class Main{
    public static void main(String[] args){
        cat c = new cat();
        c.Animal();
        c.iscat();
    }
}