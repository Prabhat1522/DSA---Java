class Array1 {
    public static int digitalRoot(int num){
        while(num > 9){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    public static int findElement(int[] arr){
        int max = -1;
        for(int num : arr){
            int val = digitalRoot(num);

            if(val > max){
                max = val;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {123,456,789,101};
        System.out.println(findElement(arr));
    }
}