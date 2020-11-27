/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119045.fahmamaulana;

/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : IF2
 * NIM      : 10119045
 * Deskripsi: QUIZ
 */
public class Customer extends ServicePrice implements CustomerInvoice {
     private String name,email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
     @Override
    public String currentTime() {
    return ("EEEE, dd MMM yyyy HH:mm:ss");
    }
    
 
}