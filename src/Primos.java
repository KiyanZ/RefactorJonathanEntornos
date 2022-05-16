public class Primos {
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max) {
        int i,j;
        if (max >= 2) {
            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            arrayInitializer(dim, esPrimo);
            getPrimes(dim, esPrimo);
            return getInts(dim, esPrimo);
        }
        else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    private static void arrayInitializer(int dim, boolean[] esPrimo) {
        int i;
        // Inicializar el array
        for (i=0; i< dim; i++) {
            hardcodeRemove01(esPrimo, i, true);
        }
    }

    private static int[] getInts(int dim, boolean[] esPrimo) {
        int i;
        int j;
        int cuenta = getCuenta(dim, esPrimo);
        // Rellenar el vector de números primos
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    private static int getCuenta(int dim, boolean[] esPrimo) {
        int i;
        // ¿Cuántos primos hay?
        int cuenta = 0;
        for (i=0; i< dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static void getPrimes(int dim, boolean[] esPrimo) {
        int i;
        int j;
        hardcodeRemove01(esPrimo, 0, esPrimo[1] = false);
        // Criba
        for (i=2; i<Math.sqrt(dim)+1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (j = 2 * i; j < dim; j += i) {
                    hardcodeRemove01(esPrimo, j, false);
                }
            }
        }
    }

    private static void hardcodeRemove01(boolean[] esPrimo, int x, boolean esPrimo1) {
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[x] = esPrimo1;
    }
}