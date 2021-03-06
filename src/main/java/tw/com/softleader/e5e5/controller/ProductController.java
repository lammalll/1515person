package tw.com.softleader.e5e5.controller;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.sym.Name;

import tw.com.softleader.e5e5.dao.ProductCategoryDao;
import tw.com.softleader.e5e5.entity.Chat;
import tw.com.softleader.e5e5.entity.Product;
import tw.com.softleader.e5e5.entity.ProductCategory;
import tw.com.softleader.e5e5.entity.User;
import tw.com.softleader.e5e5.service.ProductService;

@Controller
@RequestMapping(value = "/products")

@Service
public class ProductController {

	@Autowired
	public ProductService productService;

	@RequestMapping(value = "/list") // ** /products/list
	public String list(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "/product/list";
	}

	@RequestMapping(value = "/query")
	public String query(Model model, @RequestParam("pKeywords") String name) {
		List<Product> products = productService.getAllByKeywords(name);
		model.addAttribute("products", products);
		return "/product/list";
	}

	@RequestMapping(value = "/delete")
	public String delete(Model model, @ModelAttribute Product product) {
		productService.deleteById(product.getId());
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "/product/list";
	}

	@RequestMapping(value = "/add")
	public String add(Model model) {
		return "/product/add";
	}

	@RequestMapping(value = "/insert")
	public String insert(Model model, @ModelAttribute Product product, @RequestParam("pCategory") int pCategory) {
		int number = productService.insert(product.getName(), pCategory, product.getDeadline(), product.getLocation(), product.getTradeWay(), product.getWishItem());
		if(number == 1){
			model.addAttribute("result", "新增成功");
		}else{
			model.addAttribute("result", "新增失敗");
		}
		return "/product/add";
	}

	@RequestMapping(value = "/edit")
	public String edit(Model model, @ModelAttribute Product product) {
		Product products = productService.getOneById(product.getId());
		model.addAttribute("p", products);
		return "/product/edit";
	}

	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam("pId") Integer id, @RequestParam("pPS") char postStatus) {
		Product products = productService.update(id, postStatus);
		model.addAttribute("p", products);
		return "/product/edit";
	}

}
