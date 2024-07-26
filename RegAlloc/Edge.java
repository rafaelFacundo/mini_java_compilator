package RegAlloc;

import java.util.Hashtable;

import Graph.Node;

class Edge
{
    private static Hashtable<Node, Hashtable<Node, Edge>> edges =
        new Hashtable<Node, Hashtable<Node, Edge>>();
    
    private Edge()
    {
        super();
    }
    public static Edge getEdge(Node u, Node v)
    {
        Hashtable<Node, Edge> us = edges.get(u);
        Hashtable<Node, Edge> vs = edges.get(v);
        
        if ( us == null )
            edges.put(u, us = new Hashtable<Node, Edge>());
        
        if ( vs == null )
            edges.put(v, vs = new Hashtable<Node, Edge>());
        
        Edge e = us.get(v);
        
        if ( e == null )
        {
            e = new Edge();
            us.put(v, e);
            vs.put(u, e);
        }
        
        return e;
    }
}
