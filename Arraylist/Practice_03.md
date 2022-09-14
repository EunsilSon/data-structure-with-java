## 설명
순서가 없는 두 배열에서 서로 같은 요소를 포함하는 지 판별하는 메서드를 작성해 보세요.

<br>  

## 입력 예시
arrA = [1, 3, 2]; 
arrB = [2, 3, 1];

<br>


## 출력 예시
3개가 일치합니다.


<br>

## 조건
- A배열[1, 3, 2] 와 B배열[2, 3, 1]은 같은 배열임


<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_03 {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 3, 2));
        List<Integer> listB = new ArrayList<>(Arrays.asList(2, 3, 1));

        Practice_03 p = new Practice_03();
        p.compareTwolists(listA, listB);
    }

    public void compareTwolists(List<Integer> listA, List<Integer> listB) {
        int matchCount = 0;

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i) == listB.get(j)) {
                    matchCount++;
                }
            }
        }

        if (matchCount == 0) {
            System.out.println("일치하는 값이 없습니다.");
        } else {
            System.out.println(matchCount + "개가 일치합니다.");
        }
    }
}
```
<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter2 배열 - 연습 문제](https://github.com/bjpublic/javarithms)
