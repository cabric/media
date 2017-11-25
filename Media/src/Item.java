public class Item {

    private String title;

    private int playingTime;

    private boolean gotIt;

    private String comment;

    public Item(String title, int playingTime, boolean gotIt ,String comment) {

        super();

        this.title = title;

        this.playingTime = playingTime;

        this.gotIt = true;

        this.comment = comment;

    }

    public void print() {

        System.out.print("title: "+title+"   ");

        System.out.print("playingTime: "+playingTime+"   ");

        System.out.print("gotIt: "+gotIt+"   ");

        System.out.print("comment: "+comment+"   ");

    }

}