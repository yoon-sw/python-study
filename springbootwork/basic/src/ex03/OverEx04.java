package ex03;

interface CallBack{
	void hello() ;
}


public class OverEx04 {
	static void finish(CallBack callback) {
		callback.hello();
	}
	
	public static void main(String[] args) {
		
		finish(() -> {
			
		});
	}
}
