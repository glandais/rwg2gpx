
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
    "t",
    "n",
    "d",
    "i"
})
public class CoursePoint {

    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("t")
    private String t;
    @JsonProperty("n")
    private String n;
    @JsonProperty("d")
    private Double d;
    @JsonProperty("i")
    private Integer i;
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

    public CoursePoint withX(Double x) {
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

    public CoursePoint withY(Double y) {
        this.y = y;
        return this;
    }

    @JsonProperty("t")
    public String getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
    }

    public CoursePoint withT(String t) {
        this.t = t;
        return this;
    }

    @JsonProperty("n")
    public String getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(String n) {
        this.n = n;
    }

    public CoursePoint withN(String n) {
        this.n = n;
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

    public CoursePoint withD(Double d) {
        this.d = d;
        return this;
    }

    @JsonProperty("i")
    public Integer getI() {
        return i;
    }

    @JsonProperty("i")
    public void setI(Integer i) {
        this.i = i;
    }

    public CoursePoint withI(Integer i) {
        this.i = i;
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

    public CoursePoint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(x).append(y).append(t).append(n).append(d).append(i).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoursePoint) == false) {
            return false;
        }
        CoursePoint rhs = ((CoursePoint) other);
        return new EqualsBuilder().append(x, rhs.x).append(y, rhs.y).append(t, rhs.t).append(n, rhs.n).append(d, rhs.d).append(i, rhs.i).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
