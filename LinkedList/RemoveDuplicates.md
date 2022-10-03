## 설명
정렬되어 있는 연결 리스트가 주어지면 각 요소가 하나만 존재하도록 모든 중복 요소를 제거하세요. 정렬된 연결 리스트도 반환하세요.

<br>

## 입력 예시
[1, 1, 2, 3, 3]

<br>

## 출력 예시
[1, 2, 3]

<br>

## 조건
- 연결 리스트의 노드 수는 0~300 범위 내
- 100 ≤ Node.value ≤ 100
- 연결 리스트는 오름차순으로 정렬됨

<br>

## 코드
```Java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode returnHead = head; 
        ListNode node = head;

        while (node.next != null) {
            if (node.val == node.next.val) { 
                node.next = node.next.next; 
            } else {
                node = node.next;
            }
        }
        return returnHead;
    }
}
```

<br>

## 문제 출처
[LeetCode - Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)