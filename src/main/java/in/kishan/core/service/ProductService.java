package in.kishan.core.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kishan.core.model.Product;
import in.kishan.core.repository.ProductRepository;

@Service
public class ProductService {
 
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	public Optional<Product> getProductById(Long id){
		return productRepository.findById(id);
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Long id,Product productDetails) {
		Product product =productRepository.findById(id)
		                            .orElseThrow(()->new RuntimeException("user not found"));
		product.setName(productDetails.getName());
		product.setPrice(productDetails.getPrice());
		return productRepository.save(product);
	}
	
	public void deleteProduct(Long id) {
		Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
		                
	    productRepository.delete(product);
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		
	}
	
}
