import java.util.*;

/**
 * there are add, delete, update and search operations in the system
 */
public class Systems {
    /**
     * all data is kept here
     */
    private Map<String,Map<String,Set<LocationStatus>>> outerMap = new HashMap<String, Map<String, Set<LocationStatus>>>();
    /**
     * inner map of outer map
     * value of outer map
     * has only one cell
     */
    private Map<String, Set<LocationStatus>> innerMap = new HashMap<String, Set<LocationStatus>>();
    /**
     * has only one cell
     * value of inner map
     */
    private Set<LocationStatus> set = new LinkedHashSet<LocationStatus>();
    /**
     * password for administrator(for put remove and update methods)
     */
    private static final int ADMIN_PASSWORD = 123 ;
    /**
     * password for user
     */
    private int password;

    /**
     * no parameter constructor
     * for user
     */
    public Systems(){
        this.password=0;
    }

    /**
     * password for user
     * @param password is admin or user
     */
    public Systems(int password){
        this.password=password;
    }

    /**
     * admin remove book
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void remove(int password,String authorName,String bookName,String locationOfBook){
        if(password==ADMIN_PASSWORD){
            /**
             * YOU ARE ADMIN
             */
            for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()){

                /**
                 * yazar kayıtlı mı
                 */
                if(vals.getKey().equals(authorName)){
                    Map<String,Set<LocationStatus>> nested_vals = vals.getValue();
                    /**
                     * kitap var aynı kitap ekleniyo
                     */
                    for(Map.Entry<String,Set<LocationStatus>> nested_entries : nested_vals.entrySet()){
                        if(nested_entries.getKey().equals(bookName)){
                            Set set = nested_entries.getValue();
                            set.remove(locationOfBook);
                            if(set.size()==0){
                                nested_vals.remove(bookName,set);
                                if(nested_vals.size()==0){
                                    outerMap.remove(authorName);
                                }
                            }
                            return;
                        }
                    }
                }
            }

        }
        else{
            System.out.println("you not administrator");
        }

    }

    /**
     * admin remove book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void remove(String authorName,String bookName,String locationOfBook){
        remove(this.password,authorName,bookName,locationOfBook);
    }
    /**
     *admin add book
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void put(int password,String authorName,String bookName,LocationStatus locationOfBook){


        if(password == ADMIN_PASSWORD){
            for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()){

                /**
                 * yazar kayıtlı mı
                 */
                if(vals.getKey().equals(authorName)){
                    Map<String,Set<LocationStatus>> nested_vals = vals.getValue();
                    /**
                     * kitap var aynı kitap
                     */
                    for(Map.Entry<String,Set<LocationStatus>> nested_entries : nested_vals.entrySet()){

                        if(nested_entries.getKey().equals(bookName)){
                            Set<LocationStatus> set = nested_entries.getValue();
                            set.add(locationOfBook);
                            return;
                        }
                    }
                    /**
                     * yazarın bu kitabı ilk defa ekleniyor
                     */
                    innerMap = outerMap.get(authorName);
                    set=new LinkedHashSet<LocationStatus>();
                    set.add(locationOfBook);
                    innerMap.put(bookName,set);
                    return;

                }
            }
            /**
             * yazar kayıtlı değilse
             */
            Map<String, Set<LocationStatus>> innerMap = new HashMap<>();
            Set<LocationStatus> set = new LinkedHashSet<LocationStatus>();
            set.add(locationOfBook);
            innerMap.put(bookName,set);
            this.outerMap.put(authorName,innerMap);
            return;
        }
        else{
            System.out.println("you not administrator");
            return;
        }
    }
    /**
     * admin add book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books
     */
    public void put(String authorName,String bookName,LocationStatus locationOfBook){
        put(this.password,authorName,bookName,locationOfBook);
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
        if(password == ADMIN_PASSWORD){

            for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()) {

                /**
                 * yazar kayıtlı mı
                 */
                if (vals.getKey().equals(authorName)) {
                    Map<String, Set<LocationStatus>> nested_vals = vals.getValue();
                    /**
                     * kitap var aynı kitap ekleniyo
                     */
                    for (Map.Entry<String, Set<LocationStatus>> nested_entries : nested_vals.entrySet()) {
                        if (nested_entries.getKey().equals(bookName)) {
                            Set<LocationStatus> set = nested_entries.getValue();
                            set.remove(locationOfBook);
                            set.add(newLocation);
                        }
                    }

                }
            }
        }
        else{
            System.out.println("you not administrator");
        }
    }

    /**
     * admin update location of book
     * @param authorName is name of author
     * @param bookName is name of book
     * @param locationOfBook is location of book or books(old)
     * @param newLocation is location of book or books(new)
     */
    public void setLocation(String authorName,String bookName,LocationStatus locationOfBook,LocationStatus newLocation){
        setLocation(this.password,authorName,bookName,locationOfBook,newLocation);
    }
    /**
     * admin update book name
     * @param password admin password
     * @param authorName is name of author
     * @param bookName is name of book
     * @param newBookName is name of book(changed)
     */
    public void setBookName(int password,String authorName,String bookName,String newBookName){
        if(password == ADMIN_PASSWORD){

            for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()) {

                /**
                 * yazar kayıtlı mı
                 */
                if (vals.getKey().equals(authorName)) {
                    Map<String, Set<LocationStatus>> nested_vals = vals.getValue();
                    /**
                     * kitap var aynı kitap
                     */
                    for (Map.Entry<String, Set<LocationStatus>> nested_entries : nested_vals.entrySet()) {
                        if (nested_entries.getKey().equals(bookName)) {
                            Set<LocationStatus> set = nested_entries.getValue();
                            nested_vals.remove(bookName);
                            nested_vals.put(newBookName,set);
                            return;
                        }
                    }

                }
            }
        }
        else{
            System.out.println("you not administrator");
        }
    }
    /**
     *admin update book name
     * @param authorName is name of author
     * @param bookName is name of book
     * @param newBookName nome of book(updated)
     */
    public void setBookName(String authorName,String bookName,String newBookName){
        setBookName(this.password,authorName,bookName,newBookName);
    }
    /**
     *admin update book name
     * @param password admin password
     * @param authorName is name of author
     * @param newAuthorName nome of outhor(updated)
     */
    public void setAuthorName(int password,String authorName,String newAuthorName){
        if(password == ADMIN_PASSWORD){

            for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()) {

                /**
                 * yazar kayıtlı mı
                 */
                if (vals.getKey().equals(authorName)) {
                    Map<String, Set<LocationStatus>> nested_vals = vals.getValue();
                    outerMap.remove(authorName);
                    outerMap.put(newAuthorName,nested_vals);
                    return;
                }
            }
        }
        else{
            System.out.println("you not administrator");
        }
    }
    /**
     * *admin update book name
     * @param authorName is name of author
     * @param newAuthorName nome of outhor(updated)
     */
    public void setAuthorName(String authorName,String newAuthorName){
        setAuthorName(this.password,authorName,newAuthorName);
    }

    /**
     *  this method listed books of author
     *  and ask user which book. want to know location of book
     * @param author is name of author
     */
    public  void authorSearch(String author){


        for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()){

            /**
             * yazar kayıtlı mı
             */
            if(vals.getKey().equals(author)){
                Map<String,Set<LocationStatus>> nested_vals = vals.getValue();
                /**
                 * kitap var aynı kitap
                 */
                for(Map.Entry<String,Set<LocationStatus>> nested_entries : nested_vals.entrySet()){

                    System.out.println(nested_entries.getKey());
                }
                /**
                 * yazarın bu kitabı ilk defa ekleniyor
                 */


            }
        }
        /**
         * yazar kayıtlı değilse
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please write book name");
       String answer = scanner.nextLine();





        for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()){

            /**
             * yazar kayıtlı mı
             */
            if(vals.getKey().equals(author)){
                Map<String,Set<LocationStatus>> nested_vals = vals.getValue();
                /**
                 * kitap var aynı kitap
                 */
                for(Map.Entry<String,Set<LocationStatus>> nested_entries : nested_vals.entrySet()){

                    if (nested_entries.getKey().equals(answer)) {
                        System.out.println(nested_entries.getValue());
                        return;
                    }
                }
                System.out.println("wronw answer/book name");
            }
        }
    }

    /**
     * give location of book
     * @param bookName is name of book
     */
    public void searchBook(String bookName){
        for( Map.Entry<String,Map<String,Set<LocationStatus>>> vals:outerMap.entrySet()){

            Map<String,Set<LocationStatus>> nested_vals = vals.getValue();

                for(Map.Entry<String,Set<LocationStatus>> nested_entries : nested_vals.entrySet()){

                    if (nested_entries.getKey().equals(bookName)) {
                        System.out.println("search book " +vals.getKey()+ " " + bookName + " " +  nested_entries.getValue());
                        return;
                    }
                }

        }
    }


    @Override
    public String toString() {
        return outerMap.toString();
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
