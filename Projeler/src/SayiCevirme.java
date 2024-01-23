import  java.util.Scanner;
public class SayiCevirme {

        public static void main(String [] args){
            //Taking input from user

            Scanner input = new Scanner(System.in);

            System.out.print("Pozitif bir tamsayı girin:");

            int x=input.nextInt();

            //Taking  a string to integer and goes to method

            System.out.println(""+toBinary(x));

        }
        public static String toBinary(int n){

            //This program calculates just positive integers
            if(n<=-1){
                System.out.println("Lütfen pozitif tamsayı yazınız");
                return null;
            }
            //Necessary calculation to convert decimal to binary
            String binary ="";
            while(n>0){
                int remaining = n%2;
                binary=remaining+binary;
                n/=2;

            }
            binary = n+binary;

            return binary;

        }
    }
