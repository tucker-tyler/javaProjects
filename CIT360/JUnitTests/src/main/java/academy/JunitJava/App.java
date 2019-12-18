//Declare App
public class App {
	
	//Declare answer
	private int answer;
	
	//Assign value to answer
	public App() {
		answer = 0;
	}
    
	public int sum(int a, int b) {
		answer = a + b;
		return answer;
	}
	
	public int subtraction(int a, int b) {
		answer = a - b;
		return answer;
	}
	
	public int sum(int v) {
		answer += v;
		return answer;
	}
	
	public int subtraction(int v) {
		answer -= v;
		return answer;
	}
	
	public boolean isEvenNumber(int number){
        
        boolean result = false;
        
        //IF statement about if the number is even
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
	
	public int answer() {
		return answer;
	}
	
	//Exception if the number is not even
	public int div(int a, int b) {
		if (b==0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		answer = a/b;
		return answer;
	}
	
	public void clear() {
		answer = 0;
	}
}