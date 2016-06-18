package bfarrell.recipemate.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Recipe  {
  
  private BigDecimal id = null;
  private String name = null;
  private List<BigDecimal> ingredients = new ArrayList<BigDecimal>();
  private List<String> steps = new ArrayList<String>();

  /**
   * unique identifier representing a specific recipe
   **/
  @ApiModelProperty(value = "unique identifier representing a specific recipe")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * name of recipe
   **/
  @ApiModelProperty(value = "name of recipe")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * recipe ingredients by id
   **/
  @ApiModelProperty(value = "recipe ingredients by id")
  @JsonProperty("ingredients")
  public List<BigDecimal> getIngredients() {
    return ingredients;
  }
  public void setIngredients(List<BigDecimal> ingredients) {
    this.ingredients = ingredients;
  }

  /**
   * recipe steps
   **/
  @ApiModelProperty(value = "recipe steps")
  @JsonProperty("steps")
  public List<String> getSteps() {
    return steps;
  }
  public void setSteps(List<String> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipe recipe = (Recipe) o;
    return Objects.equals(id, recipe.id) &&
        Objects.equals(name, recipe.name) &&
        Objects.equals(ingredients, recipe.ingredients) &&
        Objects.equals(steps, recipe.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ingredients, steps);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  ingredients: ").append(ingredients).append("\n");
    sb.append("  steps: ").append(steps).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
