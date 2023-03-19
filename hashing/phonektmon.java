//1.�迭 �̿�
//���ϸ� ������ ��ȣ �縸ŭ �迭�� ���
//ũ�Ⱑ 20001�� �迭�� ����� nums�� ���� �� ������ ���� ��� count++�ϰ�, return �ÿ� answe>n/2�̸� n/2�� �ʱ�ȭ

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

//set ���
//�ߺ� ���θ� üũ�ϰ� �߰��ϴ� ����
//set�� ����� nums�� ���� ���ϸ� ��ȣ �߰��� �� set�� return

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