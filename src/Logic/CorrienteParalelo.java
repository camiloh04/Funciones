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
public class CorrienteParalelo {
    double corriente;
    public double corrienteenparalelo(double r1, double r2, double r3, double voltaje){
        double rtotal=(1/((1/r1)+(1/r2)+(1/r3)));
        corriente=voltaje/rtotal;
        return corriente;
    }
}
