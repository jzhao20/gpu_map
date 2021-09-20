package com.gpu_map.accessingdatamysql;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Gpu {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  @Column(length=256,nullable=false)
  private String name;

  @Column(precision=8,scale=6, nullable=false)
  private Double latitude;

  @Column(precision=8,scale=6,nullable=false)
  private Double longitude;

  @Column(nullable=false)
  private Integer likes;

  @Column(nullable=false)
  private Integer dislikes;

  @ElementCollection
  @Column(columnDefinition="json")
  private Map<String,Integer>available=new HashMap<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }
  
  public Double getLongitude(){
      return longitude;
  }
  
  public void setLongitude(Double longitude){
      this.longitude=longitude;
  }

  public Integer getLikes(){
      return likes;
  }
  
  public void setLikes(Integer likes){
      this.likes=likes;
  }

  public Integer getDislikes(){
      return dislikes;
  }

  public void setDislikes(Integer dislikes){
      this.dislikes=dislikes;
  }
  
  public Map<String,Integer> getAvailable(){
      return available;
  }

  public void setAvailable(Map<String,Integer>available){
      this.available=available;
  }
}