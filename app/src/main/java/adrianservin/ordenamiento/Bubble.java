package adrianservin.ordenamiento;

/**
 * Created by adrian_servin on 28/04/15.
 */
public class Bubble {

    private int []datos;

    public void sort(int []datos){
        this.datos=datos;
        int left = 0;
        int right = datos.length-1;
        bubbleSort(left,right);
    }

    private void bubbleSort(int left,int right){

        for(int i=right;i>1;i--){
            for(int j=left;j<i;j++){
                if(datos[j] > datos[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    public void swap(int left,int right){
        int temp = datos[left];
        datos[left] = datos[right];
        datos[right] = temp;
    }


}
