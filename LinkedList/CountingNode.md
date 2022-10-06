## 설명
단일 연결 리스트에 특정 데이터 값을 가진 노드의 개수를 반환하는 함수를 작성하세요.

<br>

## 코드

```java
public int countNode(Node head, int value) {
    int count;
    Node node = head;

    while (node.next != null) {
        if (node.value == value) {
            count++;
        }
        node = node.next;
    }

    if (node.value == value) {
        count++;
    }

    return count;
}
```