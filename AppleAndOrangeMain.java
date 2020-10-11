class AppleAndOrange{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount=0,orangeCount=0;

        for(int i=0; i<apples.length;i++){
            if(a+apples[i]>=s && a+apples[i]<=t){
                appleCount++;
            }
        }
        for(int o=0;o<oranges.length;o++){
            if(b+oranges[o]>=s && b+oranges[o]<=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}

class AppleAndOrangeMain{
    public static void main(String[] args){
    	    int[] apples = {2,3,-4};
	    int[] oranges = {3,-2,-4};
           AppleAndOrange.countApplesAndOranges(7,10,4,12,apples,oranges);
    }
}