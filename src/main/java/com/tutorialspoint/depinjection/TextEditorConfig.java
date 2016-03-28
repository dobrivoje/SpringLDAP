/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.depinjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TextEditorConfig {

    /*
     @Bean
     public TextEditor getTextEditor() {
     return new TextEditor(getSpellChecker());
     }
    
     @Bean(initMethod = "init", destroyMethod = "destroy")
     @Scope("prototype")
     public SpellChecker getSpellChecker() {
     return new SpellChecker();
     }
     */
}
