public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(2, 3);
        int[] numbers = {1, 2, 3, 4, 5, 6};
        matrix.setNumbers(numbers);
        matrix.print(); // Print original matrix
        System.out.println("--------------------");
        matrix.transpose();
        matrix.print(); // Print transposed matrix
        System.out.println("--------------------");

        Matrix other = new Matrix(2, 3);
        int[] numbers2 = {1, 1, 2, 2, 3, 3};
        other.setNumbers(numbers2);
        other.transpose();
        matrix.add(other); // Add transposed matrix to original matrix
        matrix.print(); // Print added matrix
        System.out.println("--------------------");

        IdentityMatrix identity = new IdentityMatrix(4);
        int[] numbers3 = {1, 1, 1, 1};
        identity.setNumbers(numbers3);
        identity.print();
        System.out.println("--------------------");
        identity.transpose();
        identity.print();
        System.out.println("--------------------");
        identity.add(identity); // Add identity matrix to itself
        identity.print();
        System.out.println("--------------------");

        IdentityMatrix identity2 = new IdentityMatrix(4);
        int [] numbers4 = {1, 1, 1, 2}; // This should not work
        identity2.setNumbers(numbers4);
        identity2.print();
    }
}