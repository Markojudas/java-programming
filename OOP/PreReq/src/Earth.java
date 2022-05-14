public class Earth {

    //Udemy: OOP in Java
    //Example: Human Beings

    public static void main(String[] args) throws Exception {
        
       /*  Human tom; //type Human

        tom = new Human(); //creating a human
        
        System.out.println("------BEFORE ASSIGNING VALUES TO THE HUMAN OBJECT!-------");
        tom.speak(); //the are no attributes assigned to the object

        //assigning values
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";

        System.out.println("\n------After Assigning the values---------");
        tom.speak(); */


        /* Human joe = new Human();
        joe.name = "Joe Mama";
        joe.age = 69;
        joe.heightInInches = 100;
        joe.eyeColor = "Black";

        joe.speak() */;

        Human human1 = new Human("Jose Hernandez", 37, 65, "Black");
        Human human2 = new Human("Damarys Venegas", 43, 60, "Green");
        Human human3 = new Human("Daliani Esparza", 14, 55, "Black");

        human1.speak();
        System.out.println();
        human2.speak();
        System.out.println();
        human3.speak();
    }
}
