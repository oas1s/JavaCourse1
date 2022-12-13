package anonimous;

interface OtherMonitoring {
    void monitor();
}

public class Main {
    public static void main(String[] args) {
        Monitoring monitoring = new GeneralMonitoring();
        Monitoring monitoring1 = new ErrorMonitoring();
        monitoring.monitor();
        monitoring1.monitor();

        OtherMonitoring otherMonitoring = new OtherMonitoring() {
            @Override
            public void monitor() {
                System.out.println("database monitoring started");
            }
        };
        OtherMonitoring otherMonitoring1 = new OtherMonitoring() {
            @Override
            public void monitor() {
                System.out.println("cpu usage monitoring started");
            }
        };

        otherMonitoring.monitor();
        otherMonitoring1.monitor();
    }
}
