package com.spring.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name="cust_tb")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String boardloc;
	@Column
	private String destloc;
	
	
	@OneToOne(targetEntity= Booking.class, cascade = CascadeType.ALL)

	private Booking booking;
	
	
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Customer() {
		super();
	}

	public Customer(int id, String name, String boardloc, String destloc) {
		super();
		this.id = id;
		this.name = name;
		this.boardloc = boardloc;
		this.destloc = destloc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoardloc() {
		return boardloc;
	}

	public void setBoardloc(String boardloc) {
		this.boardloc = boardloc;
	}

	public String getDestloc() {
		return destloc;
	}

	public void setDestloc(String destloc) {
		this.destloc = destloc;
	}

	
	
	
	

	
}
