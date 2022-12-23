public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex v1 = new Vertex("0");
        Vertex v2 = new Vertex("1");
        Vertex v3 = new Vertex("2");
        Vertex v4 = new Vertex("3");

        // adding vertex in the graph
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);

        // adding edge to te vertex
        graph.addEdge(v1, v3, 3);
        graph.addEdge(v1, v4, 1);
        graph.addEdge(v2, v1, 2);
        graph.addEdge(v4, v2, 4);
        graph.addEdge(v3, v4, 5);

        graph.printGraph();
        graph.countVertex();
        graph.countEdge();
    }
}