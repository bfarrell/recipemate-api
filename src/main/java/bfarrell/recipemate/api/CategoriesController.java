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

import bfarrell.recipemate.model.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/categories", produces = "application/json")
@Api(value = "/categories", description = "the categories API")
public class CategoriesController {

	@ApiOperation(value = "", notes = "creates a new category", response = Category.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "category response", response = Category.class),
			@ApiResponse(code = 400, message = "invalid json", response = Category.class),
			@ApiResponse(code = 409, message = "object exists", response = Category.class),
			@ApiResponse(code = 500, message = "unknown error", response = Category.class) })
	@RequestMapping(value = "", produces = { "application/json" }, 
	consumes = { "application/json" },
	method = RequestMethod.POST)
	public ResponseEntity<Category> addCategory(@ApiParam(value = "category object to create", required=true) 
	@RequestBody Category category) {
		// do some magic!
		return new ResponseEntity<Category>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "deletes a single category based on the id supplied", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "category deleted", response = Void.class),
			@ApiResponse(code = 500, message = "unknown error", response = Void.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCategory(@ApiParam(value = "id of category to delete", required=true) 
											   @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "returns a single category by id", response = Category.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "category response", response = Category.class),
			@ApiResponse(code = 404, message = "object not found", response = Category.class),
			@ApiResponse(code = 500, message = "unknown error", response = Category.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Category> findCategoryById(@ApiParam(value = "id of category to fetch", required=true) 
													 @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Category>(HttpStatus.OK);
	}


	@ApiOperation(value = "categories", notes = "recipe endpoint to retrieve categories", response = Category.class, responseContainer = "List")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "an array of categories", response = Category.class),
			@ApiResponse(code = 500, message = "unknown error", response = Category.class) })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
		// do some magic!
		return new ResponseEntity<List<Category>>(HttpStatus.OK);
	}


	@ApiOperation(value = "", notes = "put an update to a category", response = Category.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "category response", response = Category.class),
			@ApiResponse(code = 400, message = "invalid json", response = Category.class),
			@ApiResponse(code = 404, message = "object not found", response = Category.class),
			@ApiResponse(code = 500, message = "unknown error", response = Category.class) })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Category> updateCategory(@ApiParam(value = "id of category to update", required=true) 
												   @PathVariable("id") UUID id) {
		// do some magic!
		return new ResponseEntity<Category>(HttpStatus.OK);
	}

}
