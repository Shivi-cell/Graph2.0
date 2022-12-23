import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Vertex> vertices; // graph having the set of vertices

    public Graph()
    {
        vertices = new HashSet<>();
    }

    public void addEdge(Vertex v1, Vertex v2, int weight) // adding the edges
    {
        v1.getEdgeList().add(new Edge(v2, weight));
    }

    public void addVertex(Vertex v) // adding the vertex
    {
        vertices.add(v);
    }

    public void printGraph() // printing graph
    {
        System.out.println("Printing the graph info...");
        for (Vertex v : vertices)
        {
            System.out.println("Vertex "+v.getLabel());
            for(Edge e : v.getEdgeList())
            {
                System.out.println("Destination -> "+e.getDestination().getLabel()+" with weight "+e.getWeight());
            }
        }
    }

    public void countVertex()  // counting the vertex
    {
        System.out.println("The graph contains "+vertices.size()+" vertices.");
    }

    public void countEdge() // counting the edges
    {
        int count = 0;
        for (Vertex v : vertices)
        {
            count += v.getEdgeList().size();
        }
        System.out.println("The graph has "+count+" no of edges.");
    }
}
