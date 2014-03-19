package pedalapp;

/**
 *
 * @author Adriano Henrique Rossette Leite
 * @since 03/19/2014 3:40 pm
 * @version 1.0.0001
 */
public class DatabaseComponent 
{
    private String name;
    private long id;
    
    public DatabaseComponent(String name)
    {
        if ((name == null) || (name.equals("")))
            throw new RuntimeException("");
        this.name = name;
        this.id = this.getID(name);
    }
    
    public DatabaseComponent(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        this.id = id;
        this.name = this.getName(id);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    private String getName(long id)
    {
        if (id <= 0)
            throw new RuntimeException("");
        String name = null;
        ///////////////////////////////
        return name;
    }
    
    public long getID()
    {
        return this.id;
    }
    
    private long getID(String name)
    {
        if ((name == null) || (name.equals("")))
            throw new RuntimeException("");
        long id = 0;
        ///////////////////////////
        return id;
    }
}
