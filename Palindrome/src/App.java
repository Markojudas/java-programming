public class App {

    public static boolean isPalindrome(String s){
        
        if(s.length() == 1) return true;

        int i = 0, j = s.length() -1;

        while(i < j){
            while(!Character.isLetterOrDigit(s.charAt(i))) i++;
            while(!Character.isLetterOrDigit(s.charAt(j))) j--;

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        
        String str = "Race car!";

        System.out.println(isPalindrome(str));

    }
}
