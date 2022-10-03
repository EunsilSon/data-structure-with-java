## 설명
이진 배열 nums가 주어지면, 배열에서 연속되는 1의 최대 개수를 반환합니다.  

<br>  

## 입력
```
nums = [1,1,0,1,1,1]
```

<br>

## 출력
```
3
```

<br>

## 조건
- `1 <= nums.length <= 105`
- `nums[i]` 은 `0` 또는 `1`

<br>

## 코드
```Java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int count =  0;
        ArrayList result = new ArrayList<Integer>();

        // 숫자 카운트
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0 || i == nums.length-1) {
                result.add(count);
                count = 0;
            }
        }

        // 최대값 찾기
        int max = (int)result.get(0);

        for (int i = 1; i < result.size(); i++) {
            if (max < (int)result.get(i)) {
                max = (int)result.get(i);
            }
        }
        System.out.println(max);
    }
}
```
<br>

## 문제 출처
[LeetCode - Max Consecutive Ones](https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/)
