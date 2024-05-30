package com.retogit.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoGitUI {
    public static Target ADDED = Target
            .the("Object")
            .located(By.xpath("//span[@data-molecule-product-detail-name-span='true']"));
    
}
