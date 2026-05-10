public class Pattern_Part2 {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i=1;i<=totRows;i++){
            //inner-columns
            for(int j=1;j<=totCols;j++){
                //cell - (i,j)
                if(i==1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void inverted_rotated_half_pyramid_Numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void floyd_triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println(" ");
        }
    }
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
    public static void butterfly_Pattern(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i == 1 || i == n || j ==1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            //space =(n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star =(2*i-1)
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n;i>=1;i--){
            //space= (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star = 2*i-1
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void palindromePyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void frustum_Pattern(int n){
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            //space= (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star = 2*i-1
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        //hollow_rectangle(10,7);
        //inverted_rotated_half_pyramid(4);
        //inverted_rotated_half_pyramid_Numbers(5);
        //floyd_triangle(5);
        //zero_one_triangle(6);

        //butterfly_Pattern(5);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        //diamond(10);
        //palindromePyramid(6);
        frustum_Pattern(6);

    }
    
}
