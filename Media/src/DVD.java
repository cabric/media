public class DVD extends Item {

    private String director;

    public DVD(String title, String director, int playingTime, boolean gotIt ,String comment) {

        super(title, playingTime, gotIt , comment);

        this.director = director;

    }

    public static void main(String[] args) {

    }

    public void print() {

        super.print();

        System.out.println("director: "+director);

    }

}
