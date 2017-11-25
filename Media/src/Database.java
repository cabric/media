import java.util.ArrayList;

public class Database {

    private ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(Item item){

        listItem.add(item);

    }

    public void list(){

        for(Item item:listItem){

            item.print();

        }

    }

    public static void main(String[] args) {

        Database db = new Database();

        db.add(new CD("I am a CD","Even",6,24,true,"good"));

        db.add(new DVD("I am a DVD","Even",20,true,"wonderful"));

        db.add(new Mp3("I am a Mp3","Even",20,true,"talented","Hello World"));

        db.list();

    }

}
