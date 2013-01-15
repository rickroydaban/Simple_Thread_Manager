
public class MyStack {
  public int topElemIndex = 0;
  public int maxElem = 0;
    
  public MyStack(int maxElem){
	  this.maxElem = maxElem;
  }
  
 
  synchronized void pop(){
	//do the popping algorithms here  	
	System.out.print("Pop-- ");
	topElemIndex--;
	System.out.println("new Index " + topElemIndex);
	
  }
  
  synchronized void push(String value){
	//do the pushing algorithms here
	System.out.print("Push-- ");
	topElemIndex++;
	System.out.println("new Index " + topElemIndex);
  }
}
