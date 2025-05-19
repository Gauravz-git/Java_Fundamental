/* Default Constructor */

// public class Constructor {
//     Constructor (){
//         System.out.println("Hello World");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Constructor sc = new Constructor();
//     }
// }

/* Parameterized Constructor */

public class Constructor{
    String Name;
    String Contact_no;
    
    Constructor(String a , String b) {
        Name = a;
        Contact_no = b;
    }

    void display() {
        System.out.println("Name: " + Name + "Contact_no: " + Contact_no);
    }
}

class Main{
    public static void main(String[] args){
        Constructor sc = new Constructor("Gaurav", "+91423423423");
        sc.display();
    }
}