package it.itisgalileiroma.models;

import java.util.ArrayList;
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

    public Graph(List<Node> nodes) {
        this.nodes = nodes;
        this.edges = new ArrayList<Edge>();
    }

    public List<Node> nodes() {
        return nodes;
    }

    /**
     * Add a node to a graph, if it has not already been inserted
     * @param node to add
     */
    public void addNode(Node node) {
        boolean notEquals = true;
        for(int i = 0; i < nodes.size(); i++) {
            if(nodes.get(i).id() == node.id()) {
                notEquals = false;
                break;
            }
        }
        if(notEquals) {
            nodes.add(node);
        }
    }

    /**
     * Add an edge to a graph, if it has not already been inserted.
     * If the edge nodes have not yet been inserted,
     * add also them to the graph
     * @param edge to add
     */
    public void addEdge(Edge edge) {
        boolean exists = false;
        for(int i = 0; i < edges.size(); i++) {
            // todo add a comment here!
            if((edge.target().id() == edges.get(i).target().id()) && (edge.source().id() == edges.get(i).source().id())) {
                exists = true;
                break;
            }
        }

        if(!exists) {
            Edge e = new Edge(edge.target(), edge.source(), edge.weight());
            edges.add(edge);
            edges.add(e);
            this.addNode(edge.source());
            this.addNode(edge.target());
        }
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
