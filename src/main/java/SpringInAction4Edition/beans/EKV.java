/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition.beans;

import SpringInAction4Edition.ICompactDisc;
import org.springframework.stereotype.Component;

@Component
public class EKV implements ICompactDisc {

    @Override
    public void play() {
        System.err.println("EKV - Krug !");
    }

}
