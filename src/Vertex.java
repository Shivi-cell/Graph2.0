import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private String label; // vertex label
    private List<Edge> edgeList; // vertex having the list of edges related to itself
    public Vertex(String label)
    {
        this.label = label;
        edgeList = new LinkedList<>();
    }

    public String getLabel() {
        return label;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }
}
