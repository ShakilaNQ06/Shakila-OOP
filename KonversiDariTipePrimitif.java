/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class KonversiDariTipePrimitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 19;
        
        Integer ageObject = age;
        
        int ageAgain = ageObject;
        
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        
        
    }
    
}
