/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.polimorfisme;

/**
 *
 * @author udaxd
 */
public class Singer extends Musician {
    public Singer(){}
    
    @Override
    public void perform(){
        System.out.println("Beraksi di atas panggung,bernyanyi dengan merdu");
    }
}
