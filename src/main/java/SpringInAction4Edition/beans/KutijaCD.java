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
public class KutijaCD {

    @Autowired
    List<ICompactDisc> cds;

    public KutijaCD() {
    }

    public List<ICompactDisc> getCds() {
        return cds;
    }

    public void setCds(List<ICompactDisc> cds) {
        this.cds = cds;
    }

}
