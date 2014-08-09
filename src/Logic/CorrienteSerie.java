/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author 12
 */
public class CorrienteSerie {
    double corriente;
    public double corrienteenserie(double r1, double r2, double r3, double voltaje){
        double rtotal=r1+r2+r3;
        corriente=voltaje/rtotal;
        return corriente;
    }
}
