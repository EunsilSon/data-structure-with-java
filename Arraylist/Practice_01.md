## 설명
5개의 양수를 입력 받은 배열의 모든 요소의 합을 구하는 메서드를 작성하세요.

<br>  

## 조건
- 사용자로부터 입력 받을 것
- 양수 5개 입력 받기

<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Practice_01 p = new Practice_01();
        p.inputNumAndTotal();
    }
    
    public void inputNumAndTotal() {
        List<Integer> list = new ArrayList<>();
        String num;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요 : ");
            num = sc.next();

            // 정수인지 확인
            try{
                Integer.parseInt(num);
                list.add(Integer.parseInt(num));
            }catch (Exception e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                i--;
            }
        }
        getTotal(list);
    }

    public void getTotal(List<Integer> list) {
        int total = 0;

        for (int n : list) {
            total += n;
        }
        System.out.println("합계 : " + total);
    }
}
```
<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter2 배열 - 연습 문제](https://github.com/bjpublic/javarithms)
