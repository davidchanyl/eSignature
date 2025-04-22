package com.eSign;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class claimFormController {

    @GetMapping(value = "/ClaimForm")
    public ModelAndView pdfform(Model model) {

        ModelAndView mav = new ModelAndView("claimFormEC");
        model.addAttribute("titleName", "Employee Compemsation Claim Form");

        return mav;
    }

}

