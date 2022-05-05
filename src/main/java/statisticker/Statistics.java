package statisticker;

import java.util.List;

public class Statistics 
{
    static class Stats {
        float average;
        float max;
        float min;

        public Stats(float average, float max, float min) {
            this.average = average;
            this.max = max;
            this.min = min;
        }

    }

    public static float computeAverage(List<Float> numbers) {

        float summation = (float) numbers.parallelStream().mapToDouble(x->x).sum();
        int numSize = numbers.size();
        return (summation)/numSize;
    }

    public static float computeMinimumNumber(List<Float> numbers) {
        float minNum = numbers.parallelStream()
                .min((x,y)-> x.compareTo(y)).get();
        return minNum;
    }

    public static float computeMaximumNumber(List<Float> numbers) {
        float maxNum = numbers.parallelStream()
                .max((x,y)->x.compareTo(y)).get();
        return maxNum;
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        float averageNum = 0;
        float minNum = 0;
        float maxNum = 0;
        if(numbers.size() > 0 ) {
             averageNum = computeAverage(numbers);
             minNum = computeMinimumNumber(numbers);
             maxNum = computeMaximumNumber(numbers);
        }
         Stats stats = new Stats(averageNum,maxNum,minNum);
         return stats;
    }
}
