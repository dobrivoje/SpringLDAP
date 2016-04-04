/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition.config;

import SpringInAction4Edition.ICompactDisc2;
import SpringInAction4Edition.aop.TrackCounter;
import SpringInAction4Edition.beans.BlankDisc;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"SpringInAction4Edition"})
public class TraxCounterConfig {

    @Bean
    public ICompactDisc2 getLepaBrena_RaniRadoviCD() {
        BlankDisc cd = new BlankDisc("Lepa Brena", "Rani radovi");
        cd.setTrax(new ArrayList<>(
                Arrays.asList(
                        "Mače moje ti si Bog",
                        "Mile voli disko",
                        "Ej Šeki Šeki tako ti Allaha"
                )
        ));

        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
