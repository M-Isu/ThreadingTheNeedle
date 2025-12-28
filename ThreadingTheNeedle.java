public class ThreadingTheNeedle{


public static void main(String args[]) throws Exception{

	//common threading object.

	ThreadingTheNeedle commonobject = new ThreadingTheNeedle();

	firstThread mythreadobject = new firstThread(commonobject);
	mythreadobject.setName("first thread");
	mythreadobject.start();



	//starting second thread.
	secondThread secondobject = new secondThread(commonobject);
	Thread mysecond = new Thread(secondobject);
	mysecond.setName("second thread");
	mysecond.start();



	//starting third thread.
// 	Runnable myrunnableobject = () -> {
// 			//action goes in here.
//
// 			ThreadingTheNeedle needleobject = new ThreadingTheNeedle();
//
// 			needleobject.action(Thread.currentThread().getName());
//
// 	};
//



	ThreadingTheNeedle xx = new ThreadingTheNeedle();
	Thread mythirdobject = new Thread(xx.createRunnable(commonobject));
	mythirdobject.setName("third thread");
	mythirdobject.start();



}

public synchronized void  action(String threadname, String threadnumber){

	int maximum = 5;
	int minimum = 1;


			System.out.println(threadname);
			for(int x = minimum ; x <= maximum; x++){
				System.out.println(x);
			}

}


public Runnable createRunnable(ThreadingTheNeedle objectx){

	return () -> {
			objectx.action(Thread.currentThread().getName(),"3");
	};
}


}


//first thread.

class firstThread extends Thread{

private ThreadingTheNeedle sharedobject;

firstThread(ThreadingTheNeedle obj){
	this.sharedobject = obj;

}

@Override
public void run(){

sharedobject.action(this.getName(), "1");


}

}


class secondThread implements Runnable{


private ThreadingTheNeedle sharedobject;


secondThread(ThreadingTheNeedle obj){
	this.sharedobject = obj;

}


@Override
public void run(){

sharedobject.action(Thread.currentThread().getName(), "2");

	}

}




