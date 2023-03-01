

public class IdentityMatrix<T> extends Matrix<T> {
    public IdentityMatrix(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public boolean setNumbers(T[] numbers) {
        if (this.isCorrectDimensions(numbers) && this.isIdentity(numbers)) {
            super._setNumbers(numbers);
            return true;
        }
        return false;
    }

    @Override
    protected boolean isCorrectDimensions(T[] numbers) {
        return rows == cols && super.isCorrectDimensions(numbers);
    }

    private boolean isIdentity(T[] numbers) {
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && (int) numbers[index] != 1) {
                    return false;
                }
                if (i != j && (int) numbers[index] != 0) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }

    @Override
    public void transpose() {
        // do nothing
    }


}
