
public class Grafo{
  private String[] nodos;
  private int cont =0;
  
  private int[][] matriz;
  private boolean dirigido;
  
public Grafo(int CantNodos,boolean dirigido){
    this.nodos=new String[CantNodos];
    this.dirigido = dirigido;

    this.matriz = new int[CantNodos][CantNodos];
    inicializarMatriz();
}

public Grafo(int matriz[][],String nodos[]){
    this.nodos=nodos;
    this.matriz =matriz;
    cont = nodos.length;
}


private void inicializarMatriz(){
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            matriz[i][j] =0;
        }
    }
}



//Se llama al metodo setNodo,para agregar un nodo al array.
//En caso de que el nodo ya este guardado se devuelve su posicion.
//Con las posiciones de los nodos se guarda el peso en la matriz
public void agregarArista(String origen ,String destino,int peso){
    int posicionOri =setNodo(origen);
    int posicionDest =setNodo(destino);

    if(matriz[posicionOri][posicionDest] == 0 && matriz[posicionDest][posicionOri] == 0) {
        if(!dirigido){
            matriz[posicionOri][posicionDest] = peso;
            matriz[posicionDest][posicionOri] = peso;
        }else{
            matriz[posicionOri][posicionDest] = peso;
        }
    }
}



public int setNodo(String nodo){
    int posicion = -1;
    boolean band = true;

    for(int i = 0;i<cont;i++){
        if(this.nodos[i].equals(nodo)){
            posicion = i;
            band = false;
            break;
        }
    }

    if(band){
        this.nodos[this.cont] = nodo;
        posicion = cont;
        cont++;
    }

    return posicion;
}


//Imprime la matriz de adyacencia
public void impMatriz(){
    for (int i=0; i < cont; i++) {
        if(i==0){
            System.out.print("  | ");    
            for (int j=0; j < cont; j++) {
                System.out.print(nodos[j]+" | ");
            }
            System.out.println();
        }
        System.out.print(nodos[i]+" | ");
    
        for (int j=0; j < cont; j++) {  
            System.out.print(matriz[i][j]+" | ");
        }
        System.out.println();
    }
}

public int[][] getMatriz(){
return this.matriz;
}

public String[] getNodos(){
return this.nodos;
}



}
