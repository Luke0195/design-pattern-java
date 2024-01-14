package br.com.designpatterns.singleton;

public class DemoSinglePropriedadeThreadSyncronized {

    private static DemoSinglePropriedadeThreadSyncronized demoThread;
    private String value;

    private DemoSinglePropriedadeThreadSyncronized(String value){
        this.value = value;
    }

    // O synchorized vai permitir que o método seja executado em ordem de execução.

    public static synchronized DemoSinglePropriedadeThreadSyncronized getInstance(String value){
        if(demoThread == null){
            demoThread = new DemoSinglePropriedadeThreadSyncronized(value);
        }
        return demoThread;
    }

    public String getValue(){
        return value;
    }
}


