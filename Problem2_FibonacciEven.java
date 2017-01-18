
public class Problem2_FibonacciEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long term_prev=1;
		long term_current=2;
		long term_next=0;
		long sum=2;
		do{
			if(term_next%2==0)
			sum+=term_next;
			
			//preparing for the next iteration
			//if the next term exceeds 4 million it's not counted
			term_next = term_prev+term_current;			
			term_prev = term_current;
			term_current=term_next;
		}while(term_next <= 4000000);
		System.out.println(sum);
	}

}
