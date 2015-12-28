/**
 * Created by Arlekino on 12/28/2015.
 */

package ua.arlekino.Flower63;

class NegativeQuantytiException extends Exception{
    private int quantytiValue;
    public NegativeQuantytiException(final int quantytiValue){

        this.quantytiValue = quantytiValue;
    }
    public int getQuantytiValue(){
        return quantytiValue;
    }
}
