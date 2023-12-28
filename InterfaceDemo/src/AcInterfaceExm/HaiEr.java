package AcInterfaceExm;

import Model.BlowingUnit;
import Model.CondeNser;

public abstract class HaiEr implements AC {
    abstract void FanType(String fan);

    String Condenser;
    String Blowingunit;

    public  final void getHAIER(){
        FanType("");
        getcondenser();
        getblowingunit();
        System.out.println("Feel the high with HAIER");
    }
    public CondeNser getcondenser(){
        return getcondenser();
    }

    public BlowingUnit getblowingunit(){
        return getblowingunit();
    }





}
