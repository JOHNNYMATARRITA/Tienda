/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class TemplateResolverConfiguration {

    @Bean

    public SpringResourceTermplatesResolver templatesResolver_0
    SpringResourcetemplateResolver templateRosolver = new SpringResourcetemplateResolver ;

    templateResolver.setPrefix ("classpath:/teplates");
    templateResolver.setSuffix "html:");
    templateResolver.setTemplateMode (TemplateMode.HTML);

    templateResolver.SetCharacterEncoding (UTF-8);
    templateResolver.setOrder (0);
                           
    templateResolver.setCheckExistence ;
    return templateResolver ;
}
