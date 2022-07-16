public class MyList {
    private ListNode currentNode;
    private ListNode firstNode;
    private ListNode lastNode;

    MyList(int value) {
        currentNode = new ListNode(value,null);
        firstNode = currentNode;
        lastNode = currentNode;
    }

    public void add(int value) {
        lastNode.setNextNode(new ListNode(value,null));
        lastNode = lastNode.getNextNode();
    }

    public void moveFirst() {
        currentNode = firstNode;
    }

    public void moveNext() {
        currentNode = currentNode.getNextNode();
    }

    public ListNode getNode() {
        return currentNode;
    }

    public boolean checkCicle() {
        ListNode hare = firstNode;
        ListNode tortoise = firstNode;

        do {
            if((hare.getNextNode() == null) || hare.getNextNode().getNextNode() == null)
                return false;
            tortoise = tortoise.getNextNode();
            hare = hare.getNextNode().getNextNode();
        }while(tortoise != hare);
        return true;
    }

    @Override
    public String toString() {
        ListNode tmp = firstNode;
        String result = "["+tmp.getValue();
        do {
            tmp = tmp.getNextNode();
            result += ", "+tmp.getValue();
        }while (tmp.getNextNode() != null);
        result+="]";
        return result;
    }
}
