public class Edge
{
    private Vertex destination; // edges having its destination vertex
    private int weight; // all the edges will have the weight on it

    public Edge(Vertex destination, int weight) // constructor for making the edge
    {
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getDestination()
    {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
