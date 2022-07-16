//import java.util.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList(3);
        list.add(5);
        list.add(32);
        list.add(64);
        list.add(72);
        list.add(332);
        list.add(555);
        System.out.println(list);

        list.moveFirst();
        list.moveNext();
        list.moveNext();
        list.moveNext();
        System.out.println(list.getNode().getValue());
        ListNode cicleNode = list.getNode();
        list.moveNext();
        list.moveNext();
//        list.moveNext();
        list.getNode().setNextNode(cicleNode);

        System.out.println(list.checkCicle());

        list.moveFirst();
    }


}