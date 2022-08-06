/*
 UTSAV GUNDARANIYA 21CE037
Develop a Program that illustrate method overloading concept.*/
class Ass2_pr5_1
{ 
    void average(int a, int b) {
        float avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
    void average(float a, float b) {
        float avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
    void average(Double a, Double b) {
        double avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
}

