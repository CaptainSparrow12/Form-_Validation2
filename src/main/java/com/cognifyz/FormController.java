package com.cognifyz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class FormController {
	
	@GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "index";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("formData") @Valid FormData formData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "welcome";
        }

        TemporaryStorage.addFormData(formData);
        model.addAttribute("formData", formData);

        // Redirect or return a success page
        model.addAttribute("success", "Form submitted successfully!");
        return "welcome";
        
    }

}
