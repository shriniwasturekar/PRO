package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jayesh & Shriniwas on 07/13/2020.
 */
public class PropertiesUtil {

    public static Properties properties;

  
    /**
     * Method to get locator
     * @param locatorKey
     * @return locator string
     */
    public static String getLocator(final String locatorKey){
        return properties.getProperty(locatorKey);
    }

    /**
     * Static block for loading test.properties and locators.properties files
     */
    static{
        properties = new Properties();
        try
        {
            File testPropertiesFile = null;
            File locatorPropertiesFile =  null;
            if (System.getProperty("user.dir")!=null){
                testPropertiesFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "test.properties");
                 locatorPropertiesFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "locators.properties");
            }
            properties.load(new FileInputStream(testPropertiesFile));
            properties.load(new FileInputStream(locatorPropertiesFile));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
