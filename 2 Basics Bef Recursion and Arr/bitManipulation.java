public class bitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    } 
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // int n = clearIthBit(n, i);
        // int BitMask = newBit << i;
        // return (int)n|BitMask;
    }

    public static int clearIthBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[]){
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);

        // System.out.println(getIthBit(10, 3));
        //System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2,1));
        System.out.println(clearIthBits(15, 2));
    }    
}
