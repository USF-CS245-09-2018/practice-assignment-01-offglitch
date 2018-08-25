
public class FactorialIterative implements Factorial {

	@Override
		public int factorial(int n) {
		    int sum = 1;
		    if (n <= 1) return sum;
		    while (n > 1)
		    {
		        sum *= n;
		        n--;
		    }
		    return sum;
	}
}