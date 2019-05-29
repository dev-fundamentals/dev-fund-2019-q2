package main.java.BenhaminHuanca;

public class PracticeArrays {
    public static void main(String arg[]) {
        //String homework
        String[] cad = new String[5];
        cad[0] = "HOLA";
        cad[1] = new String("HOLA");
        cad[2] = "ABC";
        cad[3] = "123";
        cad[4] = new String("1234");
        //String aux;
        for (int c = 0; c < cad.length - 1; c++) {
            //aux = cad[c];
            for (int f = c + 1; f < cad.length; f++) {
                if (cad[c].equals(cad[f])) {
                    System.out.println("Indices: " + c + ", " + f);
                    System.out.println("Palabra: " + cad[c]);
                    break;
                }
            }
        }
    }
}
