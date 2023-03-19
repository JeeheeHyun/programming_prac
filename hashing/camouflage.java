import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 옷 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] kinds: clothes) {
            String type = kinds[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 일단 예외 포함 모든 조합 계산
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 예외처리(아무것도 선택하지 않는 경우)
        return answer - 1;
    }
}