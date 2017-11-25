public class CD extends Item {

    private String artist;

    private int numofTrack;

    public CD(String title, String artist, int numofTrack, int playingTime,boolean gotIt,

              String comment) {

        super(title, playingTime, gotIt, comment);

        this.artist = artist;

        this.numofTrack = numofTrack;

    }

    public static void main(String[] args) {

    }

    public void print() {

        super.print();

        System.out.print("artist: "+artist+"   ");

        System.out.println("numofTrack: "+numofTrack);

    }

}
