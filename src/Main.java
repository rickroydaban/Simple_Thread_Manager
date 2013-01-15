
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  int maxElem = 30;
		
	  MyStack rickStack = new MyStack(maxElem);
	  
	  Pusher push = new Pusher(rickStack);
	  Popper popp = new Popper(rickStack);
	  push.start();
	  popp.start();
	}
}
