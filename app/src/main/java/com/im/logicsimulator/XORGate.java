package com.im.logicsimulator;

import android.content.res.Resources;

public class XORGate extends TwoInputTool implements Node{
    public XORGate(Resources res, int image, GridRect grid) {
        super(res, image, grid);
    }

    public boolean eval() {

        if (this.a == null || this.b == null){
            return true;
        }
        else if(a.eval() && b.eval()){
            return false;
        }
        else if(!a.eval() && b.eval()){
            return true;
        }
        else {
            return a.eval() && !b.eval();
        }
    }
}
