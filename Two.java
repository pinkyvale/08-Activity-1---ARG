public class Two {
    interface HasWings {
        public int getNumberOfWings();
    }

    abstract class Insect implements HasWings {
        abstract int getNumberOfLegs();
    }

    public class Dragonfly extends Insect {

        public int getNumberOfWings() {
            return 4; 
        }


        public int getNumberOfLegs() {
            return 6;
        }
    }

    public static void main(String[] args) {

        Two tw = new Two();
        Dragonfly df = tw.new Dragonfly();
        

        System.out.println("Number of Wings: " + df.getNumberOfWings());
        System.out.println("Number of Legs: " + df.getNumberOfLegs());
    }
}
