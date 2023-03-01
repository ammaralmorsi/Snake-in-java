

public class Matrix<T> {
    protected T[][] numbers;
    protected int rows;
    protected int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        numbers = (T[][]) new Object[rows][cols];
    }

    public boolean setNumbers(T[] numbers) {
        if (!isCorrectDimensions(numbers))
            return false;
        _setNumbers(numbers);
        return true;
    }

    protected void _setNumbers(T[] numbers) {
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.numbers[i][j] = numbers[index];
                index++;
            }
        }
    }

    protected boolean isCorrectDimensions(T[] numbers) {
        return numbers.length == rows * cols;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transpose() {
        T[][] transposed = (T[][]) new Object[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = numbers[i][j];
            }
        }
        numbers = transposed;
        int temp = rows;
        rows = cols;
        cols = temp;
    }
}