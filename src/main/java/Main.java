package src.main.java;

public class Main {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract (int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        int add1 = add(4, 10);
        int add2 = add(3, 2);
        int add3 = add(6, 7);


        int subtract1 = subtract(10, 3);
        int subtract2 = subtract(3, 13);
        int subtract3 = subtract(2, 6);


        int[] additionResults = {add1, add2, add3};
        int[] subtractionResults = {subtract1, subtract2, subtract3};



        for (int i = 0; i < additionResults.length; i++) {
            System.out.println(" additionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის  " + additionResults[i]);
        }



        for (int i = 0; i < subtractionResults.length; i++) {
            System.out.println(" subtractionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის " + subtractionResults[i]);

        }

        for (int i = 0; i < additionResults.length; i++) {
            if (additionResults[i] % 2 == 0){
                System.out.println(" additionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის ლუწი  " + additionResults[i]);
            }
            else if (additionResults[i] % 2 == 1) {
                System.out.println(" additionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის კენტი " + additionResults[i]);
            }
            else {
                System.out.println("Error");
            }
        }

        for (int i = 0; i < subtractionResults.length; i++) {
            if (subtractionResults[i] % 2 == 0){
                System.out.println(" subtractionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის ლუწი  " + subtractionResults[i]);
            }
            else if (subtractionResults[i] % 2 == 1) {
                System.out.println(" subtractionResults - ის " + i + " ინდექსზე მყოფი შედეგი არის კენტი " + subtractionResults[i]);
            }
            else {
                System.out.println("Error");
            }
        }


        int i = 0;
        while (i < additionResults.length ) {
            System.out.print(" additionResults[" + i + "] - " + additionResults[i] + "  ");
            i++;
        }
        //ეს უბრალოდ სილამაზისთვის
        System.out.println();

        int j = 0;
        while (j  < subtractionResults.length ) {
            System.out.print(" subtractionResults[" +j+ "] - " + subtractionResults[j] + "  ");
            j++;
        }


        //ეს უბრალოდ სილამაზისთვის
        System.out.println();




        //წინა while loop-ის შემდეგ ვარესეტებ მნიშვნელობას
        i = 0;
        while (i < additionResults.length) {
            if (additionResults[i] % 2 == 0){
                System.out.print(" additionResults[" + i + "] - " + additionResults[i] + " (ლუწი)  ");
                i++;
            }
            else if (additionResults[i] % 2 == 1) {
                System.out.print(" additionResults[" + i + "] - " + additionResults[i] + " (კენტი)  ");
                i++;
            }
            else {
                System.out.println("Error");
            }
    }

        //ეს უბრალოდ სილამაზისთვის
        System.out.println();


        //წინა while loop-ის შემდეგ ვარესეტებ მნიშვნელობას
        j = 0;
        while (j < subtractionResults.length) {
            if (subtractionResults[j] % 2 == 0){
                System.out.print(" subtractionResults[" + j + "] - " + subtractionResults[j] + " (ლუწი)  ");
                j++;
            }
            else if (subtractionResults[j] % 2 == 1) {
                System.out.print(" subtractionResults[" + j + "] - " + subtractionResults[j] + " (კენტი)  ");
                j++;
            }
            else {
                System.out.println("Error");
            }
        }
}
}
