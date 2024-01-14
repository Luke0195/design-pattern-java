package br.com.designpatterns.singleton;
// Thread são responsáveis pela a execução processos paralelos.
public class DemoSingletonPropreidadeThread{

    public static void main(String[]args){
        Thread thread = new Thread(new SingleThread());
        Thread thread2 = new Thread(new SingleThreadBar());
        thread.start();
        thread2.start();
    }

    static class SingleThread implements  Runnable{
        @Override
        public void run() {
         SingletonPrioridade singletonPrioridade = SingletonPrioridade.getInstance("Teste 01");
         System.out.println(singletonPrioridade);
        }
    }

    static class SingleThreadBar implements  Runnable{
        @Override
        public void run() {
            SingletonPrioridade singletonPrioridade = SingletonPrioridade.getInstance("any_teste01");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(singletonPrioridade);
        }
    }

}
