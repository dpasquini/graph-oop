package it.itisgalileiroma.models;

import java.util.List;

/***
 * Node of a graph, identified by an integer id
 */
public class Node {

    private int id;
    private List<Node> neighbors;

    public Node(int id, List<Node> neighbors) {
        this.id = id;
        this.neighbors = neighbors;
    }

    public Node() {

    }

    /***
     *
     * @return node id
     */
    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /***
     *
     * @return list of node's neighbors
     */
    public List<Node> neighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}
