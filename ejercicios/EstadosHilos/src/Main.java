public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {//Creado
            try {
                Thread.sleep(500); //Dormido o pausado
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Hola soy un hilo");
        });


        System.out.println("Estado actual del hilo: " + thread.getState());
        thread.start(); // Runnable
        System.out.println("Estado después de iniciar el hilo: " + thread.getState());
        Thread.sleep(200); //Tiempo limitado
        System.out.println("Estado después de un tiempo de ejecución: " + thread.getState());

        //Bloqueck, el hilo está esperando algún recurso que está siendo utilizado por otro hilo
        //Waiting Espera que otro hilo realiza ciertas acciones para despertarlo

        thread.join();
        System.out.println("Estado después de unirse al hilo: " + thread.getState());
    }
}