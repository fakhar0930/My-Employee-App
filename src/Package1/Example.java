package Package1;

public class Example {



    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        // 0 3 4 2 Yes
        // 0 2 5 3 NO
        // 0 8 4 2 NO
        int x1_total=x1+v1;
        int x2_total=x2+v2;
//        int x=9;
//        int y=0;
//
//        while (x!=y){
//            System.out.println(y);
//            y++;
//        }
        int diff_x2=x2_total-x1_total;
        int dif_x1=x1_total-x2_total;
        int speed_differece_x2=v2-v1;
        int speed_difference_x1=v1-v2;


        while (x1_total!=x2_total){

                x1_total = x1_total + v1;
                x2_total = x2_total + v2;
                System.out.println(x1_total + "!= " + x2_total);
                if (x1_total == x2_total) {
                    return "YES";
                }

        }

        return "NO";
    }

    public static void main(String[] args) {


        int x1=0; int v1=8; int x2=4; int v2=2;
        String answer= kangaroo( x1,  v1,  x2,  v2);

        System.out.println(answer);

    }
}
