package ejerciciomatriz;

public class TP6 {

    public static void armar(int num) {
        int matriz[][] = new int[4][];
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
        int n = num;

        for (int f = 0; f < matriz.length; f++) {
            System.out.print("\n");
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = n;
                n += 3;
                System.out.print(matriz[f][c]);
                System.out.print(" - ");
            }
        }
        System.out.print("\n"); 
        for (int f1 = 0; f1 < matriz.length; f1++) {
            System.out.println("Fila "+f1+" los numeros pares son: ");
            for (int c1 = 0; c1 < matriz[f1].length; c1++) {
                if (matriz[f1][c1] % 2 == 0) {
                    System.out.println("Es par " + matriz[f1][c1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        TP6.armar(3);
    }

}
