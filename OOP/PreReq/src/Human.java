//define a human

public class Human {
    
    //Human attributes
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //how to create a human :: constructor
    public Human(){
        //no need to do anything; this method is automatic
    }

    public Human(String _name, int _age, int _heightInInches, String _eyecolor){
        this.name = _name;
        this.age = _age;
        this.heightInInches = _heightInInches;
        this.eyeColor = _eyecolor;
    }

    //basic behaviors -> methods! Instructions are to create!
    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }

}
