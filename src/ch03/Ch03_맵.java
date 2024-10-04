package ch03;

import java.util.HashMap;

public class Ch03_맵 { //사전과 비슷함
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 맵은 추가를 put 으로 함
        map.put("people", "사람");
        map.put("baseball","야구");
        // 자료를 가져올땨 get(키)
        System.out.println(map.get("people"));
        // containsKey 맵에 해당 key 가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball"));
        //삭제는 remove(키) 삭제하고 삭제된 값이 리턴됨
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        //size : 갯수
        System.out.println(map.size());
        //KeySet 맵의 모든 키를 리턴
        map.put("apple","사과");
        System.out.println(map.keySet());
        //맵의 value 값들만 출력
        System.out.println(map.values());
    }
}
