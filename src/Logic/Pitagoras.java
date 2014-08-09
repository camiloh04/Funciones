/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;
import java.lang.Math.*;

/**
 *
 * @author 12
 */
public class Pitagoras {
    double hipotenusa,resultadotemp;
    public double pitagoras(double catetoA, double catetoB){
        resultadotemp= Math.pow(catetoA, 2)+ Math.pow(catetoB, 2) ;
        hipotenusa=Math.sqrt(resultadotemp);
        return hipotenusa;
    
    }
}
