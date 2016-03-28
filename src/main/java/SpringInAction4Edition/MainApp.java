/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition;

import SpringInAction4Edition.beans.CDPlayer;
import SpringInAction4Edition.config.CDConfig;
import SpringInAction4Edition.beans.KutijaCD;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:properties/props.properties")
public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CDConfig.class);

        Environment env = context.getEnvironment();
        System.err.println("environment : ime : " + env.getProperty("ime"));
        System.err.println("environment : prezime : " + env.getProperty("prezime"));

        KutijaCD cd_ovi = context.getBean(KutijaCD.class);
        CDPlayer cDPlayer = context.getBean(CDPlayer.class);

        for (ICompactDisc cd : cd_ovi.getCds()) {
            cd.play();
        }

        cDPlayer.getCd();
        System.err.println("BEAN DEF NAMES : " + Arrays.toString(context.getBeanDefinitionNames()));
    }
}
