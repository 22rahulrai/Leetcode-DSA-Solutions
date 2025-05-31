package questions.leetcode;
import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix_54 {
    public static void main(String[] args) {

//        Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        int[][] mat = {
//                {1},
//                {2},
//                {3},
//                {4}
//        };

        List<Integer> ans = printSpiral(mat);

        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }

    public static List<Integer> printSpiral(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;

        List<Integer> list=new ArrayList<>();

        int startrow=0,endrow=rows-1;
        int startcol=0,endcol=cols-1;

        while(startrow<=endrow && startcol<=endcol){

            // top
            for(int j=startcol;j<=endcol;j++) {
                list.add(mat[startrow][j]);
            }

            // right
            for(int i=startrow+1;i<=endrow;i++){
                list.add(mat[i][endcol]);
            }

            // bottom
            if(startrow<endrow){
                for(int j=endcol-1;j>=startcol;j--){
                    list.add(mat[endrow][j]);
                }
            }


            // left
            if(startcol<endcol){
                for(int i=endrow-1;i>startrow;i--){
                    list.add(mat[i][startcol]);
                }
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        return list;
    }
}