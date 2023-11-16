package com.ra.controller;

import com.ra.model.Product;
import com.ra.service.ProductServiceIpm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/product")
public class ProductController {
    ProductServiceIpm productServiceIpm = new ProductServiceIpm();


    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("product", productServiceIpm.findAll());
        return "product";
    }


    @GetMapping("/add")
    public String add(Model model) {
        Product product1 = new Product();
        model.addAttribute("product", product1);
        return "product-add";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Product product) {
        productServiceIpm.save(product);
        return "redirect:/product";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productServiceIpm.delete(id);
        return "redirect:/product";
    }


    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Product product = productServiceIpm.findId(id);
        model.addAttribute("product", product);
        return "product-edit";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("product") Product product) {
        productServiceIpm.save(product);

        return "redirect:/product";
    }

    @RequestMapping("/update")
    public String update(@ModelAttribute("product") Product product) {
        productServiceIpm.update(product, product.getId());

        return "redirect:/product";
    }


}
