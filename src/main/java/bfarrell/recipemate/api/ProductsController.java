package bfarrell.recipemate.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bfarrell.recipemate.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/products", produces = "application/json")
@Api(value = "/products")
public class ProductsController {

	@ApiOperation(value = "", notes = "creates a new product", response = Product.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 201, message = "product response", response = Product.class),
			@ApiResponse(code = 400, message = "invalid json", response = Product.class),
			@ApiResponse(code = 409, message = "object exists", response = Product.class),
			@ApiResponse(code = 500, message = "unknown error", response = Product.class) })
	@RequestMapping(value = "", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Product> addProduct(@ApiParam(value = "product object to create", required=true) @RequestBody Product product) {
		// do some magic!
		return new ResponseEntity<Product>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "deletes a single product based on the name supplied", response = Void.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "product deleted", response = Void.class),
			@ApiResponse(code = 500, message = "unknown error", response = Void.class) })
	@RequestMapping(value = "/{name}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteProduct(@ApiParam(value = "name of product to fetch", required=true) 
											  @PathVariable("name") String name) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "returns a single category by name", response = Product.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "product response", response = Product.class),
			@ApiResponse(code = 404, message = "object not found", response = Product.class),
			@ApiResponse(code = 500, message = "unknown error", response = Product.class) })
	@RequestMapping(value = "/{name}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Product> findProductByName(@ApiParam(value = "name of product to fetch", required=true) 
													 @PathVariable("name") String name) {
		// do some magic!
		return new ResponseEntity<Product>(HttpStatus.OK);
	}

	@ApiOperation(value = "products", notes = "recipe endpoint to retrieve products", response = Product.class, responseContainer = "List")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "an array of products", response = Product.class),
			@ApiResponse(code = 500, message = "unknown error", response = Product.class) })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getProducts() {
		// do some magic!
		return new ResponseEntity<List<Product>>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "put an update to a product", response = Product.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "product response", response = Product.class),
			@ApiResponse(code = 400, message = "invalid json", response = Product.class),
			@ApiResponse(code = 404, message = "object not found", response = Product.class),
			@ApiResponse(code = 500, message = "unknown error", response = Product.class) })
	@RequestMapping(value = "/{name}", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Product> updateProduct(
			@ApiParam(value = "name of product to fetch",required=true ) @PathVariable("name") String name) {
		// do some magic!
		return new ResponseEntity<Product>(HttpStatus.OK);
	}
}
