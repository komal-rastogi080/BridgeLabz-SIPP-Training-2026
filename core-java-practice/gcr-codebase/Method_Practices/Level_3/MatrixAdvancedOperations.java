public class MatrixAdvancedOperations {
    
    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Math.round((Math.random() * 10) * 100.0) / 100.0;
            }
        }
        
        return matrix;
    }
    
    // Method to find the transpose of a matrix
    public static double[][] findTranspose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
    
    // Method to find determinant of a 2x2 matrix
    public static double findDeterminant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
    
    // Method to find determinant of a 3x3 matrix
    public static double findDeterminant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        
        double det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                   - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                   + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        
        return det;
    }
    
    // Method to find inverse of a 2x2 matrix
    public static double[][] findInverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        
        double det = findDeterminant2x2(matrix);
        
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted");
        }
        
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        
        return inverse;
    }
    
    // Method to find inverse of a 3x3 matrix
    public static double[][] findInverse3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        
        double det = findDeterminant3x3(matrix);
        
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted");
        }
        
        double[][] inverse = new double[3][3];
        
        // Calculate adjugate matrix and divide by determinant
        inverse[0][0] = ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])) / det;
        inverse[0][1] = -((matrix[0][1] * matrix[2][2]) - (matrix[0][2] * matrix[2][1])) / det;
        inverse[0][2] = ((matrix[0][1] * matrix[1][2]) - (matrix[0][2] * matrix[1][1])) / det;
        
        inverse[1][0] = -((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])) / det;
        inverse[1][1] = ((matrix[0][0] * matrix[2][2]) - (matrix[0][2] * matrix[2][0])) / det;
        inverse[1][2] = -((matrix[0][0] * matrix[1][2]) - (matrix[0][2] * matrix[1][0])) / det;
        
        inverse[2][0] = ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])) / det;
        inverse[2][1] = -((matrix[0][0] * matrix[2][1]) - (matrix[0][1] * matrix[2][0])) / det;
        inverse[2][2] = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0])) / det;
        
        return inverse;
    }
    
    // Method to display a matrix
    public static void displayMatrix(double[][] matrix, String matrixName) {
        System.out.println("\n" + matrixName + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%8.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Matrix Advanced Operations");
        System.out.println("==========================");
        
        // 2x2 Matrix Operations
        System.out.println("\n--- 2x2 Matrix Operations ---");
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2x2, "Original Matrix (2x2)");
        
        // Transpose
        double[][] transpose2x2 = findTranspose(matrix2x2);
        displayMatrix(transpose2x2, "Transpose of Matrix");
        
        // Determinant
        double det2x2 = findDeterminant2x2(matrix2x2);
        System.out.println("\nDeterminant: " + det2x2);
        
        // Inverse
        if (det2x2 != 0) {
            double[][] inverse2x2 = findInverse2x2(matrix2x2);
            displayMatrix(inverse2x2, "Inverse of Matrix");
        } else {
            System.out.println("\nMatrix is singular and cannot be inverted");
        }
        
        // 3x3 Matrix Operations
        System.out.println("\n--- 3x3 Matrix Operations ---");
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3x3, "Original Matrix (3x3)");
        
        // Transpose
        double[][] transpose3x3 = findTranspose(matrix3x3);
        displayMatrix(transpose3x3, "Transpose of Matrix");
        
        // Determinant
        double det3x3 = findDeterminant3x3(matrix3x3);
        System.out.println("\nDeterminant: " + det3x3);
        
        // Inverse
        if (det3x3 != 0) {
            double[][] inverse3x3 = findInverse3x3(matrix3x3);
            displayMatrix(inverse3x3, "Inverse of Matrix");
        } else {
            System.out.println("\nMatrix is singular and cannot be inverted");
        }
    }
}
