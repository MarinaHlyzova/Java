package lr4;

public class example7 {
    public static void main(String[] args) {
        int [] [] arr = new int [5] [5];
        int col = 0;
        int row = 0;
        int b = 0;

        for (int i = 0; row < arr.length; row++) {

            for (int j = 0; j < (arr.length - col); j++) {
                arr[i][j] = b;
                b++;
            }
            if (i < arr.length - 1) {
                i++;}
            for (int j = arr.length - 1; j > col; j--) {
                arr[j][arr.length - 1 - col] = b;
                b++;
            }
            col++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length;
            k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
            }
        }


