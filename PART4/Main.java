import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * tested HashTableChain methods
 * romove(key)
 * remove(key,value)
 * put(key,value)
 * size()
 * tested isEmpty and get methods in above methods
 * calculated HashTableOpen,HashTableOpenBook,HashTableChain,HashTableChainBook run times
 */
public class Main {

    public static void main(String[] args) {


        /**
         * put size
         */
        int size = 101;
        int keyBound=101000;

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh = new FileHandler("logFile");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            Instant start = Instant.now();
            HashTableOpen<Integer,Integer> hashTableOpen = new HashTableOpen<>();


            Random r=new Random();



            for(int i=0;i<size;i++){
                int key=r.nextInt(keyBound);
                int value=r.nextInt(size);
                hashTableOpen.put(key,value);

            }


            System.out.println(hashTableOpen);
            System.out.println(hashTableOpen.remove(5));
            System.out.println(hashTableOpen);
            hashTableOpen.put(5,1000);
            System.out.println(hashTableOpen);




            System.out.println("*************************************************************************************************");



            Instant finish = Instant.now();
            Instant start1 = Instant.now();

            HashTableChain<Integer,Integer> hashTableChain = new HashTableChain<>();

            for(int i=0;i<size;i++){
                int key=r.nextInt(keyBound);
                int value=r.nextInt(1000);
                hashTableChain.put(key,value);

            }
            System.out.println(hashTableChain);
            hashTableChain.remove(1);
            System.out.println(hashTableChain);
            hashTableChain.put(1,1000);
            System.out.println(hashTableChain);


            System.out.println("*************************************************************************************************");




            Instant finish1 = Instant.now();
            Instant start2 = Instant.now();

            HashTableOpenBook<Integer,Integer> hashTableOpenBook = new HashTableOpenBook<>();
            for(int i=0;i<size;i++){
                int key=r.nextInt(keyBound);
                int value=r.nextInt(size);
                hashTableOpenBook.put(key,value);

            }

            System.out.println(hashTableOpenBook);
            hashTableOpenBook.remove(1);
            System.out.println(hashTableOpenBook);
            hashTableOpenBook.put(1,1000);
            System.out.println(hashTableOpenBook);



            System.out.println("*************************************************************************************************");


            Instant finish2 = Instant.now();
            Instant start3 = Instant.now();




            HashTableChainBook<Integer,Integer> hashTableChainBook = new HashTableChainBook<>();
            for(int i=0;i<size;i++){
                int key=r.nextInt(keyBound);
                int value=r.nextInt(size);
                hashTableChainBook.put(key,value);

            }

            System.out.println(hashTableChainBook);
            hashTableChainBook.remove(1);
            System.out.println(hashTableChainBook);
            hashTableChainBook.put(1,1000);
            System.out.println(hashTableChainBook);



/***********************************************************************************************************************************/


            Instant finish3 = Instant.now();
            long timeElapsed = Duration.between(start, finish).toMillis();
            long timeElapsed1 = Duration.between(start1, finish1).toMillis();
            long timeElapsed2 = Duration.between(start2, finish2).toMillis();
            long timeElapsed3 = Duration.between(start3, finish3).toMillis();



            System.out.println("HashTableOpen " + timeElapsed);
            System.out.println("HashTableChain " + timeElapsed1);
            System.out.println("HashTableOpenBook "  + timeElapsed2);
            System.out.println("HashTableChainBook " + timeElapsed3);

        }catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
