## 설명
5명의 별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가 제일 긴 별명을 출력하시오.

<br>

## 조건
- ArrayList 사용하기
- 별명의 길이는 모두 다르게 입력 받기

<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestNickname {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        String inputName;
        
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("별명을 입력하세요 : ");
            inputName = sc.nextLine();

            if (nameList.isEmpty()) {
                nameList.add(inputName);
            } else {
                // 별명 길이 중복 확인
                for (int j = 0; j < nameList.size(); j++) {
                    if (nameList.get(j).length() == inputName.length()) {
                        System.out.println("별명의 길이가 같습니다. 다시 입력하세요.");
                        i--;
                        break; // 같은 길이 발견 시 내부 for문 종료
                    }
                }
                nameList.add(inputName);
            }
        }

        // 가장 긴 별명 찾기
        String longNickName = nameList.get(0);

        for (int i = 1; i < nameList.size(); i++) {
            if (longNickName.length() < nameList.get(i).length()) {
                longNickName = nameList.get(i);
            }
        }
        System.out.println("\n길이가 가장 긴 별명 : " + longNickName);
    }
}
```