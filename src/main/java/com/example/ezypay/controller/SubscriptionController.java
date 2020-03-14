package com.example.ezypay.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ezypay.model.Subscription;
import com.example.ezypay.service.SubscriptionService;

@RestController
public class SubscriptionController {
	@Autowired
	private SubscriptionService subscriptionService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Subscription createSubscription(@RequestBody Subscription subs) throws ParseException {
		return subscriptionService.createSubs(subs);
	}
}
