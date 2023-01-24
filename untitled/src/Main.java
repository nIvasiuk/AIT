public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");






    }


    public double averegeGrade(){
        double sum = 0;
        double res = 0;

        if (rate != null && rate.length != 0) {
            for (int i = 0; i < rate.length; i++){
                sum += rate[i];
            }
            res =  sum/rate.length;

        }
        return res;
    }
}