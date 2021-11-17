package com.example.springpatterns.behavioral;

import com.example.springpatterns.patterns.behavioral.template.HtmlAboutUs;
import com.example.springpatterns.patterns.behavioral.template.HtmlHome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemplatePatternTest {


    @Test
    void htmlAbout() {

        HtmlAboutUs about = new HtmlAboutUs();
        assertTrue(about.head().contains("Nuestro equipo"));
        assertTrue(about.body().contains("Página Nosotros"));
        assertTrue(about.footer().contains("Copyright 2021 Principal")); // heredado
        // página global
        assertTrue(about.render().contains("Nuestro equipo"));
        assertTrue(about.render().contains("Página Nosotros"));
        assertTrue(about.render().contains("Principal"));
    }

    @Test
    void htmlHome() {

        HtmlHome htmlHome = new HtmlHome();
        String head = htmlHome.head();
        assertTrue(head.contains("Página de inicio"));
        assertTrue(htmlHome.body().contains("Home"));
        assertTrue(htmlHome.footer().contains("Copyright 2021 Principal")); // heredado
        // página global
        assertTrue(htmlHome.render().contains("Página de inicio"));
        assertTrue(htmlHome.render().contains("Home"));
        assertTrue(htmlHome.render().contains("Principal"));
    }

}
