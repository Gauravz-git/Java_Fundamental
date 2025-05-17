
class class_and_objects{ // classname
    String Name; //class attributes
    int number;

    public void integer(){
        System.out.println("Hello World");
    }

    public static void main(String[] args){ // main function
        /* Creating an object using "new" keyboard */
       class_and_objects obj = new class_and_objects(); 
       obj.integer(); // call function with object
    }
}