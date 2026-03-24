package com.kh.chap07.controller;

import com.kh.chap07.model.vo.Ticket;
import com.kh.chap07.service.TicketService;

public class TicketController {

	private TicketService ts = new TicketService();
	
	public int saveTicket(Ticket ticket) {
		return ts.saveTicket(ticket);
	}
	
	
	public Ticket printTicket() {
		return ts.printTicket();
	}
	public Ticket[] findAll() {
		return ts.findAll();
	}
}
