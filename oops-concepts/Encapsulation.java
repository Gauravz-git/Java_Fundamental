/* Encapsulation */
 class Student {
    private String Name; // Access Modifier "private"
    private int Age;

    // getters and setters for Name
    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    //getters and setters for Age
    public int getAge(){
        return Age;
    }

    public void setAge(int age){
        if(age > 0){
            this.Age = age;
        } else{
            System.out.println("Age is incorrect!!");
        }
        
    }
}

class Encapsulation{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Gaurav");
        s.setAge(23);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
 