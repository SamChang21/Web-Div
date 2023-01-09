public class test{
public static void main(String[] args) {
    mystery(1234);
}

public static void mystery(int x){
    System.out.print(x%10);
    if((x/10)!=0){
        mystery(x/10);
    }
    System.out.print(x%10);
}
/*4.1 */
public static double average(int[] arr){
    double sum =0;
    for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        double avg = sum/arr.length ;
    return avg;

}
/*4.2 */
public static int countAboveAve(int[] arr){
    double sum =0;
    int count = 0;
    for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        double avg = sum/arr.length ;
    
    for(int i=0; i<arr.length; i++){
        if(arr[i]>avg){
            count++;
        }
    }
    return count;
}
/*4.3 */
public static int largest(int[] arr){
    int biggest=arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>biggest){
            biggest= arr[i];
        }
    }
    return biggest;
}

/*4.4 */
public static int indexOfsmallest(int[] arr){
    int smallest=arr[0];
    int index=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<smallest){
            smallest= arr[i];
            index=i;
        }
    }
    return index;
}
}