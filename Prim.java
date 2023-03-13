
public class Prim{ 
  private int matriz[][];
  private String[] nodos;
  private int numNodos;
  
  private final int infinito = 999999999;
  private int[] distancia;
  private boolean[] visto;
  private int[] camino;
  private int subMatriz[][];

public Prim(int[][] matriz,String[] nodos) {
  this.matriz = matriz;
  this.nodos = nodos;
  this.numNodos = nodos.length;
  
  this.subMatriz= new int[numNodos][numNodos];
  distancia = new int[numNodos];
  visto = new boolean[numNodos];
  camino = new int[numNodos];
  
  for (int i = 0; i < numNodos; i++) {
      distancia[i] = infinito;
      visto[i] = false;
      for(int j = 0; j < numNodos; j++){
         this.subMatriz[i][j]=0;
        } 
  } 
}


public void SubGrafo(int nodoInicial) {
distancia[nodoInicial]=0;
camino[nodoInicial]= 0;

for (int i = 0; i < numNodos; i++) {
  int u = minDistancia(distancia, visto);  
   visto[u] = true;
 
  for (int j = 0; j < numNodos; j++) {
   if ((!visto[j]) && (matriz[u][j] > 0) ){
    //Verifico que visto en la posicion [j] sea false 
    //Verifico que la matriz en la fila [u] y columna [j] se mayor que cero    
    if( distancia[u] != infinito) { 
          //Verifico que la distancia el la posicion [u] sea diferente de "infinito"
         if(matriz[u][j] < distancia[j]){
           //Verifico que la suma entre distancia [u] y la matriz [u][j] sea menor que distancia [j]
           if( distancia[j] !=  infinito){
            subMatriz[camino[j]][j]=0;
            subMatriz[j][camino[j]]=0;
            }
           
           distancia[j] = matriz[u][j];
           subMatriz[u][j] = matriz[u][j];
           subMatriz[j][u] = matriz[u][j];
 
           camino[j] = u;
         }
       }
    }
 }
}
}

private int minDistancia(int[] dist, boolean[] nodoYaProcesado){
  int min = infinito;
  int min_index=0;

  for (int nodo = 0; nodo < numNodos; nodo++)
    if (!(nodoYaProcesado[nodo]) && dist[nodo] <= min) {
        min = dist[nodo];
        min_index = nodo;
     }
  return min_index;
}

public int[][] getSubGrafo(){
return subMatriz;
}

}