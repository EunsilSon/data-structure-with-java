# 설명
LinkedListDeque 클래스의 print() 메서드에서 while문을 for문으로 수정하여 같은 결과를 출력해 보세요.

<br>

# 코드

```java
public String printAll() {
    if (front == null) {
        return "deque is empty";
    }

    String datas = "";
    Node temp = front;

    for (; temp.next != null; temp = temp.next) { // 초기값 없이 반복 조건, 증감 조건을 적을 수 있음
        datas += String.format("%s->", temp.getValue());
    }

    // temp.next == null
    datas += String.format("%s", temp.getValue());

    return datas;
}
```

<br>

# 출처
[자료구조와 알고리즘을 함께 Java! : Chapter5 선형구조(데크) - 연습 문제](https://github.com/bjpublic/javarithms)