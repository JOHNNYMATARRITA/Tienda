/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;


@Configuration


public class TemplateResolverConfiguration {

    @Bean

    public SpringResourceTemplateResolver templatesResolver_0 (){
            
            SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver ();

    templateResolver.setPrefix ("classpath:/teplates");
    templateResolver.setSuffix (".html");
    templateResolver.setTemplateMode (TemplateMode.HTML);

    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setOrder (0);
                           
    templateResolver.setCheckExistence (true) ;
    return templateResolver ;
}
}