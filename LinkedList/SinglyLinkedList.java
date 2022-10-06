package linkeLlist;

public class SinglyLinkedList {

    class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }
    }

    Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        if (pointer == null) {
            System.out.println("리스트가 비어있습니다.");
            return;
        }

        StringBuilder builder = new StringBuilder();
        while (pointer.next != null) {
            builder.append(pointer.getValue());
            builder.append(" -> ");
            pointer = pointer.next;
        }

        builder.append(pointer.getValue());
        System.out.println(builder.toString());
    }

    /**
     * 단일 연결 리스트 끝에 노드 추가
     * @param value
     */
    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }

        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new Node(value, null);
    }

    /**
     * 받은 인자 값과 같은 노드 삭제
     * @param value
     */
    public void delete(int value) {
        Node pointer = this.head;

        // 첫 번째 노드를 삭제하는 경우
        if (pointer.getValue() == value) {
            Node deleteNode = this.head;
            this.head = this.head.next;

            deleteNode = null;
            System.out.println("첫 번째 노드입니다.");
            return;
        }

        Node temp = pointer;
        while (pointer != null && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
        }

        // 마지막 노드를 삭제하는 경우
        if (pointer.next == null) {
            temp.next = null;
            System.out.println("마지막 노드입니다.");
        } else {
            temp.next = pointer.next;
            System.out.println("중간 노드입니다.");
        }
        pointer = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // 삽입
        singlyLinkedList.append(10);
        singlyLinkedList.append(20);
        singlyLinkedList.append(30);
        singlyLinkedList.printAll();

        // 삭제
        singlyLinkedList.delete(10);
        singlyLinkedList.delete(20);
        singlyLinkedList.delete(30);
        singlyLinkedList.printAll();
    }
}
