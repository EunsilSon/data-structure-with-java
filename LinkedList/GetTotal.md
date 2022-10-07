## 설명
단일 연결 리스트에는 정수가 저장되어 있습니다. 단일 연결 리스트의 모든 데이터 값을 더한 합계를 반환하는 함수를 작성하세요.

<br>

## 코드

```java
public int getTotal(Node head) {
    int total = 0;
    boolean hasNext = true;

    Node pointer = head;
    while (hasNext) {
        total += pointer.getValue();

        if (pointer.next != null) {
            pointer = pointer.next;
        } else {
            hasNext = false;
        }
    }

    return total;
}
```