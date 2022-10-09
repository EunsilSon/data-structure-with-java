# 설명
int stack[100] 에는 정수들이 push된다. 그런데, 100이라는 값을 push하면 stack에 들어있던 모든 값들이 없어지고, 그 값들의 합만 남게 된다.

예를 들어, stack에 1, 2, 3이 들어있는 상태에서 100을 push하면 stack에는 오직 한 개의 값 6 (=1+2+3)만 들어있게 된다.

이상한 stack을 프로그램 하시오.

<br><br>

# 입력 예시
```java
4 // stack에 push되는 값들의 개수
1 2 100 4
```

# 출력 예시
```java
4 3
```

<br><br>

# 조건
- 출력 시 stack에 있는 모든 값들을 꺼내 공백으로 구분
- 맨 끝에는 줄 바꿈 문자 없음

<br><br>

# 코드

```java
import java.util.Scanner;

public class StackOfStrangeWorld {
    public static void main(String[] args) {

        // stack 생성
        ArrayStack stack = new ArrayStack(100);

        // 입력 할 정수의 개수 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 할 값의 개수를 입력하세요 : ");
        int num = sc.nextInt();

        // 정수 입력 받고 스택에 저장
        int inputData = 0;
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번 째 값 : ");
            inputData = sc.nextInt();

            if (inputData == 100) { // 100일 경우 스택의 모든 데이터의 합계만 남김
                while (!stack.isEmpty()) {
                    total += stack.pop();
                }
                stack.push(total);
                total = 0;
            } else {
                stack.push(inputData);
            }
        }

        // 스택 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static class ArrayStack {
        private int[] stack;
        private int top;
        int size;

        ArrayStack(int length) {
            // 빈 스택은 top = -1로 표현
            this.top = -1;
            this.stack = new int[length];
            this.size = 0;
        }

        /**
         * 데이터 삽입
         * @param data
         */
        public void push(int data) {
            if (stack.length - 1 == top) { // 스택이 가득 찼을 때
                throw new StackOverflowError();
            }

            stack[++top] = data;
            size++;
        }

        /**
         * 데이터 삭제
         * @return int
         */
        public int pop() {
            if (top == -1) {
                throw new ArrayIndexOutOfBoundsException();
            }

            int temp = stack[top];
            stack[top--] = 0;
            size--;
            return temp;
        }

        /**
         * 스택이 비었는지
         * @return boolean
         */
        public boolean isEmpty() {
            return top == -1;
        }
    }
}
```

<br><br>

# 출처
[[데이터구조] stack 응용문제/소스 코드](https://jungtak.tistory.com/226)