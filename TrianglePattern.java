public class TrianglePattern{
    public static void main(String[] args){
        int rows =10; //declare the number f rows to cout 
        for (int i=0; i <= rows; i++){      //increament of i 
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i =rows -1; i >= 1; i--) {   //decreament of i 
            for (int j =1; j <= 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}