## 설명
중복된 요소를 제거한 새 배열을 반환하는 메서드를 작성해 보세요.

<br>  

## 입력 예시
arr = [5, 10, 9, 27, 2, 8, 10, 4, 27, 1]

<br>


## 출력 예시
5, 0, 9, 0, 2, 8, 0, 4, 0, 1


<br>

## 조건
- 중복이 제거된 빈 요소는 기본 값 0으로 삽입


<br>

## 코드
```Java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice_04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 9, 27, 2, 8, 10, 4, 27, 1));
        Practice_04 p = new Practice_04();
        p.removeDuplicateData(list);
    }

    public void removeDuplicateData(List<Integer> list) {
        int num;

        for (int i = 0; i < list.size(); i++) {
            num = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == num) {
                    list.set(i, 0);
                    list.set(j, 0);
                }
            }
        }
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
```
<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter2 배열 - 연습 문제](https://github.com/bjpublic/javarithms)
