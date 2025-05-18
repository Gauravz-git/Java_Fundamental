/* polymorphism */
/* Method overloading(compile-time polymorphism) */


// public class Polymorphism {
    
//     public int parm1(int a, int b){
//         return a + b;
//     }

//     public int parm1(int a, int b, int c){
//         return a + b + c;
//     }

//     public static void main(String[] args){
//         Polymorphism pm = new Polymorphism();
//         int result1 = pm.parm1(1,4);
//         System.out.println("param1:" + result1);
//         int result2 = pm.parm1(3,5, 6);
//         System.out.println("param1:" + result2);
//     }
// }


/* Method overriding(runtime polymorphism) */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
        
    }
}
