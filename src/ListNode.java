public class ListNode {
    private final Integer value;
    private ListNode next;

    ListNode(Integer value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode getNextNode() {
        return this.next;
    }

    public void setNextNode(ListNode nextNode) {
        this.next = nextNode;
    }

    public int getValue() {
        return this.value;
    }
}
