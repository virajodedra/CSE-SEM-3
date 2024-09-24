import java.util.*;
class Graph{
   private final Map<Integer, List<Integer>> list;
    
    public Graph(){
        list = new HashMap();
    }

    public void addEdge(int u, int v){
        list.putIfAbsent(u, new ArrayList<>());
        list.putIfAbsent(v, new ArrayList<>());

        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();

        dfsHelper(start, visited);
    }

    public void dfsHelper(int vertex, Set<Integer> visited){
        visited.add(vertex);

        System.out.println(vertex + " ");
        for(int neigh : list.getOrDefault(vertex, new ArrayList<>())){
            if(! visited.contains(neigh)){
                dfsHelper(neigh, visited);
            }
        }
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.println(vertex + "| ");

            for(int neighbour : list.getOrDefault(vertex,new ArrayList<>())){
                if(!visited.contains(neighbour)){
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }
    
}
public class Lab_16_1{
    public static void main(String[] args) {
        Graph g = new Graph();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Perform DFS");
            System.out.println("3. Perform BFS");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the first vertex: ");
                    int u = sc.nextInt();
                    System.out.print("Enter the second vertex: ");
                    int v = sc.nextInt();
                    g.addEdge(u, v);
                    System.out.println("Edge added between " + u + " and " + v);
                }

                case 2 -> {
                    System.out.print("Enter the starting vertex for DFS: ");
                    int dfsStart = sc.nextInt();
                    System.out.println("DFS starting from vertex " + dfsStart + ":");
                    g.dfs(dfsStart);
                }

                case 3 -> {
                    System.out.print("Enter the starting vertex for BFS: ");
                    int bfsStart = sc.nextInt();
                    System.out.println("BFS starting from vertex " + bfsStart + ":");
                    g.bfs(bfsStart);
                }

                case 4 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
          //Viraj Odedra.
        sc.close();
        
    }
}
