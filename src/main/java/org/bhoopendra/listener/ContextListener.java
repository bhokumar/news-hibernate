package org.bhoopendra.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Context initialized!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Context destroyed!");
	}

}
