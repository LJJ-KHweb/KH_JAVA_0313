package com.kh.chap07.service;

import com.kh.chap07.model.vo.Ticket;

public class TicketService {
	private int ticketCount;
	/*
	 * private Ticket firstTicket; private Ticket secondTicket; private Ticket
	 * thirdTicket;
	 */
	private final static int MAX_PEOPLE_NUM = 3;
	private Ticket[] tickets = new Ticket[MAX_PEOPLE_NUM];
	

	public int getTicketCount() {
		return ticketCount;
	}

	public int saveTicket(Ticket ticket) {
		/*
		 * if (ticketCount < 3) { if (firstTicket == null) { firstTicket = ticket; }
		 * else if (secondTicket == null) { secondTicket = ticket; } else if
		 * (thirdTicket == null) { thirdTicket = ticket; } ticketCount++; return 1; }
		 */
		for(int i = 0; i < tickets.length ; i++) {
			if(tickets[i] == null) {
				tickets[i] = ticket;
				return 1;
			}
		}
		
		
		return 0;

	}

	public Ticket printTicket() {
		Ticket ticket;
		/*
		 * if(firstTicket != null) { ticket = firstTicket; firstTicket = null; return
		 * ticket; } else if( secondTicket != null) { ticket = secondTicket;
		 * secondTicket = null; return ticket; }else if(thirdTicket != null){ ticket =
		 * thirdTicket; thirdTicket = null; return ticket; }
		 */
		for(int i = 0; i < tickets.length ; i++) {
			if(tickets[i] != null) {
				ticket = tickets[i];
				tickets[i] = null;
				return ticket;
			}
		}
		return null;
	}
	public Ticket[] findAll() {
		return tickets;
	}

}
