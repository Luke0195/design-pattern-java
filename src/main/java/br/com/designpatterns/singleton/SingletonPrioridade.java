package br.com.designpatterns.singleton;

public class SingletonPrioridade {

    private static SingletonPrioridade singleton;
    private String value;


    private SingletonPrioridade(String value){
        this.value = value;
    }

    public static SingletonPrioridade getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPrioridade(value);
        }
        return singleton;
    }

    public String getValue(){
        return this.value;
    }
}
