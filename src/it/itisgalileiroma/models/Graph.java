package it.itisgalileiroma.models;

import java.util.List;

/***
 * A graph is characterized by
 * a list of nodes and a list of edges
 */
public class Graph {

    private List<Node> nodes;
    private List<Edge> edges;

    public Graph() {}

    public Graph(List<Node> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> nodes() {
        return nodes;
    }

    /**
     * todo
     * @param node
     */
    public void addNode(Node node) {

    }

    /**
     * todo
     * @param edge
     */
    public void addEdge(Edge edge) {

    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> edges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
