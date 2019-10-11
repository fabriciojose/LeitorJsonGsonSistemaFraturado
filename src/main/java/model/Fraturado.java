package model;

import java.util.List;
import java.util.Map;

public class Fraturado {
	
	public String displayFieldName;
	public Map<String, String> fieldAliases;
	public String geometryType;
	public SpatialReference spatialReference;
	public List<Fields> fields;
	
	public List<Features> features;
	
	
	
	public String getDisplayFieldName() {
		return displayFieldName;
	}
	public void setDisplayFieldName(String displayFieldName) {
		this.displayFieldName = displayFieldName;
	}
	public Map<String, String> getFieldAliases() {
		return fieldAliases;
	}
	public void setFieldAliases(Map<String, String> fieldAliases) {
		this.fieldAliases = fieldAliases;
	}
	public String getGeometryType() {
		return geometryType;
	}
	public void setGeometryType(String geometryType) {
		this.geometryType = geometryType;
	}

}
