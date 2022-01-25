// [����1] ����ó�����α׷��� �ۼ��Ͻÿ�

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

//[����1] ����ó�����α׷�
class ScoreList{
	
	private ScoreList(){
		// �̱����� ���� ���̱� ����
	}
	private static ScoreList sl = new ScoreList();
	
	
	// ���� �ٸ� ����ϰ� ������ getInstance() method�� instance�� �����ް� ����ؾ� ��
	public static ScoreList getInstance() {
		return sl;
	}
	
	// Person class�� �ۿ� ������ ������, �ܺ� ������ ������ inner class�� �����ص�
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
		
		// �����ڸ� private�� ����
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
			
			// ������ ��� ���� �Է��� ����� �켱 ����
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
	
	// Person�� ��� ArrayList
	private ArrayList<Person> list = new ArrayList<>();
	
	public void addPers(int num, String name, int kor, int eng, int math) {
		list.add(sl.new Person(num, name, kor, eng, math));
	}
	
	public void showPers() {
		System.out.printf("%-4s%-10s%-4s%-4s%-5s%-4s%-4s%-5s%-6s%-5s","��ȣ","�̸�","����","����","����","����","���","����","�����","���");
		System.out.println("");
		
		for(int i=0;i<list.size();i++) {
			Person p = list.get(i);
			System.out.printf("%-5s%-10s%-5s%-5s%-5s%-5s%-5s%-5s%-7s%-5s", p.num, p.name, p.kor, p.eng, p.math, p.sum, p.avg, p.score, p.reLec, p.rank);
			System.out.println("");
		}
		
	}
	
	
	
}