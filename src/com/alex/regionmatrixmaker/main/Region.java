package com.alex.regionmatrixmaker.main;

import java.util.ArrayList;

/**********************************
* Region
* 
* @author RATEL Alexandre
**********************************/
public class Region
	{
	/**
	 * Variables
	 */
	private String name;
	private ArrayList<RelatedRegion> relatedRegions;
	
	/***************
	 * Constructor
	 ***************/
	public Region(String name, ArrayList<RelatedRegion> relatedRegions)
		{
		super();
		this.name = name;
		this.relatedRegions = relatedRegions;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public ArrayList<RelatedRegion> getRelatedRegions()
		{
		return relatedRegions;
		}

	public void setRelatedRegions(ArrayList<RelatedRegion> relatedRegions)
		{
		this.relatedRegions = relatedRegions;
		}
	
	
	/*2019*//*RATEL Alexandre 8)*/
	}

