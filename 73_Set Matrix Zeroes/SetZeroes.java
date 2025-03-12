public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        if (matrix.length >= 2 && matrix[0].length >= 2) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[0][i] == 0) {
                    for (int j = 1; j < matrix[i].length; j++) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0) {
                    for(int i =1;i < matrix.length;i++) {
                        matrix[i][j] = 0;
                    }
                }
            }}
        if(firstRowHasZero) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[0][j] = 0;
            }
        }
        if(firstColHasZero) {
            for(int i=0;i<matrix.length;i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
