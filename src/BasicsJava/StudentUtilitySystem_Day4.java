package BasicsJava;

public class StudentUtilitySystem_Day4 {
    public static void main(String[] args) {

        greetStudent("Athulya");

        int total = calculateTotal(88,85,94);
        System.out.println("Total marks scored: "+total);
        System.out.println();

        double avg = calculateAverage(total);
        System.out.println("Your average: "+avg);
        System.out.println();

        checkPassFail(avg);

    }

    public static void greetStudent(String name){
        System.out.println("Welcome "+name);
    }

    public static int calculateTotal(int m1, int m2, int m3){
        return m1+m2+m3;
    }

    public static double calculateAverage(int total){
        return  (double) total/3;
    }

    public static void checkPassFail(double avg){
        if (avg>=40){
            System.out.println("Congratulations, you passed");
        }
        else {
            System.out.println("Sorry, you failed");
        }
    }


}
