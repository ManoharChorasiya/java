class TrafficLight {
    private String light;
    private int duration;

    public TrafficLight(String light, int duration) {
        this.light = light;
        this.duration = duration;
    }

    public void changeColor(String green, String red) {
        if (duration >= 30) {
            System.out.println(green);
        }
        if (duration <= 60) {
            System.out.println(red);
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        TrafficLight obj = new TrafficLight("initial_color", 45);
        obj.changeColor("Green Light", "Red Light");
    }
}