# 설명
스페이스로 띄어쓰기 된 단어들의 리스트가 주어질 때, 단어들을 반대 순서로 뒤집어라.

각 라인은 w개의 영 단어로 이루어져 있으며, 총 L개의 알파벳을 가진다.

각 행은 알파벳과 스페이스로만 이루어져 있다. 단어 사이에는 하나의 스페이스만 들어간다.

<br><br>

# 입력 예시

```jsx
3
this is a test
foobar
all your base
```

<br>

# 출력 예시

```
Case #1: test a is this
Case #2: foobar
Case #3: base your all
```

<br><br>

# 조건

## 입력

첫 행은 N이며, 전체 케이스의 개수이다.

N개의 케이스들이 이어지는데, 각 케이스는 스페이스로 띄어진 단어들이다. 스페이스는 라인의 처음과 끝에는 나타나지 않는다. N과 L은 다음 범위를 가진다.

- **N** = 5
- 1 ≤ **L** ≤ 25

<br>

## 출력

각 케이스에 대해서, 케이스 번호가 x일때 "Case #x: " 를 출력한 후 그 후에 이어서 단어들을 반대 순서로 출력한다

<br><br>

# 코드

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LinkedListStack {
    Node head; // 가장 나중에 들어간 데이터
    Node top; // 가장 최근에 들어간 데이터

    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    // 삽입
    public void push(Object data) {

        // 리스트가 비어 있는 경우
        if (head == null) {
            head = new Node(data);
            top = head;
            return;
        }

        // 리스트에 데이터가 있는 경우
        Node node = new Node(data);
        top.next = node; // top은 data가 없고 next를 가리킴
        top = node;
    }

    // 삭제
    public Object pop() {

        // 리스트가 비어 있으면
        if (top == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // head 부터
        Node temp = head;

        // 가장 최근에 넣은 데이터 꺼내기
        Object data = this.peek();

        // 리스트에 데이터가 1개 있는 경우
        if (temp.next == null) {
            head = null;
            top = null;
            return data;
        }

        // 리스트에 데이터가 n개 있는 경우
        // top까지 이동
        while (temp.next != null) {
            top = temp;
            temp = temp.next;
        }

        top.next = null; // == temp
        return data;
    }

    // 추출
    public Object peek() {
        return top.data; // 가장 최근에 넣은 데이터 꺼내기
    }

    // 비어있는 지
    public boolean empty() {
        return top == null;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // 단어 개수 입력 받기
        Scanner sc = new Scanner(System.in);
        int words =  Integer.parseInt(sc.nextLine()); // scanner 오류로 인한 형 변환

        // 단어 개수만큼 단어 입력 받기
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < words; i++) {
            System.out.print((i + 1) + "번 째 단어 : ");
            wordList.add(sc.nextLine());
        }

        // 단어 잘라서 스택에 넣기
        StringBuilder stringBuilder = new StringBuilder();
        String word;

        for (int i = 0; i < wordList.size(); i++) {
            word = wordList.get(i);

            for (int j = 0; j < word.length(); j++) {
                if (j == word.length()-1) { // 마지막 단어
                    stringBuilder.append(word.charAt(j));
                    stack.push(stringBuilder.toString());
                    resetStringBuilder(stringBuilder);

                } else if (word.charAt(j) != ' ') {
                    stringBuilder.append(word.charAt(j));

                } else { // 스페이스
                    stack.push(stringBuilder.toString()); // 한 단락 저장
                    resetStringBuilder(stringBuilder);
                }
            }
            resetStringBuilder(stringBuilder);

            // 단어 순서 바꿔서 다시 리스트에 넣기
            while (!stack.empty()) {
                stringBuilder.append(stack.peek().toString() + ' ');
                stack.pop();
            }
            wordList.set(i, stringBuilder.toString());
            resetStringBuilder(stringBuilder);
        }

        // 결과 출력
        for (int i = 0; i < wordList.size(); i++) {
            System.out.printf("Case #%d : %s\n", (i + 1), wordList.get(i));
        }
    }

    /**
     * StringBuilder 초기화
     * @param stringBuilder
     */
    public static void resetStringBuilder(StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
    }
}
```

<br><br>

# 회고

1. 연결 리스트로 스택 구현
<br>검색이 어려운 **연결 리스트의 단점을 스택의 특징이 보완**해줌
<br>

2. StringBuffer 사용
<br>문자열을 여러 번 잘랐다가 붙여야 하는 데 String은 문자열을 추가할 때마다 새 메모리를 계속 사용하기 때문에 **빈번한 수정, 삭제 시에는 StringBuilder**가 더 적합함
<br>

3. Scanner nextInt() 오류
<br>nextInt()는 입력 받은 뒤 개행 문자를 지우지 않아 다음 입력을 또 받을 때 입력을 받은 것으로 간주되어 제대로 입력되지 않아 **String형으로 입력받아 int로 형 변환**함

<br><br>

# 출처
[12605번: 단어순서 뒤집기](https://www.acmicpc.net/problem/12605)
