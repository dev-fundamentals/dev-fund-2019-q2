package main.java.BenhaminHuanca;

public class PracticeArrays {
    public static void main(String arg[]) {
        //String homework
        int[] index = new int[5];
        int position = 0;
        String[] cad = new String[5];
        cad[0] = "HOLA";
        cad[1] = new String("HOLA");
        cad[2] = "ABC";
        cad[3] = "123";
        cad[4] = new String("HOLA");

        for (int c = 0; c < cad.length - 1; c++) {
            index[position] = c;
            position++;
            for (int f = c + 1; f < cad.length; f++) {
                if (cad[c].equals(cad[f])) {
                    index[position] = f;
                    position++;
                }
            }
            if (position > 1) {
                break;
            } else {
                position = 0;
            }
        }
        if (position >= 1) {
            System.out.println("Palabra: " + cad[index[0]]);
            System.out.print("Indices: ");
            for (int i = 0; i < position; i++){
                System.out.print(index[i] + " ");
            }
        }else{
            System.out.print("No se encontraron items duplicados...");
        }
    }
}
