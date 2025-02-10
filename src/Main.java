import it.itisgalileiroma.algorithms.DFS;
import it.itisgalileiroma.models.Edge;
import it.itisgalileiroma.models.Graph;
import it.itisgalileiroma.models.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // this is an example to create a graph "hardcoded"
        Node n1 = new Node(0); // A
        Node n2 = new Node(1); // B
        Node n3 = new Node(2); // C
        Node n4 = new Node(3); // D
        Node n5 = new Node(4); // E
        Node n6 = new Node(5); // F
        Node n7 = new Node(6); // G

        Edge e1 = new Edge(n1, n2, 1);
        Edge e2 = new Edge(n1, n3, 1);
        Edge e3 = new Edge(n1, n4, 1);
        Edge e4 = new Edge(n2, n5, 1);
        Edge e5 = new Edge(n3, n6, 1);
        Edge e6 = new Edge(n4, n7, 1);

        List<Edge> edges = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();
        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);

        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);

        Graph g = new Graph(nodes);
        for(Edge e : edges) {
            g.addEdge(e);
        }


        Node source = new Node(0);
        DFS dfs = new DFS(g, source);

        List<Node> visitedInDepth = dfs.run();
        for (Node node : visitedInDepth) {
            System.out.println(node.id());
        }
    }
}