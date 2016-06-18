package bfarrell.recipemate.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Product  {
  
  private String name = null;
  private BigDecimal category = null;

  /**
   * name of product
   **/
  @ApiModelProperty(value = "name of product")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * category of the product
   **/
  @ApiModelProperty(value = "category of the product")
  @JsonProperty("category")
  public BigDecimal getCategory() {
    return category;
  }
  public void setCategory(BigDecimal category) {
    this.category = category;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(name, product.name) &&
        Objects.equals(category, product.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
