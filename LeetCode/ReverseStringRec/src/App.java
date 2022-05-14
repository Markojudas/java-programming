public class App {

    public static void reverseString(String str){
        
        if(str.length() <= 1 || str == null) System.out.println(str); 
        else {
            System.out.print(str.charAt(str.length() -1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) throws Exception {
        String str = "Hello";
        String str2 = "";
        
        reverseString(str);
        reverseString(str2);
    }
}
