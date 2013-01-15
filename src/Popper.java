
public class Popper extends Thread {
  MyStack rickStack;
	
  public Popper(MyStack rickStack){
	this.rickStack = rickStack;
  }
  
  
  @Override
  public void run() {
	while(rickStack.topElemIndex > 0){
		rickStack.pop();	
	}
  }
}
