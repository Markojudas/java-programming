public class Fish extends Animal {
    
    String name;

    public Fish(String _species, int _age, boolean _fur, boolean _eatsMeat, String _name) {
        super(_species, _age, _fur, _eatsMeat, _name);
        this.name = _name;
    }

    public void swim(){
        System.out.println("Swimming...");
    }

    @Override
    public void move() {
        
        System.out.println("fish " + name + " is swimming");
    }

}
