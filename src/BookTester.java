public class BookTester {
    public static void main(String args[]){
        Book b1,b2;
        b1 = new Book("R.R.Jonson", "hula hoop", "drama",2002);
        b2 = new Book("J.K.Rouling", "DnD", "comedy", 1993);
        b2.SetChange();
        System.out.println(b1.GetInfo());
        System.out.println(b2.GetInfo());

    }
}
