import java.util.*;



//Observation of how code will work ,

//so basically , I have created two threads, and each thread has an instance ,of the ThreadingTheNeedle class, the threading the needle class,
//has a global variable called, globalcounter, if a thread was to be created and made to access the resouce, it has to create it's own instance of the class, to get access to that resouce, and taking a look I have created a object level lock , meaning threads will not be blocking each other, they will both be making changes to their own globalcounter, (i.e in this case the increase method in the class);

//synchronized keyword in this case is usless.

public class ThreadingTheNeedle{


public int globalcounter;

public static void main(String args[]) throws Exception{

	opertionThread operationObject = new operationThread();
	anotherThread operationObject2 = new anotherThread();


	operationObject.start();
	operationObject2.start();


	while(true){

		System.out.println(
	}








}


//a simple monitor lock, nothing interesting here.
public synchronized int increase(){
		return counter++;
}


//same for this too.
public synchronized int decrease(){
		return counter--;
}
}



class operationThread extends Thread{


@Override
public void run(){

	//operation to increment a number;

	ThreadingTheNeedle myobject = new ThreadingTheNeedle();


	for(int i = 0; i < 10; i++){

		System.out.println(myobject.increase());

	}


}


}


class anotherThread extends Thread{



@Override
public void run(){

		ThreadingTheNeedle myobject = new ThreadingTheNeedle();

		for(int x = 0 ; x < 10; x++){
				System.out.println(myobject.increase());
			}


}}
