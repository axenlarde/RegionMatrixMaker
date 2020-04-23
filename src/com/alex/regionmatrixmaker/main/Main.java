package com.alex.regionmatrixmaker.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.alex.regionmatrixmaker.utils.UsefulMethod;
import com.alex.regionmatrixmaker.utils.Variables;


/**********************************
 * Class used to convert a text file into a 
 * site list xml file
 * 
 * @author RATEL Alexandre
 **********************************/
public class Main
	{
	
	
	
	
	/**
	 * Constructor
	 */
	public Main()
		{
		try
			{
			new Variables();
			
			/**
			 * We open the region text file
			 */
			FileReader monFichier = new FileReader(Variables.getMainDirectory()+"/"+Variables.getRegionFileName());
			BufferedReader tampon = new BufferedReader(monFichier);
			ArrayList<Region> regionList = new ArrayList<Region>();
			String splitter = Variables.getSplitter();
			boolean isFirstLine = true;
			
			//File reading
			while(true)
				{
				String ligne = tampon.readLine();
				if(ligne == null)
					{
					break;
					}
				
				if(!isFirstLine)
					{
					String[] tab = ligne.split(splitter,-1);
					ArrayList<RelatedRegion> relatedRegions = new ArrayList<RelatedRegion>();
					int index = 0;
					while(true)
						{
						//System.out.println("# "+ligne);
						if((index+1 >= tab.length) || (tab[index+1].isEmpty()))break;
						relatedRegions.add(new RelatedRegion(tab[index+1], tab[index+2], tab[index+3], tab[index+4]));
						index += 4;
						}
					System.out.println("Found "+relatedRegions.size()+" related region for region "+tab[0]);
					regionList.add(new Region(tab[0], relatedRegions));
					System.out.println("New region added to the list : "+tab[0]);
					}
				else
					{
					isFirstLine = false;
					}
				}
			
			tampon.close();
			monFichier.close();
			
			/**
			 * We write the result file
			 */
			BufferedWriter myBuffer = new BufferedWriter(new FileWriter(new File(Variables.getMainDirectory()+"/"+Variables.getRegionMatrixFileName()), false));
			
			//First line
			String firstLine = new String(splitter);
			for(Region r : regionList)
				{
				firstLine += r.getName()+splitter;
				}
			firstLine = firstLine.substring(0, firstLine.length()-1);//to remove the last ,
			firstLine +="\r\n";
			
			myBuffer.write(firstLine);
			
			//The other lines
			for(Region r : regionList)
				{
				String line = new String("");
				line += r.getName()+splitter;
				
				for(Region reg : regionList)
					{
					boolean found = false;
					for(RelatedRegion rr : r.getRelatedRegions())
						{
						if(rr.getName().equals(reg.getName()))
							{
							line += rr.getAudioCodec()+splitter;
							found = true;
							break;
							}
						}
					if(!found)
						{
						line += splitter;
						}
					}
				line = line.substring(0,line.length()-1);
				line += "\r\n";
				myBuffer.write(line);
				}
			
			myBuffer.flush();
			myBuffer.close();
			
			System.out.println("Done !!!");
			
			//End
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}
		}
	
	
	
	
	
	

	/****************************************/
	public static void main(String[] args)
		{
		new Main();
		}
	/*2015*//*RATEL Alexandre 8)*/
	}

