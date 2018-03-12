/**
 * Created by Bernardo on 31/10/2017.
 */

public class Contact {
    private String name;
    private boolean isOnline;

    public Contact(String name, boolean isOnline) {
        this.name = name;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public boolean isOnline(){
        return this.isOnline;
    }
}
