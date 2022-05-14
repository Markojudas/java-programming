public class Sparrow extends Bird implements Flyable {

    String name;

    public Sparrow(String _species, int _age, boolean _fur, boolean _eatsMeat, String _name) {
        super(_species, _age, _fur, _eatsMeat, _name);
        
        this.name = _name;
    }

    @Override
    public void fly() {
        System.out.println("Sparrow  " + name + " high");        
    }

}
