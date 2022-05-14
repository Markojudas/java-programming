
//parent class....abstract class cannot create object!
public abstract class Animal {
    
    String species;
    int age;
    boolean fur;
    boolean eatsMeat;
    String name;


    public Animal(String _species, int _age, boolean _fur, boolean _eatsMeat, String _name){

        this.species = _species;
        this.age = _age;
        this.fur = _fur;
        this.eatsMeat = _eatsMeat;
        this.name = _name;
    }

    public void speak(){
        if(this.species.equalsIgnoreCase("lion")) System.out.println("RAWR!!!");
        else if(this.species.equalsIgnoreCase("dog")) System.out.println("WOOF!");
        else System.out.println("MEOW!");
    }

    public void eat(){
        System.out.println("nom nom nom nom");
    }

    public void sleep(){
        System.out.println("zzZZZzz");
    }

    public void poop(){
        System.out.println("CHARMING CLEAN!");
    }

    public abstract void move(); //animals move differently

}
