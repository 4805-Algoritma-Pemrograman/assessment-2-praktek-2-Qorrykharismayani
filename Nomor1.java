import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int N = input.nextInt();
        
        /* Pekerjaan anda mulai dari sini */
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
         /* Pekerjaan anda berakhir sini */
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
