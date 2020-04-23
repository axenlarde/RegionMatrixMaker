package com.alex.regionmatrixmaker.main;

import java.util.ArrayList;

/**********************************
* Related Region
* 
* @author RATEL Alexandre
**********************************/
public class RelatedRegion
	{
	/**
	 * Variables
	 */
	private String name;
	private String audioCodec;
	private String videoCodec;
	private String codecList;
	
	/***************
	 * Constructor
	 ***************/
	public RelatedRegion(String name, String audioCodec, String videoCodec,
			String codecList)
		{
		super();
		this.name = name;
		this.audioCodec = audioCodec;
		this.videoCodec = videoCodec;
		this.codecList = codecList;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getAudioCodec()
		{
		return audioCodec;
		}

	public void setAudioCodec(String audioCodec)
		{
		this.audioCodec = audioCodec;
		}

	public String getVideoCodec()
		{
		return videoCodec;
		}

	public void setVideoCodec(String videoCodec)
		{
		this.videoCodec = videoCodec;
		}

	public String getCodecList()
		{
		return codecList;
		}

	public void setCodecList(String codecList)
		{
		this.codecList = codecList;
		}
	
	
	
	/*2019*//*RATEL Alexandre 8)*/
	}

