public class QwestD
{
    public static String[][] FindMatrix(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[][] matrix =
                {
                        {"1bm", "244", "3fff"},
                        {"254", "2fj", "3543"},
                        {"1sg", "658", "3svd"}

                };
        String[][] outputmatrix =
                {
                        {"1", "1", "1"},
                        {"1", "1", "1"},
                        {"1", "1", "1"}

                };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < alphabet.length(); k++) {
                    for (int l = 0; l < matrix[i][j].length(); l++) {
                        if (matrix[i][j].charAt(l) == alphabet.charAt(k)) {
                            outputmatrix[i][j] = "0";

                        }
                    }

                }
            }
        }

        for (int i = 0; i < outputmatrix.length; i++) {
            for (int j = 0; j < outputmatrix[i].length; j++) {
                System.out.print("|"+outputmatrix[i][j]+ "|"+ " ");
            }
            System.out.println();
        }
        return outputmatrix;
    }
}
