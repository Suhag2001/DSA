package com.graph.adjacencyLIst;

import java.util.ArrayList;

//array of arraylist which called Adjacency List graph which
// this is undirected unweighted graph
// Now by adding the weight  into the class then we can called it undirected weighted graph
public class AdjacecyList {
    public static class Edge{
        int src ;
        int dst ;
        int wt;
        public Edge(int src, int dst,int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,5));
        graph[1].add(new Edge(1,3,6));

        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,6));
        graph[2].add(new Edge(2,3,1));

        graph[3].add(new Edge(3,1,6));
        graph[3].add(new Edge(3,2,9));

    }
    public static void main(String[] args) {

        ArrayList<Edge> graph[] = new ArrayList[4];
         createGraph(graph);
         for (int i = 0; i < graph[2].size(); i++){
             Edge e = graph[2].get(i);
             System.out.println(e.dst + " ,  " + e.wt);
         }

         for (int i =0 ; i< graph.length; i++){

             for (int j = 0; j < graph[i].size(); j++){
                 Edge e = graph[i].get(j);
                 System.out.println("This is for "+e.src + " = " + "destination "+ e.dst + " and "+ "weight "+ e.wt);
             }
         }

    }
}
