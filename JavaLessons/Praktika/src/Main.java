public class Main {
    public static void main(String[] args) {

        //Array initialization and declaration//

//        int[] marks = new int[5];
//        marks [0] = 95;
//        marks [2] = 98;
//
//        System.out.println(marks[2]+marks[0]);


        //Print all the array elements//

//
//        double[] myList = {1.9,2.9,3.4,3.5};
//
//
//        for ( int i = 0; i< myList.length; i++){
//            System.out.print(myList[i] + " ");
//        }
//
//        System.out.println();

        //foreach//

//        for (double v: myList){
//
//            System.out.print(v + " ");
//
//        }

//        System.out.println(); //break;


        //Summing all elements//

//
//        double total = 0;
//
//        for (int i=0; i<myList.length; i++){
//            total = total +  myList[i];
//        }

        //foreach//

//        for(double v:myList){
//            total += v;
//        }
//        System.out.print(total);


        //Finding largest element//

//        System.out.println(); //break;

//        int[] arr = {3,2,4,6,5,1};
//
//        int max = arr[0];
//
//        for (int i = 0; i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

        //foreach//

//        for(int v:arr){
//            if (v>max){
//                max=v;
//            }
//        }
//        System.out.println(max);


        //varargs - main//
//
//        printMax(34, 3, 3, 52, 5);
//        printMax(new int[] {1, 2, 3});


        int a = 5;
        int b = 15;

       do {
          ++ a;
           System.out.println(a);
       }while  (a<b) ;




    } // don't delete - end of main method//

    //varargs - methods//
//    public static void printMax(int... numbers) {
//
//        if (numbers.length == 0) {
//            System.out.println("No argument passed");
//            return;
//        }
//
//        int max = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++)
//
//            if (numbers[i] > max)
//                max = numbers[i];
//        System.out.println("The max value is " + max);
//    }

} // don't delete - end of Main class//