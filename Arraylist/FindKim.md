## 설명
5명의 사람 이름을 입력 받아 ArrayList에 저장한 후 '김'씨 성을 가진 사람을 모두 출력하시오  

<br>

## 조건
- 사용자로부터 입력 받을 것
- ArrayList를 사용할 것

<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.Scanner;

public class FindKim {
    public static void main(String[] args) {
        ArrayList nameList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하세요 : ");
            nameList.add(sc.nextLine());
        }

        System.out.println();
        String tmp;
        for (Object name : nameList) {
            tmp = (String) name;
            if (tmp.charAt(0) == '김') {
                System.out.println(tmp);
            }
        }
    }
}
```