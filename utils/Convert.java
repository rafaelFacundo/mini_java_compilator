package utils;

import java.util.ArrayList;
import java.util.List;

import Temp.TempList;

public class Convert {
    public static Temp.TempList ArrayToTempList(Temp.Temp array[]) {

        Temp.TempList tempList = null;

        for (int i = array.length-1; i >= 0; --i) {
            tempList = new Temp.TempList(array[i], tempList);
        }

        return tempList;
    }

    public static List<Temp.Temp> TempListToList(Temp.TempList tempList) {

        ArrayList<Temp.Temp> list = new ArrayList<Temp.Temp>();

        TempList temp = tempList;
        while (temp != null) {
            list.add(temp.head);
            temp = temp.tail;
        }

        return list;
    }

    public static Temp.Temp[] TempListToArray(TempList tempList) {

        Temp.Temp array[] = new Temp.Temp[Convert.TempListToList(tempList).size()];
        TempList temp = tempList;

        for (int i = 0; i < array.length; i++) {
            array[i] = temp.head;
            temp = temp.tail;
        }

        return array;
    }
}
