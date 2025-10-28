package Assignment5;

public class SmartDeviceControl {
    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    class Light implements SmartDevice {
        public void turnOn() { System.out.println("Light ON"); }
        public void turnOff() { System.out.println("Light OFF"); }
    }

    class AC implements SmartDevice {
        public void turnOn() { System.out.println("AC ON"); }
        public void turnOff() { System.out.println("AC OFF"); }
    }

    public class DemoDevices {
        public static void main(String[] args) {
            SmartDevice[] devices = { new Light(), new AC() };
            for (SmartDevice d : devices) d.turnOn();
            for (SmartDevice d : devices) d.turnOff();
        }
    }

}
