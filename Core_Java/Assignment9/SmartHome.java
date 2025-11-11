package Assignment9;


    @FunctionalInterface
    interface LightAction {
        void activate();
    }

    public class SmartHome {
        public static void main(String[] args) {
            LightAction motionTrigger = () -> System.out.println("Lights ON due to motion detection!");
            LightAction nightTrigger = () -> System.out.println("Dim lights ON at 8 PM.");
            LightAction voiceTrigger = () -> System.out.println("Lights ON by voice command: 'Turn on lights'.");

            motionTrigger.activate();
            nightTrigger.activate();
            voiceTrigger.activate();
        }
    }


