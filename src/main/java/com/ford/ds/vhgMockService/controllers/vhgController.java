package com.ford.ds.vhgMockService.controllers;

import com.ford.ds.service.vhgService;
import com.ford.ds.vhgMockService.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class vhgController {

    @Autowired
    vhgService vhgService1;

    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<Response> sayHello() {
        Response response = new Response();
        response.setMessage("hai");
        vhgService1.printServiceName();

        return new ResponseEntity<>( response, HttpStatus.OK);
    }
}
