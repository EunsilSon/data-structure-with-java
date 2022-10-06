## 설명

단일 연결 리스트의 삽입 메서드에서 중복을 허용하지 않는 삽입 메서드로 수정해 보세요.

<br>

## 코드

```java
public boolean insertNode(int data) {
    if (this.head == null) {
        this.head = new Node(value, null);
        return;
    }

    Node node = this.head;
    
    while (node.next != null) {
        if (node.data == data) {
            System.out.println("존재하는 값입니다. 값을 다시 입력하세요.");
            return;
        } else {
            node = node.next;
        }
       
        node.next = new Node(data);
     }
}
```

<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter3 연결 리스트 - 연습 문제](https://github.com/bjpublic/javarithms)
