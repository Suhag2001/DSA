package com.graph.adjacencyLIst;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

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
    public  static  void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        boolean[] visited = new boolean[graph.length];

        while (!q.isEmpty()){
            int curr = q.poll();
            if(visited[curr]== false){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);

                }
            }

        }

    }

    public static void dfs(ArrayList<Edge> graph[], boolean visited[] , int curr){
        System.out.print(curr+" ");
        visited[curr] =true;
        for (int i = 0 ; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dst]==false){
                dfs(graph,visited, e.dst);
            }
        }

    }

    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr, String path, int tar){
        if(curr==tar){
            System.out.println(path );
            return;
        }
        for(int i = 0 ; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst]){
                vis[curr] = true;
                printAllPath(graph, vis, e.dst, path+e.dst, tar);
                vis[curr]=false;
            }
        }
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

        System.out.println("Graph Traversal by BFS");
         bfs(graph);
        boolean[] visited = new boolean[graph.length];
        System.out.println();
        System.out.println("Graph Traversal by DFS");
        dfs(graph, visited, 0);
        System.out.println();
        System.out.println("All paths visited");
        printAllPath(graph,new boolean[graph.length],0,"",3);

    }
}
