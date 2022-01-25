// [문제1] 성적처리프로그램을 작성하시오

package exam;

import java.util.ArrayList;

public class Q0114_01 {

	public static void main(String[] args) {
		ScoreList sl = ScoreList.getInstance();
		sl.addPers(1, "A", 90, 90, 90);
		sl.addPers(2, "B", 80, 80, 80);
		sl.addPers(3, "C", 95, 95, 95);
		sl.addPers(3, "C", 85, 85, 85);
		sl.addPers(3, "C", 75, 75, 75);
		sl.showPers();
	}
	
	

}

//[문제1] 성적처리프로그램
class ScoreList{
	
	private ScoreList(){
		// 싱글톤을 만들 것이기 때문
	}
	private static ScoreList sl = new ScoreList();
	
	
	// 만약 다른 사용하고 싶으면 getInstance() method로 instance를 꺼내받고 사용해야 함
	public static ScoreList getInstance() {
		return sl;
	}
	
	// Person class를 밖에 꺼내도 되지만, 외부 접근을 막고자 inner class로 정의해둠
	class Person{
		private int num;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		private int avg;
		private String score;
		private boolean reLec;
		private int rank;
		
		// 생성자를 private로 지정
		private Person(int num, String name, int kor, int eng, int math) {
			this.num=num;
			this.name=name;
			this.kor=kor;
			this.eng=eng;
			this.math=math;
			
			sum=this.kor+this.eng+this.math;
			avg=(int)((double)sum/3.0);
			
			if(avg>=90) {score="A";}
			else if(avg>=80) {score="B";}
			else if(avg>=70) {score="C";}
			else if(avg>=60) {score="D";}
			else {score="F";}
			
			if(score.equals("F")) {reLec=true;}
			else {reLec=false;}
			
			// 동점인 경우 먼저 입력한 사람이 우선 순위
			rank = setRank(sum);
		}
		
		//
		private int setRank(int sum) {
			int rank=1;
			
			for(int i=0;i<list.size();i++) {
				if(sum > list.get(i).sum) {list.get(i).rank+=1;}
				else if(sum <= list.get(i).sum) {rank+=1;}
			}
			return rank;
		}
		
		
	}
	
	// Person을 담는 ArrayList
	private ArrayList<Person> list = new ArrayList<>();
	
	public void addPers(int num, String name, int kor, int eng, int math) {
		list.add(sl.new Person(num, name, kor, eng, math));
	}
	
	public void showPers() {
		System.out.printf("%-4s%-10s%-4s%-4s%-5s%-4s%-4s%-5s%-6s%-5s","번호","이름","국어","영어","수학","총합","평균","학점","재수강","등수");
		System.out.println("");
		
		for(int i=0;i<list.size();i++) {
			Person p = list.get(i);
			System.out.printf("%-5s%-10s%-5s%-5s%-5s%-5s%-5s%-5s%-7s%-5s", p.num, p.name, p.kor, p.eng, p.math, p.sum, p.avg, p.score, p.reLec, p.rank);
			System.out.println("");
		}
		
	}
	
	
	
}