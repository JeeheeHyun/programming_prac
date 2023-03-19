import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        // 1. �� �����ϱ�
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] kinds: clothes) {
            String type = kinds[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. �ϴ� ���� ���� ��� ���� ���
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. ����ó��(�ƹ��͵� �������� �ʴ� ���)
        return answer - 1;
    }
}