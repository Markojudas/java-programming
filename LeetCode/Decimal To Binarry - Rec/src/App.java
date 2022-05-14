public class App {

    public static void toBinaryRec(int n){

        if (n <= 1){
            System.out.print(n);
        } 
        else{
            toBinaryRec(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) throws Exception {
       int n = 100;

       toBinaryRec(n);
    }
}
