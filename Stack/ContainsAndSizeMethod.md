# 설명
지금까지 배운 스택 클래스에서 아래 메서드를 구현해 보세요.

- contains(Object value): value 값이 포함되어 있으면 true, 포함되어 있지 않으면 false를 반환합니다.
- size(): 스택의 크기를 반환합니다.


<br><br>

# 코드

```java
   /**
     * 특정 값이 존재하는 지
     * @param value
     * @return
     */
    public boolean contains(Object value) {
        Node node = head;

        while (node.next != null) {
            if (node.data == value || node.next.data == value) {
                return true;
            } else {
                node = node.next;
            }
        }
        return false;
    }

   /**
     * 스택의 크기
     * @return
     */
    public int size() {
        int count = 0;

        Node node = head;
        while (node.next != null) {
            count++;
            node = node.next;
        }
	return count + 1; // 마지막 노드 포함
    }
```
<br><br>

# 출처
[자료구조와 알고리즘을 함께 Java! : Chapter5 선형구조(스택) - 연습 문제](https://github.com/bjpublic/javarithms)
