public class Main {

    public static void main(String[] args) {

        System.out.println("Matrix");
        Integer[] numbers = {1, 0, 0, 1};
        Matrix<Integer> matrix = new Matrix<>(2, 2);
        matrix.setNumbers(numbers);
        matrix.print();
        System.out.println("Transpose: Matrix");
        matrix.transpose();
        matrix.print();
        System.out.println();

        System.out.println("IdentityMatrix");
        IdentityMatrix<Integer> identityMatrix = new IdentityMatrix<>(2, 2);
        if(identityMatrix.setNumbers(numbers)) {
            identityMatrix.print();
            System.out.println("Transpose: IdentityMatrix");
            identityMatrix.transpose();
            identityMatrix.print();
        }
        System.out.println();

        Integer[] numbers2 = {1, 2, 3, 4, 5, 6};

        System.out.println("Matrix2");
        Matrix<Integer> matrix2 = new Matrix<>(2, 3);
        matrix2.setNumbers(numbers2);
        matrix2.print();
        System.out.println("Transpose: Matrix2");
        matrix2.transpose();
        matrix2.print();
        System.out.println();

        System.out.println("IdentityMatrix2");
        IdentityMatrix<Integer> identityMatrix2 = new IdentityMatrix<>(2, 3);
        if(identityMatrix2.setNumbers(numbers2)) {
            identityMatrix2.print();
            System.out.println("Transpose: IdentityMatrix2");
            identityMatrix2.transpose();
            identityMatrix2.print();
        }
    }
}