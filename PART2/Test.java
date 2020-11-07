import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 * this class generates random character arrays or random integer arrays and runs them in the desired number in sort
 * algorithms and finds run time
 * It creates sequential order for linkedlist data and put it into algorithms and finds run time
 */
public class Test  {


    /**
     * generates random character arrays or random integer arrays and runs them in the desired number in sort
     *  * algorithms and finds run time
     * @param arrInteger is random integer array
     * @param arrCharacter is random character array
     * @param size array size
     * @param bound for random number
     * @throws IOException
     */
    private static void Sorts(Integer[] arrInteger,Character[] arrCharacter,int size,int bound) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try{


            fh = new FileHandler("logFile");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);



            MergeSort mergeSort = new MergeSort();
            QuickSort quickSort = new QuickSort();



            BubbleSortArray bubbleSortArray = new BubbleSortArray();
            HeapSortArray heapSortArray = new HeapSortArray();
            InsertionSortArray insertionSortArray = new InsertionSortArray();
            MergeSortArray mergeSortArray   = new MergeSortArray();
            QuickSortArray quickSortArray = new QuickSortArray();
            SelectionSortArray selectionSortArray = new SelectionSortArray();
            ShellSortArray shellSortArray = new ShellSortArray();



            /**

             Instant start15 = Instant.now();

             randomCharacterArray(arrCharacter,size);
             printCharacterArray(arrCharacter);
             BubbleSortArray.sort(arrCharacter);
             printCharacterArray(arrCharacter);
             Instant finish15 = Instant.now();
             long timeElapsed15 = Duration.between(start15, finish15).toMillis();

             System.out.println();

             */

/**

 Instant start17 = Instant.now();

 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 HeapSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish17 = Instant.now();
 long timeElapsed17 = Duration.between(start17, finish17).toMillis();

 System.out.println();
 */



/**


 Instant start19 = Instant.now();

 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 InsertionSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish19 = Instant.now();
 long timeElapsed19 = Duration.between(start19, finish19).toMillis();

 System.out.println();

 */



/**

 Instant start21 = Instant.now();

 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 MergeSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish21 = Instant.now();
 long timeElapsed21 = Duration.between(start21, finish21).toMillis();

 System.out.println();

 */



/**


 Instant start23 = Instant.now();

 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 QuickSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish23 = Instant.now();
 long timeElapsed23 = Duration.between(start23, finish23).toMillis();

 System.out.println();

 */



/**


 Instant start25 = Instant.now();

 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 SelectionSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish25 = Instant.now();
 long timeElapsed25 = Duration.between(start25, finish25).toMillis();

 System.out.println();

 */


/**


 Instant start27 = Instant.now();
 randomCharacterArray(arrCharacter,size);
 printCharacterArray(arrCharacter);
 ShellSortArray.sort(arrCharacter);
 printCharacterArray(arrCharacter);
 Instant finish27 = Instant.now();
 long timeElapsed27 = Duration.between(start27, finish27).toMillis();

 System.out.println();

 */




            System.out.println("ARRAY");
            System.out.println("BUBBLE SORT");
            Instant start14 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
            // printIntegerArray(arrInteger);
            BubbleSortArray.sort(arrInteger);
            // printIntegerArray(arrInteger);
            Instant finish14 = Instant.now();
            long timeElapsed14 = Duration.between(start14, finish14).toMillis();



            System.out.println("HEAP SORT");
            Instant start16 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
           // printIntegerArray(arrInteger);
            HeapSortArray.sort(arrInteger);
           // printIntegerArray(arrInteger);
            Instant finish16 = Instant.now();
            long timeElapsed16 = Duration.between(start16, finish16).toMillis();






            System.out.println("INSERTION SORT");
            Instant start18 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
         //  printIntegerArray(arrInteger);
            InsertionSortArray.sort(arrInteger);
          // printIntegerArray(arrInteger);
            Instant finish18 = Instant.now();
            long timeElapsed18 = Duration.between(start18, finish18).toMillis();



            System.out.println("MERGE SORT");
            Instant start20 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
          // printIntegerArray(arrInteger);
            MergeSortArray.sort(arrInteger);
          // printIntegerArray(arrInteger);
            Instant finish20 = Instant.now();
            long timeElapsed20 = Duration.between(start20, finish20).toMillis();


            System.out.println("QUICK SORT");
            Instant start22 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
           // printIntegerArray(arrInteger);
            QuickSortArray.sort(arrInteger);
           //printIntegerArray(arrInteger);
            Instant finish22 = Instant.now();
            long timeElapsed22 = Duration.between(start22, finish22).toMillis();



            System.out.println("SELECTION SORT");
            Instant start24 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
          // printIntegerArray(arrInteger);
            SelectionSortArray.sort(arrInteger);
           // printIntegerArray(arrInteger);
            Instant finish24 = Instant.now();
            long timeElapsed24 = Duration.between(start24, finish24).toMillis();



            System.out.println("SHELL SORT");
            Instant start26 = Instant.now();

            randomIntegerArray(arrInteger,size,bound);
         //  printIntegerArray(arrInteger);
            ShellSortArray.sort(arrInteger);
          //  printIntegerArray(arrInteger);
            Instant finish26 = Instant.now();
            long timeElapsed26 = Duration.between(start26, finish26).toMillis();



           //System.out.println( timeElapsed13  +" milis");
            System.out.println( "Array Bubble Sort = " + timeElapsed14  +" milis");
         // System.out.println( timeElapsed15  +" milis");
            System.out.println( "Array Heap Sort = " +timeElapsed16  +" milis");
        //  System.out.println( timeElapsed17  +" milis");
           System.out.println( "Array Insertion Sort = " +timeElapsed18  +" milis");
        //  System.out.println( timeElapsed19  +" milis");
           System.out.println( "Array Merge Sort = " +timeElapsed20  +" milis");
            //System.out.println( timeElapsed21  +" milis");
          System.out.println( "Array Quick Sort = " +timeElapsed22  +" milis");
        //  System.out.println( timeElapsed23  +" milis");
          System.out.println( "Array Selection Sort = " +timeElapsed24  +" milis");
          //System.out.println( timeElapsed25  +" milis");
         System.out.println( "Array Shell Sort = " +timeElapsed26  +" milis");
          //System.out.println( timeElapsed27  +" milis");
        }
        catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

    /**
     * remove all items linked list
     * @param linkedList
     */
    private static void removeItems(LinkedList linkedList){
        while (true){
            if(linkedList.isEmpty()){
                return;
            }
            else {
                linkedList.remove();
            }
        }

    }

    /**
     * generate random integer linkedlist
     * @param linkedListInteger is list
     * @param size list size
     * @param bound for random number
     */
    private static void randomIntegerList(LinkedList<Comparable> linkedListInteger, int size, int bound){

        Random r = new Random();


        for(int i = 0 ; i< size ; i ++){

            int a = r.nextInt(bound);
            linkedListInteger.add(a);
        }
    }
    /**
     * generate random integer array
     * @param arr is array
     * @param size list size
     * @param bound for random number
     */
    private static void randomIntegerArray(Integer[] arr,int size,int bound){
        Random r = new Random();


        for(int i = 0 ; i< size ; i ++){

            int a = r.nextInt(bound);
            arr[i] = a;
        }
    }

    /**
     * generate random character linkedlist
     * @param linkedListCharacter is list
     * @param size list size

     */
    private static void  randomCharacterList(LinkedList<Comparable> linkedListCharacter, int size){
        Random rastgele=new Random();
        int rast;
        for(int i=0;i<size;i++)
        {
            rast=rastgele.nextInt(26)+96; //97den  122 ye kadar sayı üretiyor.
            if(rast==96) //96 değeri asci'de harfe denk gelmiyor.O yüzden başka bir harf atıyoruz yerine.
            {
                rast+=3;
            }
            linkedListCharacter.add((char)rast);
        }
    }



    /**
     * generate random character array
     * @param arr is array
     * @param size list size
     */
    private static void randomCharacterArray(Character[] arr,int size){
        Random rastgele=new Random();
        int rast;
        for(int i=0;i<size;i++) {
            rast = rastgele.nextInt(26) + 96; //97den  122 ye kadar sayı üretiyor.
            if (rast == 96) //96 değeri asci'de harfe denk gelmiyor.O yüzden başka bir harf atıyoruz yerine.
            {
                rast += 3;
            }
            arr[i] = (char)rast;
        }

    }

    /**
     * print list writes 10 values in each row
     * @param linkedList
     */
    private static void printList(LinkedList linkedList){
        if(linkedList.size() % 10 != 0){
            System.out.println(linkedList);
            return;
        }
        for(int i=0;i<linkedList.size();i=i+10){
            for(int j = i; j<i+10;j++){
                System.out.print(linkedList.get(j) +", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    /**
     * print list writes 10 values in each row
     * @param arr is array
     */
    private static void printIntegerArray(Integer[] arr){
        if(arr.length % 10 != 0){
            for(int i = 0 ; i< arr.length;i++)
                System.out.print(arr[i] + ", ");
            return;
        }
        for(int i=0;i<arr.length;i=i+10){
            for(int j = i; j<i+10;j++){
                System.out.print(arr[j] +", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    /**
     * print list writes 10 values in each row
     * @param arr
     */
    private static void printCharacterArray(Character[] arr){
        if(arr.length % 10 != 0){
           for(int i = 0 ; i< arr.length;i++)
               System.out.print(arr[i] + ", ");
            return;
        }
        for(int i=0;i<arr.length;i=i+10){
            for(int j = i; j<i+10;j++){
                System.out.print(arr[j] +", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    /**
     * test for calculate run times
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        LinkedList<Comparable> linkedListCharacter = new LinkedList<>();
        LinkedList<Comparable> linkedListInteger = new LinkedList<>();


        int size = 10000;
        int bound = 100;
        Integer[] arrInteger = new Integer[10000];
        Character[] arrCharacter = new Character[10000];
        Integer[] arrInteger1 = new Integer[40000];
        Character[] arrCharacter1 = new Character[40000];
        Integer[] arrInteger2 = new Integer[100000];
        Character[] arrCharacter2 = new Character[100000];
        Integer[] arrInteger3 = new Integer[150000];
        Character[] arrCharacter3 = new Character[150000];
        Integer[] arrInteger4 = new Integer[180000];
        Character[] arrCharacter4 = new Character[180000];





        for(int i = 0 ; i<10000;i++){
            linkedListInteger.add(i);
        }
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh = new FileHandler("logFile");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            System.out.println("QUICK SORT");
            Instant start8 = Instant.now();
            //printList(linkedListInteger);
           QuickSort.sort(linkedListInteger);
            //printList(linkedListInteger);
            Instant finish8 = Instant.now();
            long timeElapsed8 = Duration.between(start8, finish8).toMillis();
            System.out.println("Linked List Quick Sort = " + timeElapsed8  +" milis");

        }catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        for(int i = 0 ; i<10000;i++){
            linkedListCharacter.add(i);
        }
        try{
            fh = new FileHandler("logFile");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            System.out.println("Merge SORT");
            Instant start8 = Instant.now();
            //printList(linkedListInteger);
            MergeSort.sort(linkedListCharacter);
            //printList(linkedListInteger);
            Instant finish8 = Instant.now();
            long timeElapsed8 = Duration.between(start8, finish8).toMillis();
            System.out.println("Linked List Quick Sort = " + timeElapsed8  +" milis");

        }catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



       for(int i = 0 ; i <1  ; i++){
           System.out.println(i+ "-) **********************************************************************");
           size = 10000;
           Sorts(arrInteger,arrCharacter,size,bound);
           size=40000;
           Sorts(arrInteger1,arrCharacter1,size,bound);
           size=100000;
           Sorts(arrInteger2,arrCharacter2,size,bound);
           size=150000;
           Sorts(arrInteger3,arrCharacter3,size,bound);
           size=180000;
           Sorts(arrInteger4,arrCharacter4,size,bound);

       }

    }


}
