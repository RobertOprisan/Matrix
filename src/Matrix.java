public class Matrix {
    public static void main(String[] args) {
        int count = 0;
        int [][] matrix;
        matrix = new int[4][7];
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                count ++;
                matrix[i][j] = count;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
