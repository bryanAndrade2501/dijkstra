package Algoritmo;

import static Algoritmo.Graph.showEdges;

public class Main {

    public static void main(String[] args) {
     
        
        Graph graph = new Graph(5);
        graph.addVertax("A");//0
        graph.addVertax("B");//1
        graph.addVertax("C");//2
        graph.addVertax("D");//3
        graph.addVertax("E");//4

         
        graph.addEdges(0, 1, 6);
        graph.addEdges(0, 2, 5);
        graph.addEdges(0, 3, 8);

        graph.addEdges(1, 0, 6);
        graph.addEdges(1, 2, 4);
        graph.addEdges(1, 3, 5);
        graph.addEdges(1, 4, 3);

        graph.addEdges(2, 0, 5);
        graph.addEdges(2, 1, 4);
        graph.addEdges(2, 3, 6);

        graph.addEdges(3, 0, 8);
        graph.addEdges(3, 1, 5);
        graph.addEdges(3, 2, 6);
        graph.addEdges(3, 4, 2);

        graph.addEdges(4, 1, 3);
        graph.addEdges(4, 3, 2);

        System.out.println("Matriz de adyacencia");
        System.out.println(" A  B  C  D  E ");
        //showEdges();
        System.out.println(showEdges());

        System.out.println("Aplicación de Dijkstra desde A hasta E");
        System.out.println(graph.dijkStra(0));

    }
    
}
