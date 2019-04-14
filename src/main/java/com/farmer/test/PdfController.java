package com.farmer.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.farmer.bid.Bid;
import com.farmer.services.BidDaoImpl;

@Controller
public class PdfController {
	@Autowired
	BidDaoImpl bidDaoImpl;
	@RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
    public String downloadExcel(ModelMap model) {
        // create some sample data
        List<Bid> listBids = new ArrayList<Bid>();
        listBids = bidDaoImpl.listBids();
        model.addAttribute("listbids", listBids);
            // return a view which will be resolved by an excel view resolver
        return "generate";
    }
}
