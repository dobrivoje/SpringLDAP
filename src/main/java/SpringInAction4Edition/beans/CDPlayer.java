/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition.beans;

import SpringInAction4Edition.ICompactDisc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private final List<ICompactDisc> cds;

    @Autowired
    public CDPlayer(List<ICompactDisc> cds) {
        this.cds = cds;
    }

    public List<ICompactDisc> getCd() {
        System.err.println("CDs : ");
        
        for (ICompactDisc c : cds) {
            c.play();
        }

        return cds;
    }

}
