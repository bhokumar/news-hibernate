package org.bhoopendra.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyHandler extends Properties {

	private static final long serialVersionUID = -2730048672655371663L;
	private static final PropertyHandler propertyHandler = new PropertyHandler();

	private PropertyHandler() {
	}

	public static String getPropertyValue(final String key, final String filePath) throws IOException {
		propertyHandler.clear();
		propertyHandler.load(PropertyHandler.class.getClassLoader().getResourceAsStream(filePath));
		return propertyHandler.getProperty(key);
	}
}
