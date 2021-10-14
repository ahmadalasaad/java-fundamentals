package basiclibrary;

import java.util.ArrayList;
import java.util.*;

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


        System.out.println(uniqueTemp(weeklyMonthTemperatures));


        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
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

    static ArrayList uniqueTemp(int[][] temperatures){
        int min=temperatures[0][0];
        int max=0;
        HashSet<Integer> tembHashSet = new HashSet<Integer>();
        ArrayList<String> uniqueTempArray = new ArrayList<>();

        for (int[] item:temperatures) {

            for (int i:item) {
                tembHashSet.add(i);
                if(i <min)
                    min = i;
                if (i>max)
                    max=i;
            }
        }
        uniqueTempArray.add("High: "+max);
        uniqueTempArray.add("Low: "+min);

        for (int i=min;i<max;i++){
            boolean condition=tembHashSet.contains(i);
                if(!condition){
                    uniqueTempArray.add("Never saw temperature: "+i);
                }


        }
        return uniqueTempArray;
    }
    static String tally (ArrayList<String> votes){
        HashMap<String,Integer> votesValue = new HashMap<String,Integer>();
        for(String vote : votes){
            votesValue.put(vote, 0);
        }
        String previosVote=" ";
        for (String vote:votes) {

            votesValue.replace(vote,votesValue.get(vote),votesValue.get(vote)+1);
//                System.out.println(votesValue.get(vote));

        }
        int max=0;
        for (String i:votesValue.keySet()) {
            if(votesValue.get(i)>max){
                max=votesValue.get(i);
            }
        }
        String winner=" ";
        for (String i: votesValue.keySet()) {
            if(votesValue.get(i)==max){
                winner=i;
            }
        }
        return winner;
    }
}