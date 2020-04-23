package com.alex.regionmatrixmaker.utils;

/**********************************
 * Class used to store static variables
 * 
 * @author RATEL Alexandre
 **********************************/
public class Variables
	{
	/**
	 * Variables
	 */
	private static String regionFileName;
	private static String regionMatrixFileName;
	private static String mainDirectory;
	private static String splitter;
	
	public Variables()
		{
		splitter = ",";
		regionFileName = "region.csv";
		regionMatrixFileName = "regionMatrix.csv";
		mainDirectory = ".";
		}

	public static String getRegionFileName()
		{
		return regionFileName;
		}

	public static void setRegionFileName(String regionFileName)
		{
		Variables.regionFileName = regionFileName;
		}

	public static String getMainDirectory()
		{
		return mainDirectory;
		}

	public static void setMainDirectory(String mainDirectory)
		{
		Variables.mainDirectory = mainDirectory;
		}

	public static String getSplitter()
		{
		return splitter;
		}

	public static void setSplitter(String splitter)
		{
		Variables.splitter = splitter;
		}

	public static String getRegionMatrixFileName()
		{
		return regionMatrixFileName;
		}

	public static void setRegionMatrixFileName(String regionMatrixFileName)
		{
		Variables.regionMatrixFileName = regionMatrixFileName;
		}
	
	
	
	/*2019*//*RATEL Alexandre 8)*/
	}

