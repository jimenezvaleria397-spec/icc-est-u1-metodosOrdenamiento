public class MetodoBurbuja {
    int [] arreglo;

    //Cosntructor vacio 
    public MetodoBurbuja(int[] arreglo){
        System.out.println("Se ceo la clase Metodo Burbuja");
        this.arreglo= arreglo;
        }
        public void ordenarAscendente(){
        for (int i = 0; i<arreglo.length;i++){
                for (int j=i+1; j < arreglo.length; j++){
                    if(arreglo[i] > arreglo[j]){
                        int aux = arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]= aux;

                    }
                }
            }
        }
    public void imprimirArreglo(){
        for (int num: arreglo){
            System.out.println(num + ",");
        }
        System.out.println();
    }
      public void ordenarDescendente(){
        for (int i = 0; i<arreglo.length;i++){
                for (int j=i+1; j < arreglo.length; j++){
                    if(arreglo[i] < arreglo[j]){
                        int aux = arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]= aux;

                    }
                }
            }
        }
}