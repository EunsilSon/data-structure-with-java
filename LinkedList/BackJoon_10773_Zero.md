# 설명

첫 번째 줄에 정수 K가 주어진다.

이후 K개의 줄에 정수가 1개 씩 주어진다. 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 2³¹-1보다 작거나 같은 정수이다.

<br><br>

# 예시 1

## 입력

```java
4
3
0
4
0
```

## 출력

```java
0
```

<br>

# 예시 2

## 입력

```java
10
1
3
5
4
0
0
7
0
0
6
```

## 출력

```java
7
```

<br><br>

# 조건

- 1 ≤ **K** ≤ 100,000
- K 가  "0"일 경우에 지울 수 있는 수가 있음을 보장
- K개의 줄의 정수는  0 ~ 1,000,000 사이의 값

<br><br>

# 코드

```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int num = 0;

        // 값 입력 받기 + 스택 저장
        for (int i = 0; i < k; i++) {
            num = sc.nextInt();

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        // 스택에 있는 데이터의 합
        int result = 0;
        while (!stack.empty()) {
            result += stack.pop();
        }

        // 합 출력
        System.out.println(result);
    }
}
```

<br><br>

# 출처
[10773번: 제로](https://www.acmicpc.net/problem/10773)