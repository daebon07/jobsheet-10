public class bioskop20 {

    public static void main(String[] args) {
        
        String [][] penonton = new String [4][2];

        penonton [0][0] = "amin";
        penonton [0][1] = "bena";
        penonton [1][0] = "candra";
        penonton [1][1] = "dela";
        penonton [2][0] = "eka";
        penonton [2][1] = "farhan";
        penonton [3][0] = "gisel";
        penonton [3][1] = "hana";

        System.out.printf( "%s \t %s \n", penonton[0][0], penonton [0][1]);
        System.out.printf( "%s \t %s \n", penonton[1][0], penonton [1][1]);
        System.out.printf( "%s \t %s \n", penonton[2][0], penonton [2][1]);
        System.out.printf( "%s \t %s \n", penonton[3][0], penonton [3][1]);

        System.out.println(penonton.length);
        for (String [] barispenonton : penonton){
            System.out.println("panjang baris " + barispenonton.length);
        }

        System.out.println("penonton pada baris ke 3- ");

        for (String i :penonton[2]){
            System.out.println(i);
        }
    }
}