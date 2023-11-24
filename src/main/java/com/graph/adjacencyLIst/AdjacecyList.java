package com.graph.adjacencyLIst;

import java.util.ArrayList;

//array of arraylist which called Adjacency List graph
public class AdjacecyList {
    public static class Edge{
        int src ;
        int dst ;
        public Edge(int src, int dst){
            this.src = src;
            this.dst = dst;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

    }
    public static void main(String[] args) {

        ArrayList<Edge> graph[] = new ArrayList[4];
         createGraph(graph);
         for (int i = 0; i < graph[3].size(); i++){
             Edge e = graph[3].get(i);
             System.out.print(e.dst + " ");
         }

    }
}