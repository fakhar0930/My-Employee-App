package Package1;

public class Leetcode {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public int[] twoSum(int[] nums, int target) {
        int[] array= new int[2];
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                }
            }
        }
        return array;
    }



    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        int re= strings.length;
        return strings[re].length();
    }

    public static void main(String[] args) {
        int[] arrrrr= {3,3};


        int[] arr= new int[2];
        Leetcode leetcode = new Leetcode();
        int[] ar=leetcode.twoSum(arrrrr,6);
        System.out.println(ar);

        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
            }

        String s= "Hello World";
        String[] strings = s.split(" ");
        //leetcode.lengthOfLastWord(s);
        System.out.println(strings[0]);


        final  String stysty= "Fakhar";
        String you= stysty +" Qureshi";
        stysty.concat(" Qureshi");
        you.concat(" Mandsaur");
        System.out.println(you);

        //stysty= "Qureshi";
        System.out.println(you);
        System.out.println(stysty);
    }

}
