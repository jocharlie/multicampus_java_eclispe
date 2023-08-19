package 형변환;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션확인문제 {
	

		public static void main(String[] args) {

			
			
			
			//컬렉션 1번 중복제거문제 (set)
			HashSet tour = new HashSet();
			tour.add("미국");
			tour.add("중국");
			tour.add("일본");
			tour.add("북한");
			System.out.println(tour);
			
			
			//2 키+값으로 쌍으로 넣을 때는! ==> map
			
			HashMap map = new HashMap();
			map.put("안방", "TV");
			map.put("거실", "쇼파");
			map.put("부엌", "냉장고");
			map.put("현관", "신발");
			System.out.println(map.get("현관"));
			map.put("거실", "책상");
			System.out.println(map);
			
			
			
			//3. 할 일 우선순위(순서) ==> list
			
			// 3. 할 일 우선순위(순서) ==> list
			ArrayList doList = new ArrayList();
			doList.add("자바공부");
			doList.add("점심");
			doList.add("자바복습");
			doList.add("자바스터디");
			doList.add("쉬기");
			System.out.println(doList);
			System.out.println(doList.get(0));
			System.out.println(doList.get(doList.size() - 1));
			doList.set(1, "청소");
			System.out.println(doList);
		

	}


}
