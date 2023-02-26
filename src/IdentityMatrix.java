public class IdentityMatrix extends Matrix{
    public IdentityMatrix(int size) {
        // Takes only the size because the identity matrix has the same number of rows and columns.
        super(size, size);
    }

    @Override
    public void setNumbers(int[] numbers) {
        if (numbers.length != this.rows) {
            return;
        }
        for (int number : numbers) {
            if (number != 1) {
                return;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            this.matrix[i][i] = numbers[i];
        }
    }

    @Override
    public void transpose() {
    }
}
