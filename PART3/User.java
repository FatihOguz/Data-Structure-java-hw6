/**
 *
 146/5000
 In this class, user and administrator are determined by password.
 There is a system variable inside the class. the user contains his own system information.
 */
public class User {
    /**
     * admin password
     */
    private int password;
    /**
     * book system
     */
    private Systems systems;

    /**
     * create user and user has a system
     * @param systems is systems of books
     */
    public User(Systems systems){
        this.systems=systems;
        password=0;
    }

    /**
     * create user or admin
     * if password == system.ADMIN_PASSWORD user is admin
     * @param password admin password
     * @param systems book system
     */
    public User(int password,Systems systems){
        this.password=password;
        this.systems=systems;
    }

    /**
     * admin remove book
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void remove(int password,String authorName,String bookName,String locationOfBook){
        systems.remove(password,authorName,bookName,locationOfBook);
    }

    /**
     * admin remove book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void remove(String authorName,String bookName,String locationOfBook){
        systems.remove(password,authorName,bookName,locationOfBook);
    }

    /**
     *admin add book
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void put(int password,String authorName,String bookName,LocationStatus locationOfBook){
        systems.put(password,authorName,bookName,locationOfBook);
    }

    /**
     * admin add book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void put(String authorName,String bookName,LocationStatus locationOfBook){
        systems.put(password,authorName,bookName,locationOfBook);
    }

    /**
     *admin update location of book
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books(old)
     * @param newLocation is location of book or books(new)
     */
    public void setLocation(int password,String authorName,String bookName,LocationStatus locationOfBook,LocationStatus newLocation){
        systems.setLocation(password,authorName,bookName,locationOfBook,newLocation);
    }

    /**
     * admin update location of book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books(old)
     * @param newLocation is location of book or books(new)
     */
    public void setLocation(String authorName,String bookName,LocationStatus locationOfBook,LocationStatus newLocation){
        systems.setLocation(this.password,authorName,bookName,locationOfBook,newLocation);
    }

    /**
     * admin update book name
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param newBookName is name of book(changed)
     */
    public void setBookName(int password,String authorName,String bookName,String newBookName){
        systems.setBookName(password,authorName,bookName,newBookName);
    }

    /**
     *admin update book name
     * @param authorName is name of author
     * @param bookName is name of book
     * @param newBookName nome of book(updated)
     */
    public void setBookName(String authorName,String bookName,String newBookName){
        systems.setBookName(password,authorName,bookName,newBookName);
    }

    /**
     *admin update book name
     * @param password admin password
     * @param authorName is name of author
     * @param newAuthorName nome of outhor(updated)
     */
    public void setAuthorName(int password,String authorName,String newAuthorName){
        systems.setAuthorName(password,authorName,newAuthorName);
    }

    /**
     * *admin update book name
     * @param authorName is name of author
     * @param newAuthorName nome of outhor(updated)
     */
    public void setAuthorName(String authorName,String newAuthorName){
        systems.setAuthorName(password,authorName,newAuthorName);
    }

    /**
     *  this method listed books of author
     *  and ask user which book. want to know location of book
     * @param author is name of author
     */
    public  void authorSearch(String author){
        systems.authorSearch(author);
    }

    /**
     * give location of book
     * @param bookName is name of book
     */
    public void searchBook(String bookName)
    {
        systems.searchBook(bookName);
    }

    @Override
    public String toString() {
        return systems.toString() ;
    }
}
