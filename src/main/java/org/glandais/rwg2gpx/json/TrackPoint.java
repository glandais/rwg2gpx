
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
    "x",
    "y",
    "e",
    "d",
    "options",
    "color"
})
public class TrackPoint {

    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("e")
    private Double e;
    @JsonProperty("d")
    private Double d;
    @JsonProperty("options")
    private Integer options;
    @JsonProperty("color")
    private Integer color;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    public TrackPoint withX(Double x) {
        this.x = x;
        return this;
    }

    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    public TrackPoint withY(Double y) {
        this.y = y;
        return this;
    }

    @JsonProperty("e")
    public Double getE() {
        return e;
    }

    @JsonProperty("e")
    public void setE(Double e) {
        this.e = e;
    }

    public TrackPoint withE(Double e) {
        this.e = e;
        return this;
    }

    @JsonProperty("d")
    public Double getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(Double d) {
        this.d = d;
    }

    public TrackPoint withD(Double d) {
        this.d = d;
        return this;
    }

    @JsonProperty("options")
    public Integer getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Integer options) {
        this.options = options;
    }

    public TrackPoint withOptions(Integer options) {
        this.options = options;
        return this;
    }

    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Integer color) {
        this.color = color;
    }

    public TrackPoint withColor(Integer color) {
        this.color = color;
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

    public TrackPoint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(x).append(y).append(e).append(d).append(options).append(color).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrackPoint) == false) {
            return false;
        }
        TrackPoint rhs = ((TrackPoint) other);
        return new EqualsBuilder().append(x, rhs.x).append(y, rhs.y).append(e, rhs.e).append(d, rhs.d).append(options, rhs.options).append(color, rhs.color).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
