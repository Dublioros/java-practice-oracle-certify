public class Instanceof {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        System.out.println(true);

        //Octal bases when an int starts with 0
        int[] a = {1, 2, 053, 4};
        int[][] b = { {1, 2, 4} , {2, 2 ,1}, {0, 43, 2}};

        System.out.println(a[3] == b[0][2]);
        System.out.print(" " + (a[2] == b[2][1]));
        System.out.println(b[2][1]);
        System.out.println(a[2]);
    }
}
