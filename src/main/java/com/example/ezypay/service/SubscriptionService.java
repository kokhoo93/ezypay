package com.example.ezypay.service;

import java.text.ParseException;

import com.example.ezypay.model.Subscription;

public interface SubscriptionService {
	public Subscription createSubs(Subscription subs) throws ParseException;
}
