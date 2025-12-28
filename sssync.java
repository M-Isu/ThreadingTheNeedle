public class sssync{


    private int counter;

    private Object object = new Object();

    public static void main(String args[]){


    }

    //kind of feel like this , is kinda of similar to you linking it to an object.
    public void action(){

    //it can be this , instead of object.
        synchronized(object){
            counter++;
        }

    }


}


class operation extends Thread{

    public sssync sharedObject;

    operation(sssync sharedObject){
        this.sharedObject = sharedObject;
    }


    @Override
    public void run(){
        sharedobject.action();

    }

}


class secondoperation extends Thread{

    public sssync sharedObject;

    secondoperation (sssync sharedObject){
            this.sharedObject = sharedObject;
            }

    @Override
    public void run(){
        sharedObject.action();
    }

    }


