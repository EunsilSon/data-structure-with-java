## 설명
배열의 최댓값과 최솟값을 구하는 메서드를 작성해 보세요.

<br>  

## 입력 예시
arr = [10, 11, 2, 5, 3, 24, 15, 6, 9]

<br>


## 출력 예시
최댓값 : 24
<br>
최솟값 : 2

<br>

## 조건
- 사용자로부터 입력 받을 것
- 정수 5개 입력 받기


<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 2, 5, 3, 24, 15, 6, 9));
        Practice_02 p = new Practice_02();
        p.findMinAndMax(list);
    }

    public void findMinAndMax(List<Integer> list) {
        int tmp;

        // 정렬
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }

        System.out.println("최댓값 : " + list.get(list.size() - 1));
        System.out.println("최솟값 : " + list.get(0));
    }
}
```
<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter2 배열 - 연습 문제](https://github.com/bjpublic/javarithms)
