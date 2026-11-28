import java.util.Arrays;

public class TrainProblem {
    
    public static void main(String[] args)
    {
        int[] arrivalTime = {1030, 1050, 1035, 1050, 1037};
        int[] depertureTime = {1045, 1055, 1040, 1110, 1058};

        int minPlatformCount = getMinPlatformCount(arrivalTime, depertureTime);

        System.out.println("Minimum Platform Required is: " + minPlatformCount);
    }

    public static int getMinPlatformCount(int[] arrivalTime, int[] depertureTime)
    {
        int currentCount = 0;
        int maxSoFar = 0;

        Arrays.sort(arrivalTime);
        Arrays.sort(depertureTime);

        int arrivalIndex = 0;
        int depertureIndex = 0;

        while(arrivalIndex < arrivalTime.length)
        {
            if(arrivalTime[arrivalIndex] <= depertureTime[depertureIndex])
            {
                currentCount++;
                maxSoFar = Math.max(currentCount, maxSoFar);
                System.out.println("One train Arrived: " + arrivalTime[arrivalIndex] + " PlatformCount = " + currentCount);
                arrivalIndex++;
            }
            else
            {
                currentCount--;
                System.out.println("One train Deperture: " + depertureTime[depertureIndex] + " PlatformCount = " + currentCount);
                depertureIndex++;
            }
        }
        return maxSoFar;
    }


}
