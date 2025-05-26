package questions.leetcode;

import java.util.Arrays;

public class Set_matrix_zeros_73 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("\n//------------  Using method1: Brute Force Approach  ---------------//");
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        method1(matrix);
        System.out.println("\nMatrix After setZeroes:");
        printMatrix(matrix);

        System.out.println("\n//------------  Using method2: Better Approach  ---------------//");
        System.out.println("Original Matrix:");
        printMatrix(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});

        System.out.println("\nMatrix After setZeroes:");
        method2(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }

// -----------------  Brute Force Approach  -----------------------//
    public static void method1(int[][] matrix){ // TC= O(N^3)= O((m*n)*(m+n))  Space= (1)
        int n=matrix.length;  // row
        int m=matrix[0].length; // column
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //mark row
                    for(int k=0;k<m;k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k]=-1;
                        }
                    }
                    //mark row
                    for(int k=0;k<n;k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j]=-1;
                        }
                    }
                }
            }
        }

        // Second pass: convert all -1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


// -------------------  Better Approach  ---------------------//
    public static void method2(int[][] matrix){ //Tc=O(rows*cols) Space=(rows+cols)
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean [] row=new boolean[rows];
        boolean [] col=new boolean[cols];

        // First pass: mark rows and columns
        for(int i=0;i<rows;i++){   // iterating rows
            for(int j=0;j<cols;j++){ // iterating columns
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        // Second pass: set zeroes
        for(int i=0;i<rows;i++){   // iterating rows
            for(int j=0;j<cols;j++){ // iterating columns
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        printMatrix(matrix);
    }


    public static void printMatrix(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;

//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(STR."\{matrix[i][j]} ");
//            }
//            System.out.println();
//        }
        for (int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }
    }
}
