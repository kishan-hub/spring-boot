package in.kishan.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class ProductController {
//	
//	@Autowired
//	CategoryService categoryService;
	
	//get All products
//	@GetMapping
//    public List<Product> getAllProducts(){
//		return productService.getAllProduct();
//	}
//
//	//Get product by Id
//	@GetMapping("/{id}")
//	public ResponseEntity<Product> getProductById(@PathVariable Long id){
//		Product product =productService.getProductById(id)
//				                        .orElseThrow(()->new ResourceNotFoundException("Product Not found"));
//		return ResponseEntity.ok(product);
//	}
//	
//	//Create a new product
//	@PostMapping
//	public Product createProduct(@RequestBody Product product){
//		return productService.createProduct(product);
//	}
//	
//	//Update an existing Product
//	@PutMapping("/{id}")
//	public ResponseEntity<Product> updateProduct(@PathVariable Long id,@RequestBody Product productDetails){
//		Product updateProduct =productService.updateProduct(id, productDetails);
//		return ResponseEntity.ok(updateProduct);
//	}
//	//delete a product
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
//		productService.deleteProduct(id);
//		return ResponseEntity.noContent().build();
//	}
	
	
	
}
