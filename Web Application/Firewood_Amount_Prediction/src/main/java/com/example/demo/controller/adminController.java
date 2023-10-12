package com.example.demo.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Admin;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.adminService;
import com.example.demo.service.customerService;
import com.example.demo.service.productService;



@Controller
@CrossOrigin("*")
@RequestMapping("/admin/")
public class adminController {
	
	private static final Logger logger = Logger.getLogger(adminController.class);
	
	@Autowired
	private adminService service;
	
	@Autowired
	private customerService cSservice;
	
	@Autowired
	private productService pService;
	
	
	//Customers CRUD
	@GetMapping("/customer")
	public String addCustomer(Model model) {
		//model.addAttribute("cutomer", service.getAllAdmins());
		//return "customers";
		try {
			 // Log at ERROR level for critical errors
            logger.error("Fetching all customers for display");

            // Log at WARN level for potential issues or warnings
            logger.warn("Fetching all customers");

            // Log at INFO level for general information
            logger.info("Fetching all customers");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Fetching all customers");

            // Log at TRACE level for very detailed debugging information
            logger.trace("Fetching all customers");

            // Fetch customers and add them to the model
            model.addAttribute("customer", service.getAllAdmins());

            // Log at INFO level to indicate successful fetch
            logger.info("Successfully fetched all customers");

            return "customers";
		} catch (Exception e) {
			 logger.error("Error while fetching customers", e);
	            // Handle the exception or redirect to an error page
	            return "error";
		}
	}
	
	@GetMapping("/customers/new")
	public String createCustomer(Model model) {
//		Customer customer=new Customer();
//		model.addAttribute("customer", customer);
//		return "create_customers";
		
		
		try {
			 // Log at ERROR level for critical errors
            logger.error("Fetching all customers for display");

            // Log at WARN level for potential issues or warnings
            logger.warn("Fetching all customers");

            // Log at INFO level for general information
            logger.info("Fetching all customers");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Fetching all customers");

            // Log at TRACE level for very detailed debugging information
            logger.trace("Fetching all customers");
            
            Customer customer=new Customer();
    		model.addAttribute("customer", customer);
            
             // Log at INFO level to indicate successful fetch
            logger.info("Successfully fetched all customers");

            // Fetch customers and add them to the model
    		return "create_customers";

            
		} catch (Exception e) {
			 logger.error("Error while fetching customers", e);
	            // Handle the exception or redirect to an error page
	            return "error";
		}
	}
	
	@PostMapping("/customers")
	public String saveCustomers(@ModelAttribute("customer")User customer) {
//		User user=new User();
//		user.setRole("ROLE_USER");
//		cSservice.saveCustomer(customer);
//		return "redirect:/admin/customer";
		
		try {
			 // Log at ERROR level for critical errors
            logger.error("An error occurred while saving customer");

            // Log at WARN level for potential issues
            logger.warn("A warning message for customer");

            // Log at INFO level for general information
            logger.info("Saving customer");

            User user=new User();
    		user.setRole("ROLE_USER");
    		cSservice.saveCustomer(customer);
            
            // Log at DEBUG level for detailed debugging information
            logger.debug("Debug message for customer");
            
    		return "redirect:/admin/customer";
		} catch (Exception e) {
			 logger.error("Error saving customer: ", e);
	            // Handle the exception or redirect to an error page
	            return "error";
		}
	}

	
	//Admin CRUD
	
	
	@GetMapping("/admin")
	public String addAdmin(Model model) {
//		model.addAttribute("admin", service.getAllAdmins());
//		return "admin";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Fetching all admin data for display");

            // Log at WARN level for potential issues or warnings
            logger.warn("Fetching all admin data: This is a warning message");

            // Log at INFO level for general information
            logger.info("Fetching all admin data: This is an info message");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Fetching all admin data: This is a debug message");

            // Fetch admin data and add it to the model
            model.addAttribute("admin", service.getAllAdmins());

            // Log at INFO level to indicate successful fetch
            logger.info("Successfully fetched all admin data");

            return "admin";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while fetching admin data", e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@GetMapping("/admin/new")
	public String createAdmin(Model model) {
//		Admin admin=new Admin();
//		model.addAttribute("admin", admin);
//		return "createAdmin";
		
		 try {
	            // Log at ERROR level for critical errors
	            logger.error("Creating a new admin: An error occurred during admin creation");

	            // Log at WARN level for potential issues or warnings
	            logger.warn("Creating a new admin: This is a warning message");

	            // Log at INFO level for general information
	            logger.info("Creating a new admin: Admin creation started");

	            // Log at DEBUG level for detailed debugging information
	            logger.debug("Creating a new admin: Debug information for admin creation");

	            // Create a new Admin object and add it to the model
	            Admin admin = new Admin();
	            model.addAttribute("admin", admin);

	            // Log at INFO level to indicate successful creation
	            logger.info("Creating a new admin: Admin creation completed successfully");

	            return "createAdmin";
	        } catch (Exception e) {
	            // Log at ERROR level for exceptions
	            logger.error("Error while creating a new admin", e);
	            // Handle the exception or redirect to an error page
	            return "error";
	        }
	}
	
	@PostMapping("/admins")
	public String saveAdmins(@ModelAttribute("admin")User admin) {
//		User user=new User();
//		user.setRole("ROLE_ADMIN");
//		service.saveAdmin(admin);
//		return "redirect:/admin/admin";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Saving admin: An error occurred during admin save");

            // Log at WARN level for potential issues or warnings
            logger.warn("Saving admin: This is a warning message");

            // Log at INFO level for general information
            logger.info("Saving admin: Admin save started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Saving admin: Debug information for admin save");

            // Create a new User object with the "ROLE_ADMIN" role
            User user = new User();
            user.setRole("ROLE_ADMIN");

            // Save the admin
            service.saveAdmin(admin);

            // Log at INFO level to indicate successful save
            logger.info("Saving admin: Admin saved successfully");

            return "redirect:/admin/admin";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while saving admin", e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@GetMapping("/admins/edit/{id}")
	public String editAdmin(@PathVariable Long id,Model model) {
//		model.addAttribute("admin", service.getAdminById(id));
//		return "editAdmin";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Editing admin with ID {}: An error occurred during admin editing");

            // Log at WARN level for potential issues or warnings
            logger.warn("Editing admin with ID {}: This is a warning message");

            // Log at INFO level for general information
            logger.info("Editing admin with ID {}: Admin editing started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Editing admin with ID {}: Debug information for admin editing");

            // Fetch the admin by ID and add it to the model
            model.addAttribute("admin", service.getAdminById(id));

            // Log at INFO level to indicate successful fetch
            logger.info("Editing admin with ID {}: Admin data fetched successfully");

            return "editAdmin";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while editing admin with ID ", e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@PostMapping("/admins/{id}")
	public String updateAdmin(@PathVariable Long id,@ModelAttribute("admin") User admin,Model model )
	{
//		User exisitingAdmin = service.getAdminById(id);
//		exisitingAdmin.setId(id);
//		exisitingAdmin.setName(admin.getName());
//		exisitingAdmin.setNic(admin.getNic());
//		exisitingAdmin.setAddress(admin.getAddress());
//		exisitingAdmin.setNumber(admin.getNumber());
//		exisitingAdmin.setEmail(admin.getEmail());
//		exisitingAdmin.setPassword(admin.getPassword());
//		
//		service.updaAdmin(exisitingAdmin);
//		return "redirect:/admin/admin";
		
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Updating admin with ID {}: An error occurred during admin update");

            // Log at WARN level for potential issues or warnings
            logger.warn("Updating admin with ID {}: This is a warning message");

            // Log at INFO level for general information
            logger.info("Updating admin with ID {}: Admin update started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Updating admin with ID {}: Debug information for admin update");

            // Fetch the existing admin by ID
            User existingAdmin = service.getAdminById(id);
            existingAdmin.setId(id);
            existingAdmin.setName(admin.getName());
            existingAdmin.setNic(admin.getNic());
            existingAdmin.setAddress(admin.getAddress());
            existingAdmin.setNumber(admin.getNumber());
            existingAdmin.setEmail(admin.getEmail());
            existingAdmin.setPassword(admin.getPassword());

            // Update the admin
            service.updaAdmin(existingAdmin);

            // Log at INFO level to indicate successful update
            logger.info("Updating admin with ID {}: Admin updated successfully");

            return "redirect:/admin/admin";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while updating admin with ID " + id, e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@GetMapping("/admins/{id}")
	public String deleteCAdmin(@PathVariable Long id) {
//		service.deleteAdminByID(id);
//		return "redirect:/admin/admin";
		
		 try {
	            // Log at ERROR level for critical errors
	            logger.error("Deleting admin with ID {}: An error occurred during admin deletion");

	            // Log at WARN level for potential issues or warnings
	            logger.warn("Deleting admin with ID {}: This is a warning message");

	            // Log at INFO level for general information
	            logger.info("Deleting admin with ID {}: Admin deletion started");

	            // Log at DEBUG level for detailed debugging information
	            logger.debug("Deleting admin with ID {}: Debug information for admin deletion");

	            // Delete the admin by ID
	            service.deleteAdminByID(id);

	            // Log at INFO level to indicate successful deletion
	            logger.info("Deleting admin with ID {}: Admin deleted successfully");

	            return "redirect:/admin/admin";
	        } catch (Exception e) {
	            // Log at ERROR level for exceptions
	            logger.error("Error while deleting admin with ID " + id, e);
	            // Handle the exception or redirect to an error page
	            return "error";
	        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Products CRUD
	
	
	@GetMapping("/products")
	public String productAdd(Model model) {
//		 model.addAttribute("products", pService.getAllProducts());
//		return "products";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Fetching all products for display");

            // Log at WARN level for potential issues or warnings
            logger.warn("Fetching all products: This is a warning message");

            // Log at INFO level for general information
            logger.info("Fetching all products: Product fetch started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Fetching all products: Debug information for product fetch");

            // Fetch products and add them to the model
            model.addAttribute("products", pService.getAllProducts());

            // Log at INFO level to indicate successful fetch
            logger.info("Successfully fetched all products");

            return "products";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while fetching products", e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@GetMapping("/products/new")
	public String createProduct(Model model) {
//		Product product=new Product();
//		model.addAttribute("product", product);
//		return "createProducts";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Creating a new product: An error occurred during product creation");

            // Log at WARN level for potential issues or warnings
            logger.warn("Creating a new product: This is a warning message");

            // Log at INFO level for general information
            logger.info("Creating a new product: Product creation started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Creating a new product: Debug information for product creation");

            // Create a new Product object and add it to the model
            Product product = new Product();
            model.addAttribute("product", product);

            // Log at INFO level to indicate successful creation
            logger.info("Creating a new product: Product creation completed successfully");

            return "createProducts";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while creating a new product", e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@PostMapping("/products")
	public String saveProducts(@ModelAttribute("product")Product product) {
//		pService.saveProduct(product);
//		return "redirect:/admin/products";
		
		 try {
	            // Log at ERROR level for critical errors
	            logger.error("Saving product: An error occurred during product save");

	            // Log at WARN level for potential issues or warnings
	            logger.warn("Saving product: This is a warning message");

	            // Log at INFO level for general information
	            logger.info("Saving product: Product save started");

	            // Log at DEBUG level for detailed debugging information
	            logger.debug("Saving product: Debug information for product save");

	            // Save the product
	            pService.saveProduct(product);

	            // Log at INFO level to indicate successful save
	            logger.info("Saving product: Product saved successfully");

	            return "redirect:/admin/products";
	        } catch (Exception e) {
	            // Log at ERROR level for exceptions
	            logger.error("Error while saving product", e);
	            // Handle the exception or redirect to an error page
	            return "error";
	        }
	}
	
	@GetMapping("/products/edit/{id}")
	public String editProducts(@PathVariable Long id,Model model) {
//		model.addAttribute("product", pService.getProductById(id));
//		return "editProducts";
		
		 try {
	            // Log at ERROR level for critical errors
	            logger.error("Editing product with ID {}: An error occurred during product editing");

	            // Log at WARN level for potential issues or warnings
	            logger.warn("Editing product with ID {}: This is a warning message");

	            // Log at INFO level for general information
	            logger.info("Editing product with ID {}: Product editing started");

	            // Log at DEBUG level for detailed debugging information
	            logger.debug("Editing product with ID {}: Debug information for product editing");

	            // Fetch the product by ID and add it to the model
	            model.addAttribute("product", pService.getProductById(id));

	            // Log at INFO level to indicate successful fetch
	            logger.info("Editing product with ID {}: Product data fetched successfully");

	            return "editProducts";
	        } catch (Exception e) {
	            // Log at ERROR level for exceptions
	            logger.error("Error while editing product with ID " + id, e);
	            // Handle the exception or redirect to an error page
	            return "error";
	        }
	}
	
	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id,@ModelAttribute("product") Product product,Model model )
	{
//		Product exisitingProduct = pService.getProductById(id);
//		exisitingProduct.setId(id);
//		exisitingProduct.setName(product.getName());
//		exisitingProduct.setDescription(product.getDescription());
//		exisitingProduct.setPrice(product.getPrice());
//		exisitingProduct.setCategory(product.getCategory());
//		
//		pService.updaProduct(exisitingProduct);
//		return "redirect:/admin/products";
		
		try {
            // Log at ERROR level for critical errors
            logger.error("Updating product with ID {}: An error occurred during product update");

            // Log at WARN level for potential issues or warnings
            logger.warn("Updating product with ID {}: This is a warning message");

            // Log at INFO level for general information
            logger.info("Updating product with ID {}: Product update started");

            // Log at DEBUG level for detailed debugging information
            logger.debug("Updating product with ID {}: Debug information for product update");

            // Fetch the existing product by ID
            Product existingProduct = pService.getProductById(id);
            existingProduct.setId(id);
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategory(product.getCategory());

            // Update the product
            pService.updaProduct(existingProduct);

            // Log at INFO level to indicate successful update
            logger.info("Updating product with ID {}: Product updated successfully");

            return "redirect:/admin/products";
        } catch (Exception e) {
            // Log at ERROR level for exceptions
            logger.error("Error while updating product with ID " + id, e);
            // Handle the exception or redirect to an error page
            return "error";
        }
	}
	
	@GetMapping("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
//		pService.deleteProductByID(id);
//		return "redirect:/admin/products";
		
		 try {
	            // Log at ERROR level for critical errors
	            logger.error("Deleting product with ID {}: An error occurred during product deletion");

	            // Log at WARN level for potential issues or warnings
	            logger.warn("Deleting product with ID {}: This is a warning message");

	            // Log at INFO level for general information
	            logger.info("Deleting product with ID {}: Product deletion started");

	            // Log at DEBUG level for detailed debugging information
	            logger.debug("Deleting product with ID {}: Debug information for product deletion");

	            // Delete the product by ID
	            pService.deleteProductByID(id);

	            // Log at INFO level to indicate successful deletion
	            logger.info("Deleting product with ID {}: Product deleted successfully");

	            return "redirect:/admin/products";
	        } catch (Exception e) {
	            // Log at ERROR level for exceptions
	            logger.error("Error while deleting product with ID " + id, e);
	            // Handle the exception or redirect to an error page
	            return "error";
	        }
	}
	
	
	
	
	
}
