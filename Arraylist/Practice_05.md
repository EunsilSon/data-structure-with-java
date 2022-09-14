## 설명
사용자로부터 소문자 알파벳 1개를 입력 받아 대문자로 변경하여 출력하는 코드를 작성해 보세요.

<br>  

## 입력 예시
a

<br>


## 출력 예시
A


<br>

## 코드
```Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {
        // 알파벳 리스트 만들기
        List<Alphabet> alphabetList = new ArrayList<>();
        for (int i = 65; i < 91; i++) {
            alphabetList.add(new Alphabet((char) i, (char) (i + 32))); // 아스키코드 값으로 대문자, 소문자 넣기
        }

        Practice_05 p = new Practice_05();

        String lowerAlphabet;
        boolean isLowercase = false;
        Scanner sc = new Scanner(System.in);

        while (!isLowercase) {
            System.out.print("알파벳 소문자를 하나만 입력하세요 : ");
            lowerAlphabet = sc.next();

            // 한 글자 입력했는 지
            if (lowerAlphabet.length() != 1) {
                System.out.println("한 글자가 아닙니다. 다시 입력하세요.");
                break;
            }

            // 소문자인지
            for (int i = 97; i < 123; i++) {
                if ((int)lowerAlphabet.charAt(0) == i) { // 소문자 맞음
                    p.getUppercase(alphabetList, lowerAlphabet);
                    isLowercase = true;
                    break;
                }
            }

            if (!isLowercase) {
                System.out.println("소문자가 아닙니다. 다시 입력하세요.");
            }
        }
    }

    public void getUppercase (List<Alphabet> alphabetList, String lowerAlphabet){
        for (Alphabet alphabet : alphabetList) {
            if (alphabet.lowercase == lowerAlphabet.charAt(0)) {
                System.out.println(alphabet.uppercase);
                break;
            }
        }
    }
}

class Alphabet {
    char lowercase;
    char uppercase;

    public Alphabet(char uppercase, char lowercase) {
        this.uppercase = uppercase;
        this.lowercase = lowercase;
    }
}

```
<br>

## 문제 출처
[자료구조와 알고리즘을 함께 Java! : Chapter2 배열 - 연습 문제](https://github.com/bjpublic/javarithms)
