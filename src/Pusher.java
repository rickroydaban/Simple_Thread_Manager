
public class Pusher extends Thread {
  MyStack rickStack;
  int pushCtr = 0;	
  
  public Pusher(MyStack rickStack){
	this.rickStack = rickStack;
  }
  
  @Override
  public void run() {
	while(rickStack.topElemIndex < rickStack.maxElem && pushCtr < 10){
	  rickStack.push(getName());	
	  pushCtr++;
	}

  }
}
