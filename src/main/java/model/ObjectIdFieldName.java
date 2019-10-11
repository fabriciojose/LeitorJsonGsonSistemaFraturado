package model;

import java.util.List;

public class ObjectIdFieldName {
	
	String objectIdFieldName;
	String globalIdFieldName;
	String geometryType;
	
	SpatialReference spatialReference;
	
	List<Fields> fields;
	List<Features> features;
	
	public String getObjectIdFieldName() {
		return objectIdFieldName;
	}

	public void setObjectIdFieldName(String objectIdFieldName) {
		this.objectIdFieldName = objectIdFieldName;
	}

	public String getGlobalIdFieldName() {
		return globalIdFieldName;
	}

	public void setGlobalIdFieldName(String globalIdFieldName) {
		this.globalIdFieldName = globalIdFieldName;
	}

	public String getGeometryType() {
		return geometryType;
	}

	public void setGeometryType(String geometryType) {
		this.geometryType = geometryType;
	}

	public SpatialReference getSpatialReference() {
		return spatialReference;
	}

	public void setSpatialReference(SpatialReference spatialReference) {
		this.spatialReference = spatialReference;
	}

	public List<Fields> getFields() {
		return fields;
	}

	public void setFields(List<Fields> fields) {
		this.fields = fields;
	}

	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> features) {
		this.features = features;
	}

	

}
