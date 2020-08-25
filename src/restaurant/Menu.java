package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    Date lastUpdated = new Date();



    public ArrayList<MenuItem> getMenu() {return menu;}

    public Date getLastUpdated() {return lastUpdated;}





}
