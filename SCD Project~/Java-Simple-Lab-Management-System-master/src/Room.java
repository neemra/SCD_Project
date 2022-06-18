/**
 * @name Room.java
 * @desc represents a room
 * @version August 18, 2011

 */

import java.io.*;
import java.util.*;

public class Room implements Serializable
{
    private int capacity;
    private String name;
    private boolean hasNetBeans;
    private boolean hasJava;
    private boolean hasWindows10;
    private boolean hasUbuntu;
    private ArrayList<Reservation> reservations;
    
    /**
     * @desc initializes the attributes of the room
     * @param capacity the number of computed stored
     */
    public Room(int capacity, String name)
    {
        this.capacity = capacity;
        this.hasNetBeans = false;
        this.hasJava = false;
        this.hasWindows10 = false;
        this.hasUbuntu = false;
        this.name = name;
        
        this.reservations = new ArrayList<Reservation>();
    }
    
    /**
     * @desc adds a reservation
     * @return the result of adding
     */
    public void addReservation(Reservation reservation)
    {
        this.reservations.add(reservation);
    }
    
    /**
     * @desc setter methods
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    
    public void setHasNetBeans(boolean hasNetBeans)
    {
        this.hasNetBeans = hasNetBeans;
    }
    
    public void setHasJava(boolean hasJava)
    {
        this.hasJava = hasJava;
    }
    
    public void setHasWindows10(boolean hasWindows10)
    {
        this.hasWindows10 = hasWindows10;
    }
    
    public void setHasUbuntu(boolean hasUbuntu)
    {
        this.hasUbuntu = hasUbuntu;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getCapacity()
    {
        return this.capacity;
    }
    
    public boolean hasNetBeans()
    {
        return this.hasNetBeans;
    }
    
    public boolean hasJava()
    {
        return this.hasJava;
    }
    
    public boolean hasWindows10()
    {
        return this.hasWindows10;
    }
    
    public boolean hasUbuntu()
    {
        return this.hasUbuntu;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public ArrayList<Reservation> getReservations()
    {
        return this.reservations;
    }
}
