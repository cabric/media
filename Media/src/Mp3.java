public class Mp3 extends Item{

    private String lyics;

    private String singer;

    public Mp3(String title, String singer, int playingTime, boolean gotIt, String comment,

               String lyics) {

        super(title, playingTime, gotIt, comment);

        this.lyics = lyics;

        this.singer = singer;

    }

    public static void main(String[] args) {

    }

    public void print() {

        super.print();

        System.out.print("singer: "+singer+"   ");

        System.out.println("lyics: "+lyics);

    }

}