package com.xworkz.crocoFestival.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crocoFestival.configuration.BrowserProviderConfiguration;
import com.xworkz.crocoFestival.thing.Chrome;
import com.xworkz.crocoFestival.thing.FireBox;

public class BrowserProviderRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BrowserProviderConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		Chrome chrome = container.getBean(Chrome.class);
		chrome.browse();
		FireBox firebox = container.getBean(FireBox.class);
		firebox.browse();

	}

}


