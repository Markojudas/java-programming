public class Zoo {
    public static void main(String[] args) throws Exception {
        
        Animal sparrow1 = new Sparrow("Bird", 5, false, false, "Chuck");

        Animal fish1 = new Fish("Fish", 100, false, false, "Nemo");
        
        Fish fish2 = new Fish("Fish", 150, false, false, "Dory");

        moveAnimal(sparrow1);
        moveAnimal(fish1);
        moveAnimal(fish2);

    }


    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
