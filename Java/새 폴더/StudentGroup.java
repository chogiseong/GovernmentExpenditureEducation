/////////////////////////////////////////////////////////////학생들의 정보를 저장하는 기능
package Donkey;

import java.util.ArrayList;

public class StudentGroup { //각 탭마다 학생정보를 공유하기 위한 static ArrayList 클레스
	public static ArrayList<Student> AL = new ArrayList<Student>();
}

//ArrayList를 static로 선언하여 아무 판넬에서 정보를 변경하더라도 모든 판넬에 변경사항이 반영됨
//사실 static은 정말 안좋은 방법인데 시간, 구현상 어쩔수 없이 사용
//추후에는 다른 방법으로 구현해야 할 필요가 있음