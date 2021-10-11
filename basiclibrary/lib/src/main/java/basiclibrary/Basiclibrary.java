package basiclibrary;
public class Basiclibrary {
    public static void main(String[] args) {

        int[] arrayOfRolling=roll(2);
        for (int i:arrayOfRolling) {
            System.out.println(i);
        }

        int[] testArr={1,2,3,5};
        System.out.println(containsDuplicates(testArr));

        System.out.println(calculatingAverages(testArr));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        for (int i:
                arrayOfArrays(weeklyMonthTemperatures)) {
            System.out.println(i);
        }
    }

    static int[] roll(int n){
        int[] arrayOfRollingValue=new int[n];
        for (int i=0;i<n;i++){
            arrayOfRollingValue[i]= (int) (Math.random()*6+1);
        }
        return arrayOfRollingValue;
    }
    static boolean containsDuplicates(int[]arr) {
        for (int i=0;i<arr.length;i++){
            int item=arr[i];
            for (int j=0 ;j<arr.length;j++){
                if(i!=j) {
                    if (item==arr[j]){
                        return false;
                    }
                }
            }
        }
         return true;
    }

   static float calculatingAverages(int[]arr){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
         float avg= (float)sum/arr.length;
       return avg;
    }
    static int[] arrayOfArrays(int[][]arrOfArr){
        int[]returnedArray=new int[arrOfArr[0].length];
        float[]avgsArrays=new float[arrOfArr.length];
        for (int i = 0;i< arrOfArr.length;i++){
            avgsArrays[i]=calculatingAverages(arrOfArr[i]);
            System.out.println(avgsArrays[i]);
        }
    float min= avgsArrays[0];
        for (int i = 0; i < avgsArrays.length; i++) {
            //Compare elements of array with min
            if(avgsArrays[i] <min)
                min = avgsArrays[i];
        }
        for (int i = 0; i < avgsArrays.length; i++) {
            if(avgsArrays[i]==min){
                returnedArray= arrOfArr[i];
            }
        }
        return returnedArray;
    }
}