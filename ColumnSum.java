import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một mảng có sẵn
        double[][] matrix = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.0},
                {7.5, 8.0, 9.5}
        };

        System.out.print("Nhập thứ tự của cột để tính tổng (tính từ 0): ");
        int columnIndex = scanner.nextInt();

        double columnSum = calculateColumnSum(matrix, columnIndex);

        System.out.println("Tổng của cột " + columnIndex + ": " + columnSum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
        System.out.print("Nhập số hàng của mảng: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int numCols = scanner.nextInt();

        double[][] userMatrix = new double[numRows][numCols];

        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập thứ tự của cột để tính tổng (tính từ 0): ");
        columnIndex = scanner.nextInt();

        double userColumnSum = calculateColumnSum(userMatrix, columnIndex);

        System.out.println("Tổng của cột " + columnIndex + ": " + userColumnSum);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tính tổng của một cột trong mảng 2 chiều
    public static double calculateColumnSum(double[][] matrix, int columnIndex) {
        double columnSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            columnSum += matrix[i][columnIndex];
        }
        return columnSum;
    }

}
