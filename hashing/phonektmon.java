//1.배열 이용
//폰켓몬 종류의 번호 양만큼 배열을 사용
//크기가 20001인 배열을 만들어 nums를 돌며 한 마리도 없는 경우 count++하고, return 시에 answe>n/2이면 n/2로 초기화

class Solution {
    public int solution(int[] nums) {
        int[] counts = new int[200001];
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(counts[nums[i]] == 0) {
                answer++;
            }
            counts[nums[i]]++;
        }
        if(answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        return answer;
    }
}

//set 사용
//중복 여부를 체크하고 추가하는 연산
//set을 만들고 nums를 돌며 폰켓몬 번호 추가한 뒤 set값 return

import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int answer = set.size();
        if(answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}