package com.vidvaan.container;

import java.io.IOException;
import java.util.Properties;

public class NetworkContainer {
	public Object getObject(String name) {
		Properties properties = new Properties();
		try {
			properties.load(NetworkContainer.class.getClassLoader().getResourceAsStream("network.properties"));
			return Class.forName(properties.getProperty(name)).newInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
