import lombok.SneakyThrows;

public class Main {
    public static void main(String[] args) {
        DataExecutor dataExecutor = new DataExecutor();
        Sender sender = new Sender(dataExecutor);
        Receiver receiver = new Receiver(dataExecutor);

        sender.start();
        receiver.start();
    }

    static class Sender extends Thread{

        private DataExecutor data;

        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        public Sender(DataExecutor data) {
            this.data = data;
        }

        @SneakyThrows
        public void run(){
            for (String packet : packets) {
                data.send(packet);
                Thread.sleep(500);
            }
        }
    }

    static class Receiver extends Thread {

        private DataExecutor data;

        public Receiver(DataExecutor data) {
            this.data = data;
        }


        @SneakyThrows
        public void run(){
            String receivedMessage = data.receive();
            while (!receivedMessage.equals("End")){
                System.out.println(receivedMessage);
                receivedMessage = data.receive();
                Thread.sleep(500);
            }
        }
    }
}
