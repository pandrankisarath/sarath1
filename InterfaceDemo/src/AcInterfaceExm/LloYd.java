package AcInterfaceExm;

import Model.AirfilTer;
import Model.CompRessor;

public abstract class LloYd implements AC {
    abstract void FanType(String fan);

    String Compressor;
    String Airfilter;

    public final void getLLYOD(){
        FanType("");
        getcompressor();
        getairfilter();
        System.out.println("Adapt to every satuation");
    }

    public CompRessor getcompressor(){
        return getcompressor();
    }
    public AirfilTer getairfilter(){
        return getairfilter();
    }



}
