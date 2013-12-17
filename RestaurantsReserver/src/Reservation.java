/**
 * Created by hsbacot on 12/16/13.
 */
public class Reservation {



    private int time;
    private String name;
    private int party = 8;

        public Reservation() {
//            this.time = time;
//            this.name = name;
//            this.party = party;
        }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParty() {
        return party;
    }

    public void setParty(int party) {
        this.party = party;
    }

}
