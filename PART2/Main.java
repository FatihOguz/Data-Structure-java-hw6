import java.util.LinkedList;
import java.util.Random;

public class Main {


    public static void main(String[] args){

        LinkedList<Comparable> A = new LinkedList<>();
        LinkedList<Comparable> B = new LinkedList<>();
        LinkedList<Comparable> C = new LinkedList<>();
        LinkedList<Comparable> D = new LinkedList<>();







        for(int i = 0 ; i<10 ;i ++){
            A.add(i);
        }
        for(int i = 9 ; i>=0 ;i --){
            B.add(i);
        }
        C.add(5);
        C.add(2);
        C.add(13);
        C.add(9);
        C.add(1);
        C.add(7);
        C.add(6);
        C.add(8);
        C.add(1);
        C.add(15);
        C.add(4);
        C.add(11);


        D.add('S');
        D.add('B');
        D.add('I');
        D.add('M');
        D.add('H');
        D.add('Q');
        D.add('C');
        D.add('L');
        D.add('R');
        D.add('E');
        D.add('P');
        D.add('K');

        System.out.println("**************************");

        ShellSort heapSort = new ShellSort();
        System.out.println(A);
        heapSort.sort(A);
        System.out.println("**************************");
        System.out.println(B);
        heapSort.sort(B);
        System.out.println("**************************");
        System.out.println(C);
        heapSort.sort(C);
        System.out.println("**************************");
        System.out.println(D);
        heapSort.sort(D);
        System.out.println("**************************");


/**

 MergeSort mergeSort = new MergeSort();
 mergeSort.sort(A);
 mergeSort.sort(B);
 mergeSort.sort(C);
 mergeSort.sort(D);

 System.out.println("MERGE sort");
 System.out.println(A);
 System.out.println(B);
 System.out.println(C);
 System.out.println(D);



        ShellSort shellSort = new ShellSort();
        shellSort.sort(D);
        System.out.println("*******************************");
        shellSort.sort(C);
        System.out.println("*******************************");
        shellSort.sort(B);
        System.out.println("*******************************");
        shellSort.sort(A);
        System.out.println("*******************************");

        System.out.println("shell sort");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);






         SelectionSort selectionSort = new SelectionSort();
         selectionSort.sort(A);
         selectionSort.sort(B);
         selectionSort.sort(C);
         selectionSort.sort(D);
         System.out.println("Selection sort");
         System.out.println(A);
         System.out.println(B);
         System.out.println(C);
         System.out.println(D);





        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        quickSort.sort(B);
        quickSort.sort(C);
        quickSort.sort(D);
        System.out.println("QUICK sort");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);











        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(A);
        insertionSort.sort(B);
        insertionSort.sort(C);
        insertionSort.sort(D);
        System.out.println("insertion sort");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);


        HeapSort heapSort = new HeapSort();

        heapSort.sort(A);
        heapSort.sort(B);
        heapSort.sort(C);
        heapSort.sort(D);
        System.out.println("heap sort");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);







        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(A);
        bubbleSort.sort(B);
        bubbleSort.sort(C);
        bubbleSort.sort(D);
        System.out.println("bubble sort");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);















*/

        LinkedList<Comparable> linkedListInteger = new LinkedList<Comparable>();

        Random r = new Random();


        for(int i = 0 ; i< 15 ; i ++){

            int a = r.nextInt(1000);
            linkedListInteger.add(a);
        }

        System.out.println(linkedListInteger);
        LinkedList<Comparable> linkedListCharacter = new LinkedList<Comparable>();


        Random rastgele=new Random();
        int rast;



        for(int i=0;i<8;i++)
        {
            rast=rastgele.nextInt(26)+96; //97den  122 ye kadar sayı üretiyor.
            if(rast==96) //96 değeri asci'de harfe denk gelmiyor.O yüzden başka bir harf atıyoruz yerine.
            {
                 rast+=3;
            }
            linkedListCharacter.add((char)rast);
        }
        System.out.println(linkedListCharacter);


    }




}
