package bfarrell.recipemate.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bfarrell.recipemate.model.Ingredient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/ingredients", produces = "application/json")
@Api(value = "/ingredients")
public class IngredientsController {

	@ApiOperation(value = "", notes = "creates a new ingredient", response = Ingredient.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "ingredient response", response = Ingredient.class),
			@ApiResponse(code = 400, message = "invalid json", response = Ingredient.class),
			@ApiResponse(code = 409, message = "object exists", response = Ingredient.class),
			@ApiResponse(code = 500, message = "unknown error", response = Ingredient.class) })
	@RequestMapping(value = "", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Ingredient> addIngredient(@ApiParam(value = "ingredient object to create", required=true) 
													@RequestBody Ingredient ingredient) {
		// do some magic!
		return new ResponseEntity<Ingredient>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "deletes a single ingredient based on the id supplied", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "ingredient deleted", response = Void.class),
			@ApiResponse(code = 500, message = "unknown error", response = Void.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteIngredient(@ApiParam(value = "id of ingredient to delete", required=true) 
												 @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "returns a single ingredient by id", response = Ingredient.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "ingredient response", response = Ingredient.class),
			@ApiResponse(code = 404, message = "object not found", response = Ingredient.class),
			@ApiResponse(code = 500, message = "unknown error", response = Ingredient.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Ingredient> findIngredientById(@ApiParam(value = "id of ingredient to fetch", required=true) 
														 @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Ingredient>(HttpStatus.OK);
	}


	@ApiOperation(value = "ingredients", notes = "recipe endpoint to retrieve ingredients", 
				  response = Ingredient.class, responseContainer = "List")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "an array of ingredients", response = Ingredient.class),
			@ApiResponse(code = 500, message = "unknown error", response = Ingredient.class) })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Ingredient>> getIngredients() {
		// do some magic!
		return new ResponseEntity<List<Ingredient>>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "put an update to a ingredient", response = Ingredient.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "ingredient response", response = Ingredient.class),
			@ApiResponse(code = 400, message = "invalid json", response = Ingredient.class),
			@ApiResponse(code = 404, message = "object not found", response = Ingredient.class),
			@ApiResponse(code = 500, message = "unknown error", response = Ingredient.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Ingredient> updateIngredient(@ApiParam(value = "id of ingredient to update", required=true) 
													   @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Ingredient>(HttpStatus.OK);
	}

}
