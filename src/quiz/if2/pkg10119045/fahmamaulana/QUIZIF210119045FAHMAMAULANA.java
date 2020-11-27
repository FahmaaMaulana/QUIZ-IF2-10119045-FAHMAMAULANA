/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119045.fahmamaulana;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : IF2
 * NIM      : 10119045
 * Deskripsi: QUIZ
 */
public class QUIZIF210119045FAHMAMAULANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer c = new Customer();
        String nama,email;
      //  System.out.println("====Program Kasir Rock n Roll Haircut====");
      //  System.out.print("Customer Name : ");
      //  nama = s.next();
      //  c.setName(nama);
      //  System.out.print("Customer Email : ");
      //  email = s.next();
      //  c.setEmail(email);
        sp.displayService();
    
    }
    
    
}
