package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven(){

		if((iValue % 2) == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd(){

		if((iValue % 2) == 0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime(){
		for(int i = 2; 2 * i < iValue; i++) {
	        if(iValue % i ==0)
	            return false;
	    }
	    return true;
	}
	
	public boolean equals(int a){
		if(a == iValue)
			return false;
		else
			return true;
	}

}
