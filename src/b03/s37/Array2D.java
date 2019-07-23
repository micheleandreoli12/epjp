package b03.s37;

public class Array2D {
    public static void main(String[] args) {
        int[][] array2d = new int[4][5];

        int value = array2d[2][3];
        
        array2d[1][1]=7;
        array2d[3][4]=26;
        System.out.println(array2d[1][1]);
        System.out.println(array2d[3][4]);
        System.out.println(array2d[1]);
        
        System.out.println(array2d[2][3] + ", " + value);
        System.out.println(array2d[3][4]);
    }
}