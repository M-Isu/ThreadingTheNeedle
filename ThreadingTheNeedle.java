import java.util.*;

class ThreadingTheNeedle{


public static void main(String args[]){
			something myobject = new something();
			
			//myobject.start();
			
			//check the state of the already created, 
			
			System.out.println(myobject.state());
			
	}

}


class something extends Thread{


@Override
public void run(){
	System.out.println("This thread has been created,and is running");
}


}