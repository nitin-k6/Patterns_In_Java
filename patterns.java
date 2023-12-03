class patterns{
    public static void main(String[] args){
     pattern_1(4);
     pattern_2(5);
     pattern_3(5);
     pattern_4(5);
     pattern_5(5);
     pattern_6(5);
    pattern_7(5);
    pattern_8(4);
    }

    static void pattern_1(int n){
     for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
      

    static void pattern_2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern_3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern_5(int n){
        for(int row=1; row<=2*n-1; row++ ){
            int c = row > n? 2*n -row : row;
            for(int col=1; col <=c; col++){
                System.out.print("*");
            }
                System.out.println();
        }
    }

    static void pattern_6(int n){
        for(int row=1; row<=2*n-1; row++ ){
            int c = row > n? 2*n -row : row; // c is no of columns in the row

        int noOfSpaces = n - c;
         for(int s=0; s<noOfSpaces; s++){
            System.out.print("  ");
         }

            for(int col=1; col <=c; col++){
                System.out.print(" * ");
            }
                System.out.println();
        }
    }

     static void pattern_7(int n){
         for(int row=1; row<=n; row++){
             for(int space=0; space<n-row; space++){
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--){
               System.out.print(col);
            }
           
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
                     System.out.println();

         }
    }

     static void pattern_8(int n){
        int originalN =n;
        n=2*n;
         for(int row=1; row<=n-1; row++){
            for(int col=1; col<=n-1; col++){
                int atEveryIndex =(originalN +1)- Math.min(Math.min(row,col), Math.min(n-row, n-col));
               System.out.print(atEveryIndex + " ");
            }
                     System.out.println();

         }
    }


}
