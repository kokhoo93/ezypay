package com.example.ezypay.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ezypay.model.Subscription;
import com.example.ezypay.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{

	@Override
	public Subscription createSubs(Subscription subs) throws ParseException {
		Subscription createdSubs = new Subscription();
		List<String> dates = new ArrayList<String>();
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    calendar.setTime(format.parse(subs.getStartDate()));
		createdSubs.setAmount(subs.getAmount());
		createdSubs.setSubsType(subs.getSubsType());
		
		switch(subs.getSubsType()) {
			case "DAILY":
				while (calendar.getTime().before(format.parse(subs.getEndDate())))
			    {
			        Date result = calendar.getTime();
			        dates.add(format.format(result));
			        calendar.add(Calendar.DATE, 1);
			    }
				break;
			
			case "WEEKLY":
				while (calendar.getTime().before(format.parse(subs.getEndDate())))
				{
					if(calendar.get(Calendar.DAY_OF_WEEK) == subs.getDayOfWeek()) {
						Date result = calendar.getTime();
				        dates.add(format.format(result));
					}
					calendar.add(Calendar.DATE, 1);
				}
				break;
				
			case "MONTHLY":
				while (calendar.getTime().before(format.parse(subs.getEndDate())))
				{
					if(calendar.get(Calendar.DAY_OF_MONTH) == subs.getDayOfMonth()) {
						Date result = calendar.getTime();
				        dates.add(format.format(result));
					}
					calendar.add(Calendar.DATE, 1);
				}
				break;
		}
		createdSubs.setInvoiceDates(dates);
		
		return createdSubs;
	}

}
