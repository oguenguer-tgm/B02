package oguenguer;

public class rekursionen {


	public static long nfak (int i){
		if(i == 0) {
			return 1;
		}

		if(i < 0){
			throw new myException("Der Wert ist zu klein.");
		}
		
		long s = nfak(i-1)*i;
		if(s> Long.MAX_VALUE /i){
			throw new myException("zu groﬂ!");
		}
		return s;
	}

	public static long nfakdo (int i){
		if(i == 0) {
			return 1;
		}

		if(i < 0){
			throw new myException("Der Wert ist zu klein.");
		}
		
		long s = nfakdo(i-1)*i;
		if(s> Long.MAX_VALUE /i){
			throw new myException("zu groﬂ!");
		}
		return s;
	}

	public static double fiboaci (int i){
		if(i<0) {
			throw new myException("Der Wert ist zu klein.");
		}

		if(i==0 || i==1){
			return 1;
		}
		long s = (long) (fiboaci(i - 2) + fiboaci(i - 1));
		if ( s > Long.MAX_VALUE / i){
			throw new myException("Zahl zu groﬂ.");
		}
		return s;
	}

	public static void main (String[] args) {
		System.out.println("Faktorielle mit Long!");
		for(int i=0;i<20;i++){
			try{
				
				System.out.println("!"+i+"="+rekursionen.nfak(i));
			}
			catch(myException e){
				e.printStackTrace();
			}
			System.out.println("\n");
		}
		
		System.out.println("Faktorielle mit Double!");
		for(int i=0;i<20;i++){
			try{
				
				System.out.println("!"+i+"="+rekursionen.nfakdo(i));
			}
			catch(myException e){
				e.printStackTrace();
			}
			System.out.println("\n");
		}
		
		System.out.println("Fibonacci!");
		for(int i=0;i<20;i++){
			try{
				
				System.out.println("Fibonacci "+i+"="+rekursionen.fiboaci(i));
			}
			catch(myException e){
				e.printStackTrace();
			}
			System.out.println("\n");
		}

	}






}

