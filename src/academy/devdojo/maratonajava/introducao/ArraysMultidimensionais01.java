package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //  1,  2,  3,  4,  5 Meses
        // 31, 28, 31, 30, 31 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 15;
        dias[0][2] = 31;

        dias[1][0] = 1;
        dias[1][1] = 14;
        dias[1][2] = 28;

        dias[2][0] = 1;
        dias[2][1] = 15;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
