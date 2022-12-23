import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private String label;
    private List<Edge> edgeList;
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
