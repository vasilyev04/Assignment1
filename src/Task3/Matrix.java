package Task3;

public class Matrix {
    private final int[][] matrix;
    private final int rows;
    private final int columns;

    public int getColumns() {
        return columns;
    }

    public int getRows(){
        return rows;
    }


    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public void add(Matrix matrix) throws RuntimeException{
        if(this.rows != matrix.rows || this.columns != matrix.columns){
            throw new RuntimeException("Impossible to add because matrices have different size");
        }

        for(int row = 0; row < rows; row++){
            for (int col = 0; col < columns; col++) {
                this.matrix[row][col] += matrix.matrix[row][col];
            }
        }
    }

    public void multiplyByNumber(int number){
        for(int row = 0; row < rows; row++){
            for (int col = 0; col < columns; col++) {
                this.matrix[row][col] *= number;
            }
        }
    }

    public void printMatrix(){
        for (int[] row : this.matrix) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
