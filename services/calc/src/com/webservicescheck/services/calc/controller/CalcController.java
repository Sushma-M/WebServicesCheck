/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.webservicescheck.services.calc.controller;

import com.webservicescheck.services.calc.services.CalcService;
import com.webservicescheck.services.calc.Add;
import com.webservicescheck.services.calc.AddResponse;
import com.webservicescheck.services.calc.Divide;
import com.webservicescheck.services.calc.DivideResponse;
import com.webservicescheck.services.calc.Multiply;
import com.webservicescheck.services.calc.MultiplyResponse;
import com.webservicescheck.services.calc.Subtract;
import com.webservicescheck.services.calc.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/calc")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@RequestBody Add parameters) {
        return calcService.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public DivideResponse divide(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Divide parameters = new Divide();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calcService.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MultiplyResponse multiply(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Multiply parameters = new Multiply();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calcService.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public SubtractResponse subtract(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Subtract parameters = new Subtract();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calcService.subtract(parameters);
    }
}
