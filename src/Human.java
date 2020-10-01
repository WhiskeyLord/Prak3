public class Human {

    private Hand h1 = new Hand(false, 11);
    private Hand h2 = new Hand(true, 11);
    private Leg l1 = new Leg(true,12);
    private Leg l2 = new Leg(false, 8);
    private Head headnum1 = new Head();
    Human() {
        headnum1.Set(true,"green");
        headnum1.SlapHead();
        l1.CheckLeg();
        h2.HighFive();
    }
}
