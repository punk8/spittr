package com.punk.spitter.web;

import com.punk.spitter.Spittle;
import com.punk.spitter.data.SpittleRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);

    private SpittleRepository spittleRepository;


    @Autowired //注入repository
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model){ //model实际上是一个map 会被传入视图中 所传的视图为spittles
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));
//        return "spittles";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam("max") long max,
            @RequestParam("count") int count
    ){
        return spittleRepository.findSpittles(max,count);
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showSpittle(
            @RequestParam("spittle_id") long spittleId,
            Model model
    ){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(value = "/{spittleId}",method = RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") long spittleId,
            Model model
    ){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }




}
