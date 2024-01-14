package br.com.designpatterns.singleton;

/**
 * @author lucas
 */
public final class Singleton {

    private static Singleton singleton;


    public static Singleton getInstance(){
       if(singleton == null){
           singleton = new Singleton();
       }
       return singleton;
    }
}
