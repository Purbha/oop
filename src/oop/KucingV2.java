package oop;
/**
 * @author Irsyad
 */
public class KucingV2 {
    
    private String color;
    private Double height, length, weight;
 
    public KucingV2() {   
    }
  
    public KucingV2(String color, Double height, Double length, Double weight) {
        this.color = color; this.height = height; this.length = length;
        this.weight = weight;
    }
 
    public String getColor() { return color; }
 
    public void setColor(String value) { this.color = value; }
 
    public Double getHeight() { return height; }
 
    public void setHeight(Double value) { this.height = value; }
 
    public Double getLength() { return length; }
 
    public void setLength(Double value) { this.length = value; }
 
    public Double getWeight() { return weight; }
 
    public void setWeight(Double value) { this.weight = value; }
    
}
