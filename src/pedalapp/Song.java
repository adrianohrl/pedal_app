package pedalapp;

/**
 *
 * @author Adriano Henrique Rossette Leite
 * @since 03/19/2014 3:59 pm
 * @version 1.0.0001
 */
public class Song  extends DatabaseComponent
{
    public Song(String name)
    {
        super(name);
    }
    
    public Song(long id)
    {
        super(id);
    }
}
