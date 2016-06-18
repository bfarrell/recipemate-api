package bfarrell.recipemate.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Ingredient  {
  
  private BigDecimal id = null;
  private String product = null;
  private String quantity = null;
  private String quantityType = null;

  /**
   * unique identifier representing a specific ingredient
   **/
  @ApiModelProperty(value = "unique identifier representing a specific ingredient")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * name of ingredient from product
   **/
  @ApiModelProperty(value = "name of ingredient from product")
  @JsonProperty("product")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }

  /**
   * quantity of ingredient
   **/
  @ApiModelProperty(value = "quantity of ingredient")
  @JsonProperty("quantity")
  public String getQuantity() {
    return quantity;
  }
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   * quantity type of ingredient
   **/
  @ApiModelProperty(value = "quantity type of ingredient")
  @JsonProperty("quantity_type")
  public String getQuantityType() {
    return quantityType;
  }
  public void setQuantityType(String quantityType) {
    this.quantityType = quantityType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ingredient ingredient = (Ingredient) o;
    return Objects.equals(id, ingredient.id) &&
        Objects.equals(product, ingredient.product) &&
        Objects.equals(quantity, ingredient.quantity) &&
        Objects.equals(quantityType, ingredient.quantityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, quantity, quantityType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ingredient {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  quantityType: ").append(quantityType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
