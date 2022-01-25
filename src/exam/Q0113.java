package exam;

import java.util.HashSet;

/*
여러개의 숫자가 적힌 문자열 numbers가 주어졌을 때, 
문자열에 들어있는 숫자로 만들 수 있는 소수가 몇 개인지 return 하도록 
find_prime 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
"17"	3
"011"	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
*/

public class Q0113 {

	public static void main(String[] args) {
		String numbers = "011";
		System.out.println(find_prime(numbers));

	}
	
	public static int find_prime(String numbers) {
		// 일단 쪼개서 각각의 숫자를 String[]에 담아줌
		String[] eachNum = numbers.split("");
		// 소수인 최종 결과물이 들어갈 HashMap
		HashSet<Integer> result = new HashSet<>();
		// 방문했는지 체크하는 용도
		boolean[] visited = new boolean[eachNum.length];
		// 계산
		for(int i=1;i<=eachNum.length;i++) {
			perm(eachNum, "", visited, 0, i, result);
		}
		// return 값은 개수이기 때문에 .size()의 값을 return
		return result.size();
	}
	
	// P순열
	private static void perm(String[] arr, String output, boolean[] visited, int depth, int r, HashSet<Integer> result) {
		// 완료된 결과값
		if(depth==r) {
			Integer cand = Integer.parseInt(output);
			// 1이나 0 제외
			if(cand==1 || cand==0) return;
			// 이제 이게 소수인지 확인하고 소수라면 HashMap에 넣으면 됨
			if(isPrime(cand)==true) {
				result.add(cand);
			}
			
			return;
		}
		
		// 하나씩 결과 만들기
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
	
	// 소수인지 아닌지 확인하는 method
	private static boolean isPrime(Integer num) {
		for(int i=2; i*i<=num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
	
}

