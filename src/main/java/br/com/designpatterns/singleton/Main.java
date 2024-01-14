package br.com.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
       SingletonPrioridade sp =  SingletonPrioridade.getInstance("Teste 01");
       SingletonPrioridade sp2 = SingletonPrioridade.getInstance("Teste 02");
       System.out.println(sp);
       System.out.println(sp2);

    }
}
