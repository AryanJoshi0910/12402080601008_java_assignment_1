class Matrix {
    int[][] m;
    int r, c;

    Matrix(int[][] m) {
        this.m = m;
        this.r = m.length;
        this.c = m[0].length;
    }

    void display() {
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    void transpose() {
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        System.out.println("Transpose:");
        new Matrix(t).display();
    }

    void multiply(Matrix b) {
        int[][] res = new int[r][b.c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < b.c; j++)
                for (int k = 0; k < c; k++)
                    res[i][j] += m[i][k] * b.m[k][j];
        System.out.println("Product:");
        new Matrix(res).display();
    }
}

public class A1P2 {
    public static void main(String[] args) {
        Matrix a = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix b = new Matrix(new int[][]{{5, 6}, {7, 8}});
        System.out.println("Matrix A:");
        a.display();
        a.transpose();
        a.multiply(b);
    }
}
