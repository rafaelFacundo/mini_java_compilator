package RegAlloc;

import Graph.*;

public class MoveList
{
    public Node src;
    public Node dst;
    
    public MoveList tail;
    
    public MoveList(Node s, Node d, MoveList t)
    {
        src=s;
        dst=d;
        tail=t;
    }
}

