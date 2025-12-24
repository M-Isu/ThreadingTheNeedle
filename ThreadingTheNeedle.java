import java.util.*;

public class ThreadingTheNeedle{

public static void main(String args[]) throws Exception{
			something myobject = new something();
			
			//myobject.start();
			
			//check the state of the already created, 
			


			myobject.start();

			//Boolean variable = null;


			Boolean variable = (myobject.getState().toString().contains("NEW,RUNNING")) ? true : false;

			System.out.println((variable) ? "Test thread is either new , or running": "Test thread ended");

			while(variable){
				System.out.println(myobject.getState());
				variable = (myobject.getState().toString() == "TERMINATED") ? false : true;
			}


			System.out.println("this is the main thread it is running alright");


			
	}

}



class something extends Thread{


@Override
public void run(){
	System.out.println("This thread has been created,and is running");

	try{
	Thread.sleep(10000);
	}
	catch(Exception e){
		System.out.println("An error occured");
	}
}


}
