
package org.glandais.rwg2gpx.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "user_id",
    "visibility",
    "poi_type",
    "lng",
    "lat",
    "name",
    "url",
    "description",
    "mongo_id",
    "photo_ids",
    "parent_id",
    "parent_type",
    "created_at",
    "updated_at"
})
public class PointsOfInterest {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("poi_type")
    private Integer poiType;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("mongo_id")
    private Object mongoId;
    @JsonProperty("photo_ids")
    private Object photoIds;
    @JsonProperty("parent_id")
    private Integer parentId;
    @JsonProperty("parent_type")
    private String parentType;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public PointsOfInterest withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public PointsOfInterest withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public PointsOfInterest withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("poi_type")
    public Integer getPoiType() {
        return poiType;
    }

    @JsonProperty("poi_type")
    public void setPoiType(Integer poiType) {
        this.poiType = poiType;
    }

    public PointsOfInterest withPoiType(Integer poiType) {
        this.poiType = poiType;
        return this;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    public PointsOfInterest withLng(Double lng) {
        this.lng = lng;
        return this;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public PointsOfInterest withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PointsOfInterest withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public PointsOfInterest withUrl(Object url) {
        this.url = url;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PointsOfInterest withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("mongo_id")
    public Object getMongoId() {
        return mongoId;
    }

    @JsonProperty("mongo_id")
    public void setMongoId(Object mongoId) {
        this.mongoId = mongoId;
    }

    public PointsOfInterest withMongoId(Object mongoId) {
        this.mongoId = mongoId;
        return this;
    }

    @JsonProperty("photo_ids")
    public Object getPhotoIds() {
        return photoIds;
    }

    @JsonProperty("photo_ids")
    public void setPhotoIds(Object photoIds) {
        this.photoIds = photoIds;
    }

    public PointsOfInterest withPhotoIds(Object photoIds) {
        this.photoIds = photoIds;
        return this;
    }

    @JsonProperty("parent_id")
    public Integer getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public PointsOfInterest withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("parent_type")
    public String getParentType() {
        return parentType;
    }

    @JsonProperty("parent_type")
    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public PointsOfInterest withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PointsOfInterest withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PointsOfInterest withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PointsOfInterest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(userId).append(visibility).append(poiType).append(lng).append(lat).append(name).append(url).append(description).append(mongoId).append(photoIds).append(parentId).append(parentType).append(createdAt).append(updatedAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PointsOfInterest) == false) {
            return false;
        }
        PointsOfInterest rhs = ((PointsOfInterest) other);
        return new EqualsBuilder().append(id, rhs.id).append(userId, rhs.userId).append(visibility, rhs.visibility).append(poiType, rhs.poiType).append(lng, rhs.lng).append(lat, rhs.lat).append(name, rhs.name).append(url, rhs.url).append(description, rhs.description).append(mongoId, rhs.mongoId).append(photoIds, rhs.photoIds).append(parentId, rhs.parentId).append(parentType, rhs.parentType).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
