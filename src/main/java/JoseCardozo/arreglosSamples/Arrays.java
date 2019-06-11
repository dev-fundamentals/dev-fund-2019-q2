package main.java.JoseCardozo.arreglosSamples;

public class Arrays {
    public static void main(String[] args) {
//        FirstExercise();
        secondExercise();
    }

    private static void secondExercise() {
        String[] cadenas = new String[5];
        cadenas[0] = "HOLA";
        cadenas[1] = new String("HOLA");
        cadenas[2] = "123";
        cadenas[3] = "ABC";
        cadenas[4] = new String("HOLA");

        String duplicado = "Palabra: ";
        String index = "Indice: ";
        boolean exist = false;

        for (int i = 0; i < cadenas.length; i++) {
            index += i + ", ";
            for (int j = i+1; j < cadenas.length; j++) {
                if (cadenas[i].equals(cadenas[j]) && !duplicado.contains(cadenas[i])) {
                    duplicado += cadenas[i];
                    index += j + ",";
                    exist = true;
                }
            }
            if (exist){
                System.out.println(index);
            }
        }
    }

    private static void FirstExercise() {
        String[] array_string = new String[5];

        array_string[0] = "This is the First position";
        array_string[1] = "This is the Second position";
        array_string[2] = "This is the Third position";
        array_string[3] = "This is the Fourth position";
        array_string[4] = "This is the Fifth position";

        String baseCad = "HELLO";
        for (int i = 0; i < array_string.length; i++) {
            baseCad = baseCad + array_string[i];
            System.out.println(baseCad);
        }

        String baseCad2 = "Hi";
        for (String cad : array_string) {
            baseCad2 = baseCad2 + cad;
            System.out.println(baseCad2);
            cad = "";
        }

        int i = 0;
        String baseCad3 = "Hi";
        while ( i < array_string.length){
            baseCad3 = baseCad3 + " " + array_string[i];
            System.out.println(baseCad3);
            i++;
        }
    }
}

