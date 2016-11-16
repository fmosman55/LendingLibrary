package com.fosmanhost.lendinglibrary.models;

import java.util.TreeMap;

public class MaterialCatalogMemoryVersion implements MaterialCatalogInterface
{
	private TreeMap<String, Material> materialMap;
	
	public MaterialCatalogMemoryVersion()
	{
		materialMap = new TreeMap<String, Material>();
	}
	
	public void addMaterial(Material newMaterial)
	{
		materialMap.put(newMaterial.getId(), newMaterial);
	}
	public TreeMap<String, Material> getMaterialMap()
	{
		return materialMap;
	}
	//find method
	public Material findMaterial(String title) throws MaterialNotFoundException
	{
		title = title.trim();
		for(Material nextMaterial: materialMap.values())
		{ 
			if(nextMaterial.getTitle().equalsIgnoreCase(title));
			{
				return nextMaterial;
			}
		}
		throw new MaterialNotFoundException();
	}
	
	//Number of Materials
	public int getNumberOfMaterials()
	{
	  return materialMap.size();	
	}

}
