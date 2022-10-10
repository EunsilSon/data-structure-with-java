# 설명
정수를 담고 있는 배열 또는 연결 리스트로 구현된 큐의 모든 요소를 출력하는 printAll() 메서드를 구현해 보세요.

<br><br>

# 코드
```java
public void printAll() {
    Node node = front;

    while (true) {
      System.out.print(node.getValue() + " ");
      node = node.next;

      if (node == null) {
         return;
      }
    }
}
```

<br><br>

# 출처
[자료구조와 알고리즘을 함께 Java! : Chapter5 선형구조(스택) - 연습 문제](https://github.com/bjpublic/javarithms)