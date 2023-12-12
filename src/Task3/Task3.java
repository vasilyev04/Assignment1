package Task3;

public class Task3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}});
        Matrix matrix2 = new Matrix(new int[][]{{1,1,1}, {1,1,1}, {1,1,1}});

        matrix.add(matrix2);
        matrix.printMatrix();



    }
}
