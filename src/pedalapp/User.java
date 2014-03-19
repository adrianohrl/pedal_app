package pedalapp;

import java.util.ArrayList;

/**
 *
 * @author Adriano Henrique Rossette Leite
 * @since 03/08/2014 10:46 pm
 * @version 1.0.0001
 */
public class User extends DatabaseComponent
{
    private String password;
    private String email;
    private ArrayList<Pedal> pedals;
    private ArrayList<Song> songs;
    
    public User(long id)
    {
        super(id);
        this.password = this.getPassword(id);
        this.email = this.getEmail(id);
        this.pedals = this.getPedals(id);
        this.songs = this.getSongs(id);
    }
    
    public User(String name)
    {
        super(name);
        long id = super.getID();
        if (id <= 0)
            throw new RuntimeException("");
        this.password = this.getPassword(id);
        this.email = this.getEmail(id);
        this.pedals = this.getPedals(id);
        this.songs = this.getSongs(id);
    }
    
    public User(String name, String password, String email)
    {
        super(name);
        if ((password == null) || (password.equals("")))
            throw new RuntimeException("");
        this.password = password;
        if ((email == null) || (email.equals("")))
            throw new RuntimeException("");
        this.email = email;
        this.pedals = new ArrayList<Pedal>();
        this.songs = new ArrayList<Song>();
    }
    
    public User(String name, String password, String email, ArrayList<Pedal> pedals)
    {
        this(name, password, email);
        if (pedals == null)
            throw new RuntimeException("");
        this.pedals = pedals;
        this.songs = new ArrayList<Song>();
            
    }
    
    public User(String name, String password, String email, ArrayList<Pedal> pedals, ArrayList<Song> songs)
    {
        this(name, password, email, pedals);
        if (songs == null)
            throw new RuntimeException("");
        this.songs = songs;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    private String getPassword(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        String password = null;
        ////////////////////////////////////
        return password;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    private String getEmail(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        String email = null;
        ////////////////////////////////////
        return email;
    }
    
    public ArrayList<Pedal> getPedals()
    {
        return this.pedals;
    }
    
    private ArrayList<Pedal> getPedals(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        ArrayList<Pedal> pedals = new ArrayList<Pedal>();
        ////////////////////////////////////
        return pedals;
    }
    
    public ArrayList<Song> getSongs()
    {
        return this.songs;
    }
    
    private ArrayList<Song> getSongs(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        ArrayList<Song> songs = new ArrayList<Song>();
        ////////////////////////////////////
        return songs;
    }
}
