public class MetodoSeleccion {

    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceDelMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceDelMenor]) {
                    indiceDelMenor = j;
                }
            }

            if (i != indiceDelMenor) {
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    public void printArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
