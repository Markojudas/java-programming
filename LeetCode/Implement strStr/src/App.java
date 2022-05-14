public class App {

    public static int strStr(String haystack, String needle){

        int needle_size = needle.length(),
        haystack_size = haystack.length();

        if(needle_size == 0) return 0;
        else if (needle_size > haystack_size) return -1;
        else if(needle_size < haystack_size){
            for(int i = 0; i <= haystack_size - needle_size; i++){
                int j = i + needle_size;
                if(haystack.substring(i, j).equals(needle)) return i;
            }
        }
        else
            if(needle.equals(haystack)) return 0;
        
        return -1;        
    }

    public static void main(String[] args) throws Exception {
        
        String haystack1 = "hello", needle1 = "ll";
        String haystack2 = "aaaaa", needle2 = "bba";
        String haystack3 = "", needle3 = "";
        String haystack4 = "aaa", needle4 = "aaa";

        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
        System.out.println(strStr(haystack4, needle4));

    }
}
