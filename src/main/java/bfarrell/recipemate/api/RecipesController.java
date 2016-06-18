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

import bfarrell.recipemate.model.Recipe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/recipes", produces = "application/json")
@Api(value = "/recipes")
public class RecipesController {

	@ApiOperation(value = "", notes = "creates a new recipe", response = Recipe.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "recipe response", response = Recipe.class),
			@ApiResponse(code = 400, message = "invalid json", response = Recipe.class),
			@ApiResponse(code = 409, message = "object exists", response = Recipe.class),
			@ApiResponse(code = 500, message = "unknown error", response = Recipe.class) })
	@RequestMapping(value = "",
	produces = { "application/json" }, 
	consumes = { "application/json" },
	method = RequestMethod.POST)
	public ResponseEntity<Recipe> addRecipe(

			@ApiParam(value = "recipe object to create", required=true) @RequestBody Recipe recipe){
		// do some magic!
		return new ResponseEntity<Recipe>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "deletes a single recipe based on the id supplied", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "recipe deleted", response = Void.class),
			@ApiResponse(code = 500, message = "unknown error", response = Void.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteRecipe(@ApiParam(value = "id of recipe to delete", required=true) @PathVariable("id") int id) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "returns a single recipe by id", response = Recipe.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "recipe response", response = Recipe.class),
			@ApiResponse(code = 404, message = "object not found", response = Recipe.class),
			@ApiResponse(code = 500, message = "unknown error", response = Recipe.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Recipe> findRecipeById(@ApiParam(value = "id of recipe to fetch", required=true) @PathVariable("id") int id) {
		// do some magic!
		return new ResponseEntity<Recipe>(HttpStatus.OK);
	}

	@ApiOperation(value = "recipes", notes = "recipe endpoint to retrieve recipes", response = Recipe.class, responseContainer = "List")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "an array of recipes", response = Recipe.class),
			@ApiResponse(code = 500, message = "unknown error", response = Recipe.class) })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Recipe>> getRecipes() {
		// do some magic!
		return new ResponseEntity<List<Recipe>>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "put an update to a recipe", response = Recipe.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "recipe response", response = Recipe.class),
			@ApiResponse(code = 400, message = "invalid json", response = Recipe.class),
			@ApiResponse(code = 404, message = "object not found", response = Recipe.class),
			@ApiResponse(code = 500, message = "unknown error", response = Recipe.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Recipe> updateRecipe(@ApiParam(value = "id of recipe to update", required=true) 
											   @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Recipe>(HttpStatus.OK);
	}
}
