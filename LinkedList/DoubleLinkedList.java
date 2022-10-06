package linkedLlist;

public class DoubleLinkedList {
    class Node {
        private int value;
        private Node prev;
        private Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }
    }

    private Node head;

    DoubleLinkedList() {
        this.head = null;
    }

    DoubleLinkedList(int value, Node head) {
        this.head = new Node(value, head, null);
    }

    public Node getHead() {
        return this.head;
    }

    /**
     * 이중 연결리스트 끝에 노드 추가
     * @param value
     */
    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        Node newNode = new Node(value);
        newNode.prev = pointer;
        pointer.next = newNode;
    }

    /**
     * 특정 값으로 노드 삭제
     * @param value
     */
    public void delete(int value) {
        Node pointer = this.head;

        // 첫 번째 노드를 삭제하는 경우
        if (pointer.getValue() == value) {
            Node deleteNode = this.head;
            this.head = this.head.next;

            deleteNode = null;
            return;
        }

        Node prevNode = pointer;
        while (pointer != null && pointer.getValue() != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        Node temp = pointer.next;
        // 마지막 노드를 삭제하는 경우
        if (temp == null) {
            prevNode.next = null;
        } else {
            temp.prev = prevNode;
            prevNode.next = pointer.next;
        }

        pointer = null;
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer.next != null) {
            builder.append(pointer.getValue());
            builder.append(" <-> ");
            pointer = pointer.next;
        }

        builder.append(pointer.getValue());
        System.out.println(builder.toString());
    }


    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        // 삽입
        doubleLinkedList.append(10);
        doubleLinkedList.append(20);
        doubleLinkedList.append(30);
        doubleLinkedList.printAll();

        // 삭제
        doubleLinkedList.delete(10);
        doubleLinkedList.printAll();
    }
}
