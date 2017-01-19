
public class Problem3_LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600851475143L;
		long max_prime_factor=0;
		long next_factor=0;
		do{
			next_factor = prime_devidor(num);
			if(next_factor>max_prime_factor) max_prime_factor=next_factor;
			if (next_factor == num){
				System.out.println(prime_devidor(max_prime_factor));
				return;
			}else{
				num/=next_factor;
			}
		}while(true);
	}
	public static long prime_devidor(long num){
		for(long mod=0,i=2;i<=(num/2);i++){
			mod = num%i;
			if(mod==0) return i;
		}
		return num;
	}

}
