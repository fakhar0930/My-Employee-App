package Package2;

public class Palindrom {

    public static boolean checkPalindrome(String s){

        s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start=0;
        int end=s.length()-1;

        //ABCBA
        //ABCCBA

        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
               return false;
            }
            start++;
            end--;
        }

        System.out.println("String " + s + " is Palindrome");
        return true;


    }

    public static int factorial(int n){

        int factorial=0;
        int factor=n*n-1;
        factorial=factorial+factor;

        if (n<=0){
            return factorial;
        }
       return factorial(n-1);
    }


    //9876
    public static int sumOfDigits(int i){


    }

    public static void main(String[] args) {

        String s= "dAbBaD";
        boolean isPalindrome= checkPalindrome(s);

        System.out.println(isPalindrome);


        System.out.println(factorial(4));
    }



}
