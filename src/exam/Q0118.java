package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*
�׸� ��������Ƽ ��ī������ 2xN���� ���������� N�� �� ������ ���� ���� ������ �Ϸ��� �մϴ�. 
�� ���� ���� ���� A���� B���̶�� �ϰڽ��ϴ�. ���� ������ ��Ģ�� ������ �����ϴ�.

���� ��� ����� �������� �ڿ����� �ϳ��� �ο��޽��ϴ�.
�� ����� �� �� ���� ��⸦ �մϴ�.
�� ���� A������ �� �����, B������ �� ����� ���� ������ ���� �����մϴ�. 
�׶� ���ڰ� ū ���� �¸��ϰ� �ǰ�, �¸��� ����� ���� ���� ������ 1�� ��� �˴ϴ�.
���� ���ڰ� ���ٸ� ������ ������ ���� �ʽ��ϴ�.
��ü ������� �켱 �������� �ڿ����� �ϳ��� �ο��޾ҽ��ϴ�. 
�״��� A���� ������ ���������� ���߰� �ڽŵ��� ���� ������ B������ �����ع��Ƚ��ϴ�. 
B���� �װ��� ���� �ڽŵ��� ���� ������ ���� ���̴� ������� �������� ���� ������ ���߽��ϴ�. 
�̶��� B���� ��� ������ �����ּ���.
A �������� �ο����� ���� ���� ������� �����Ǿ��ִ� �迭 A�� i��° ��Ұ� B���� i�� ������ 
�ο����� ���� �ǹ��ϴ� �迭 B�� �־��� ��, B �������� ���� �� �ִ� �ִ� ������ return �ϵ��� 
big_num_game �Լ��� �ϼ����ּ���.

���ѻ���
A�� B�� ���̴� �����ϴ�.
A�� B�� ���̴� 1 �̻� 100,000 �����Դϴ�.
A�� B�� �� ���Ҵ� 1 �̻� 1,000,000,000 ������ �ڿ����Դϴ�.
����� ��
A		B			result
[6,6,6,6]		[1,1,1,1]	   	   	   0
[25,111,34,171,99]	[12,252,63,81,85]	   	   2
[5,1,3,7]		[2,2,6,8]	   	   	   3
����� �� ����
����� �� #1
number_game2_yt913p.png
A ���� ���� 5�� �ο����� ������ ù��°�� �����ϰ�, �̾ 1,3,7�� �ο����� �������� ���ʴ�� �����մϴ�.
B �������� 4��, 2��, 3��, 1���� ������� ������ų ��� �������� �ο����� ���ڵ��� ���ʴ�� 8,2,6,2�� �˴ϴ�. �׷���, ù ��°, �� ��°, �� ��° ��⿡�� �¸��Ͽ� 3���� ��� �ǰ�, �̶��� �ִ��� �����Դϴ�.

����� �� #2
B �������� � ������ �������ѵ� B���� ������ 0���Դϴ�.
 */

public class Q0118 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		Random rand = new Random();
		
		for(int i=0; i<N; i++) 
			A[i] = rand.nextInt(100000)+1;
		for(int tmp:A) 
			System.out.print(tmp+", ");
		System.out.println("");
		
		for(int i=0; i<N; i++) 
			B[i] = rand.nextInt(100000)+1;
		for(int tmp:B) 
			System.out.print(tmp+", ");
		System.out.println("");
	
		System.out.println(big_num_game(A,B));
		

	}
	
	private static int big_num_game(int[] A, int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		
		int scoreB = 0;
		
		int idxA = 0;
		int idxB = 0;
		
		while(idxB<B.length) {
			if(A[idxA]<B[idxB]) {
				idxA++;
				scoreB++;
			}
			idxB++;
		}
		
		return scoreB;
	}

}
