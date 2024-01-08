public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int theMiss = -1;
        int i;
        for(i = 0; i < n; i++) {
            int j;
            for(j = 0; j < n; j++) {
                if(i == array[j]) {
                    break;
                } 
            }
            if(j == n) {
                theMiss = i;
                break;
            }
        }
        if(i == n) {
            theMiss = i;
        }
        return theMiss;
    }

    public static int secondMaxValue(int [] array) {
        int n = array.length;
        int maxValue = Math.max(array[0], array[1]);
        int secondMaxValue = Math.min(array[0], array[1]);
        for(int i = 2; i < n; i++) {
            if(array[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = array[i];
            } else if (array[i] > secondMaxValue) {
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        boolean itSame = true;
        for(int i = 0; i < n1; i++) {
            int j;
            for(j = 0; j < n2; j++) {
                if(array1[i] == array2[j]) {
                    break;
                }
            }
            if(j == n2) {
                itSame = false;
            }
        }
        return itSame;
    }

    public static boolean isSorted(int [] array) {
        int n = array.length;
        boolean increasingly = false;
        boolean decreasingly = false;
        //checks if the array is sorted increasingly, from the minimum value to the maximum value
        int i;
        for(i = 1; i < n; i++) {
           if(array[i-1] > array[i]) {
            break;
           } 
        }
        if(i == n) {
            increasingly = true;
        }
        //checks if the array is sorted decreasingly, from the maximum value to the minimum value
        int j = 0;
        for(j = 1; j < n; j++) {
            if(array[j-1] < array[j]) {
                break;
            }
        }
        if(j == n) {
            decreasingly = true;
        }
        return increasingly || decreasingly;  
    }

}
