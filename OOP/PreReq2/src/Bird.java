public class Bird extends Animal {
    
    //the way to created to Bird needs to be the same as creting an Animal
    //cannot use the default since it is extending from the parent/super class Animal

    public Bird(String _species, int _age, boolean _fur, boolean _eatsMeat, String _name) {
        super(_species, _age, _fur, _eatsMeat, _name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
        
    }

}
