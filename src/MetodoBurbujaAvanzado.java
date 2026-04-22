public class MetodoBurbujaAvanzado {

    int[]arreglo;

    public MetodoBurbujaAvanzado(int[] arreglo){
        this.arreglo = arreglo;

    }
    public void sort(boolean asc){
        int tam = arreglo.length;
        int contConparaciones=0;
        int contCambios=0;
        boolean huboIntercambios;

        for (int i =0; i< tam -1; i ++){
            huboIntercambios = false;
            for (int j =0; j < tam -1 -i; j ++){
                contConparaciones++;
                
                //comparacion
                if (asc){
                    //true ascendente
                    if (arreglo[j] > arreglo[j+1]){
                        contCambios++;
                        huboIntercambios= true;
                        int aux = arreglo[j];
                        arreglo[j]= arreglo[j+1];
                        arreglo[j + 1] = aux;
                     }
            } else{
                    //false descendente
                    if (arreglo[j] > arreglo[j+1]){
                        contCambios++;
                        huboIntercambios= true;
                        int aux = arreglo[j];
                        arreglo[j]= arreglo[j+1];
                        arreglo[j + 1] = aux;
                    }
                    if (huboIntercambios){
                         break;
                    }
            
                }
            
                
            }
        
        }
        System.out.println("comparaciones:" + contConparaciones);
        System.out.println("cambios:" + contCambios);
        }
    public void printArreglo(){
        for (int num: arreglo){
            System.out.print(num + ",");
        }
        System.out.println();
    

    }
    
}
