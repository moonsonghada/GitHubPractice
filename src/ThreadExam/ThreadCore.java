package ThreadExam;

public class ThreadCore implements Runnable{
	public long sum = 0;
	private final long from;
	private final long to;
	
	public ThreadCore(long from, long to) {
		this.from=from;
		this.to=to;
	}
	
	@Override
	public void run() {
		for(long i=from; i<=to; i++) {
			if(i%2 == 0) {
				sum+=i;
			}
		}
		
	}
}
