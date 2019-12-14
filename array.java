public class array {
    public static void main(String[] args) {
        array a = new array();
        a.arrayy();
    }

    public void arrayy() {
        int[] num = new int[6];
        num[0] = 21;
        num[1] = 20;
        num[2] = 23;
        num[3] = 19;
        num[4] = 18;
        num[5] = 32;

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        int avg=sum/num.length;
        System.out.println("sum of all the numbers is " + sum);
        System.out.println("average of numbers is "+ avg);
    }
}
