import java.util.*;



//Observation of how code will work ,

//so basically , I have created two threads, and each thread has an instance ,of the ThreadingTheNeedle class, the threading the needle class,
//has a global variable called, globalcounter, if a thread was to be created and made to access the resouce, it has to create it's own instance of the class, to get access to that resouce, and taking a look I have created a object level lock , meaning threads will not be blocking each other, they will both be making changes to their own globalcounter, (i.e in this case the increase method in the class);

//synchronized keyword in this case is usless.

public class ThreadingTheNeedle{


public int globalcounter;

public static void main(String args[]) throws Exception{

	ThreadingTheNeedle mysharedobject = new ThreadingTheNeedle();

	operationThread operationObject = new operationThread(mysharedobject);
	anotherThread operationObject2 = new anotherThread(mysharedobject);
	operationObject.start();
	operationObject2.start();
}


//a simple monitor lock, nothing interesting here.
		public int increase(){
				return globalcounter++;
		}


//same for this too.
		public int decrease(){
				return globalcounter--;
		}


}



class operationThread extends Thread{
	public ThreadingTheNeedle sharedObject;

	public operationThread(ThreadingTheNeedle sharedObject){
		this.sharedObject = sharedObject;
		}

@Override
public void run(){
	//operation to increment a number;
	for(int i = 0; i < 10; i++){
		System.out.println(sharedObject.increase());
	}
}
}


class anotherThread extends Thread{

	public ThreadingTheNeedle sharedObject;

	public anotherThread(ThreadingTheNeedle sharedObject){
		this.sharedObject = sharedObject;
		}

@Override
public void run(){
		for(int x = 0 ; x < 10; x++){
				System.out.println(sharedObject.increase());
			}
		}
}
