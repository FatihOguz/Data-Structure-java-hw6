import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Systems systems = new Systems(123);
        User administrator = new User(123,systems);
        User user1 = new User(systems);
        administrator.put("tolstoy","anna karenina",new LocationStatus("available","c1s1.1"));
        administrator.put("tolstoy","insan ne ile yasar",new LocationStatus("available","c1s1.2"));
        administrator.put("dostoyevski","suc ve ceza",new LocationStatus("available","c2s1.1") );
        administrator.put("dostoyevski","kumarbaz",new LocationStatus("availbale","c2s1.2"));
        administrator.put("dostoyevski","karamazov kardesler",new LocationStatus("available","c2.s1.3"));
        administrator.put("dostoyevski","karamazov kardesler",new LocationStatus("available","c2.s1.2"));
        System.out.println(administrator);
        System.out.println("******************************************************");




        System.out.println("user search dostoyevski , administrator search tolstoy");
        System.out.println(administrator);
        user1.authorSearch("dostoyevski");
        administrator.authorSearch("tolstoy");
        System.out.println("******************************************************");



        System.out.println("user search ölü canlar and anna karenina , administrator search ölü canlar and anna karenina");
        System.out.println(administrator);
        user1.searchBook("anna karenina");
        user1.searchBook("ölü canlar");
        administrator.searchBook("ölü canlar");
        administrator.searchBook("anna karenina");
        System.out.println(user1);
        System.out.println("******************************************************");


        System.out.println("user put oscar wilde(user do not put operation ");
        user1.put("Oscar Wilde","Dorian grayin potresi",new LocationStatus("available","c4s1.1"));
        System.out.println(user1);
        System.out.println("****************************************");


        System.out.println("user remove kumarbaz (user do not this operation");
        user1.remove("dostoyevski","kumarbaz","c2s1.2");
        System.out.println(user1);
        System.out.println("******************************************************");


        System.out.println("administrator change information of books.\nuser do not this operations");
        administrator.setBookName("tolstoy","insan ne ile yasar","savas ve baris");
        user1.setBookName("tolstoy","savas ve baris","insan ne ile yasar");
        System.out.println(administrator);
        System.out.println(user1);



        administrator.setLocation("tolstoy","savas ve baris",new LocationStatus("availbale","c1s1.2"),new LocationStatus("availbale","c1.s1.9"));
        System.out.println(administrator);
        user1.setLocation("tolstoy","savas ve baris",new LocationStatus("availbale","c1.s1.9"),new LocationStatus("available","c1s1.2"));
        System.out.println(administrator);
        administrator.setAuthorName("tolstoy","lev tolstoy");
        System.out.println(administrator);
        user1.setAuthorName("lev tolstoy","aldous huxley");
        System.out.println(administrator);
        System.out.println("******************************************************");

        /**
        administrator.remove("lev tolstoy","savas ve baris","c1.s1.9");
        System.out.println(administrator);
        user1.remove("lev tolstoy","anna karenina","c1s1.1");
        System.out.println(administrator);
        user1.put("gogol","ölü canlar","c3s1.1");
        System.out.println(user1);
        System.out.println(administrator);
        System.out.println(systems);
        administrator.put("gogol","ölü canlar","c3s1.1");
        administrator.put("gogol","ölü canlar","c3s1.8");
        System.out.println("******************************************************");
        */

        System.out.println("admin remove some books");

        administrator.remove("dostoyevski","karamazov kardesler","c2.s1.3");
        administrator.remove("dostoyevski","karamazov kardesler","c2.s1.2");
        administrator.remove("dostoyevski","suc ve ceza","c2s1.1" );
        administrator.remove("dostoyevski","kumarbaz","c2s1.2");
        System.out.println(administrator);

    }


}


