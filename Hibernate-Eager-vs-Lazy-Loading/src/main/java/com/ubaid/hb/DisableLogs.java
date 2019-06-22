package com.ubaid.hb;


import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DisableLogs
{
	/**
	 * a method which is used to disable logging
	 */
	public static void disableLogging()
	{
		LogManager logManager = LogManager.getLogManager();
		Logger logger = logManager.getLogger("");
		logger.setLevel(Level.SEVERE); //could be Level.OFF
	}

}
