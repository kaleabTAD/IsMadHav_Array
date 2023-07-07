public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int []a={2, 1, 1, 4, -1, -1};
        System.out.println(madHavArray(a));
    }

    public static int madHavArray(int[]a) {
        int isMadhav=0;
int startIndex=0;
int endIndex=0;
int n=1;
int currentSum=0;
int sum=0;
int CalculatedlengthOfArray=1;
int currentlengthofArray=1;
while (currentlengthofArray<=a.length){
    if (CalculatedlengthOfArray==currentlengthofArray){
        for (int i=startIndex;i<=endIndex;i++){
            currentSum+=a[i];
        }
    }
    else {
        isMadhav=0;
        break;
    }
    if (currentSum==sum||startIndex==endIndex){
        sum=currentSum;
        currentSum=0;
        isMadhav=1;
    }
    else {
        isMadhav=0;
        break;
    }
    if (currentlengthofArray==a.length){
        break;
    }
    else {
        startIndex=endIndex+1;
        endIndex=startIndex+n;
        if (startIndex<a.length&&endIndex<a.length){
            n++;
        }
        else {
            endIndex=a.length-1;
            n=endIndex-startIndex;
        }
        CalculatedlengthOfArray= n * (n + 1)/2;
        currentlengthofArray=endIndex+1;
    }
}
return isMadhav;
    }
}