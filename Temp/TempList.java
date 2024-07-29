package Temp;

import utils.List;

public class TempList extends List<Temp>  {
    public Temp head;
    public TempList tail;
    public TempList(Temp h, TempList t) {head=h; tail=t;}
}
