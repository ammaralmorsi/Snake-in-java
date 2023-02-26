public class Matrix implements Addable<Matrix> {
    protected int[][] matrix;
    protected int rows;
    protected int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public void setNumbers(int[] numbers) {
        int i = 0;
        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                this.matrix[row][column] = numbers[i];
                i++;
            }
        }
    }

    public void print() {
        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                System.out.print(this.matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void transpose() {
        int[][] newMatrix = new int[this.columns][this.rows];
        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                newMatrix[column][row] = this.matrix[row][column];
            }
        }
        this.matrix = newMatrix;
        int temp = this.rows;
        this.rows = this.columns;
        this.columns = temp;
    }

    @Override
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            return null;
        }
        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                this.matrix[row][column] = this.matrix[row][column] + other.matrix[row][column];
            }
        }
        return this;
    }
}
