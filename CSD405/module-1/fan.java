// Michelle Choe
// 08/20/2023
// CSD 405 Intermediate Java Programming
// Module 1.2


public class TestFan{

    public static void main(String[] args) {

    }

    class Fan {
        // constant data fields
        static final int STOPPED = 0;
        static final int SLOW = 1;
        static final int MEDIUM = 2;
        static final int FAST = 3;

        // private non-constant data fields
        private int     speed;
        private boolean on;
        private int     radius;
        
        // non-constant data fields
        String fanColor;

        // default constructor
        Fan(){
            this.speed = STOPPED;
            this.radius = 6;
            this.fanColor = "white";
        }

        // setters
        void setSpeed(int speed) {
            this.speed = speed;
        }

        void setOn(boolean on){
            this.on = on;
        }

        void setRadius(int radius){
            this.radius = radius;
        }

        void setFanColor(String fanColor){
            this.fanColor = fanColor;
        }

        // getters
        int getSpeed() {
           return this.speed;
        }

        boolean getOn(){
            return this.on;
        }

        int getRadius(){
            return this.radius;
        }

        String getFanColor(){
            return fanColor;
        }
        
    }
}