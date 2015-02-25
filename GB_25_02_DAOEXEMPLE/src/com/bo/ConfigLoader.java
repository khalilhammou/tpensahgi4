package com.bo;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ConfigLoader {
	private static final String BUNDLE_NAME = "com.bo.config"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private ConfigLoader() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
