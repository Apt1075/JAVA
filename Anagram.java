public class Anagram {
    public static boolean isAnagram(String str, String str1) {
        int c = str.length();
        int d = str1.length();
        
        if(str.length() != str1.length())
            return false;
        
        for(int i =0; i<c;i++){
            for(int j =0; j<d;j++){
                    if(str1.charAt(j) == str.charAt(i))
                    return true;
            }
        }
        return false;
    }


    public static void main (String[]args)
    {
     
      String str = "anagram";
      String  str1  = "nagaram";
    boolean k = isAnagram(str ,str1);

    System.out.print(k);

    }  
} 
