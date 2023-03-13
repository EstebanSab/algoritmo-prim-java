

public class Pruebas{
  public static void main(String[] arg){
  
/*
Grafo grafoPrim = new Grafo(10,false);
  
  
  grafoPrim.agregarArista("A","B",11);
  grafoPrim.agregarArista("A","F",21);
  grafoPrim.agregarArista("B","E",3);
  grafoPrim.agregarArista("E","D",10);
  grafoPrim.agregarArista("E","I",9);
  grafoPrim.agregarArista("D","H",15);
  grafoPrim.agregarArista("I","H",8);
  grafoPrim.agregarArista("I","F",19);
  grafoPrim.agregarArista("I","J",9);
  grafoPrim.agregarArista("F","J",30);
  grafoPrim.agregarArista("F","C",25);
  grafoPrim.agregarArista("F","G",28);
  grafoPrim.agregarArista("C","G",32);
  grafoPrim.agregarArista("J","G",7);
  grafoPrim.impMatriz();
  
  Prim prim = new Prim(grafoPrim.getMatriz(),grafoPrim.getNodos());
  prim.SubGrafo(0);
  
  Grafo subGrafo = new Grafo(prim.getSubGrafo(),grafoPrim.getNodos());
  subGrafo.impMatriz();
  */
 
 
 
 Grafo metro =  new Grafo(6,false);
 metro.agregarArista("1","2",1);
 metro.agregarArista("2","3",1);
 metro.agregarArista("4","5",1);
 metro.agregarArista("1","3",10);
 metro.agregarArista("3","4",10);
 metro.agregarArista("4","6",10);
 metro.agregarArista("5","6",10);

 
  Prim subMetro = new Prim(metro.getMatriz(),metro.getNodos());
  subMetro.SubGrafo(0);
  
  Grafo subMetroGrafo = new Grafo(subMetro.getSubGrafo(),metro.getNodos());
  subMetroGrafo.impMatriz();
 
 
    }
}
