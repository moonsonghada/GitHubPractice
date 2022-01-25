package exam;

import java.util.HashSet;

/*
�������� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, 
���ڿ��� ����ִ� ���ڷ� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� 
find_prime �Լ��� �ϼ����ּ���.

���ѻ���
numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�.
numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�.
"013"�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.
����� ��
numbers	return
"17"	3
"011"	2
����� �� ����
���� #1
[1, 7]���δ� �Ҽ� [7, 17, 71]�� ���� �� �ֽ��ϴ�.

���� #2
[0, 1, 1]���δ� �Ҽ� [11, 101]�� ���� �� �ֽ��ϴ�.

11�� 011�� ���� ���ڷ� ����մϴ�.
*/

public class Q0113 {

	public static void main(String[] args) {
		String numbers = "011";
		System.out.println(find_prime(numbers));

	}
	
	public static int find_prime(String numbers) {
		// �ϴ� �ɰ��� ������ ���ڸ� String[]�� �����
		String[] eachNum = numbers.split("");
		// �Ҽ��� ���� ������� �� HashMap
		HashSet<Integer> result = new HashSet<>();
		// �湮�ߴ��� üũ�ϴ� �뵵
		boolean[] visited = new boolean[eachNum.length];
		// ���
		for(int i=1;i<=eachNum.length;i++) {
			perm(eachNum, "", visited, 0, i, result);
		}
		// return ���� �����̱� ������ .size()�� ���� return
		return result.size();
	}
	
	// P����
	private static void perm(String[] arr, String output, boolean[] visited, int depth, int r, HashSet<Integer> result) {
		// �Ϸ�� �����
		if(depth==r) {
			Integer cand = Integer.parseInt(output);
			// 1�̳� 0 ����
			if(cand==1 || cand==0) return;
			// ���� �̰� �Ҽ����� Ȯ���ϰ� �Ҽ���� HashMap�� ������ ��
			if(isPrime(cand)==true) {
				result.add(cand);
			}
			
			return;
		}
		
		// �ϳ��� ��� �����
		for(int i=0;i<arr.length;i++) {
			if(visited[i] != true) {
				visited[i] = true;
				String temp =output;
				temp+=arr[i];
				perm(arr, temp, visited, depth+1, r, result);
				visited[i] = false;
			}
		}
	}
	
	// �Ҽ����� �ƴ��� Ȯ���ϴ� method
	private static boolean isPrime(Integer num) {
		for(int i=2; i*i<=num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
	
}

