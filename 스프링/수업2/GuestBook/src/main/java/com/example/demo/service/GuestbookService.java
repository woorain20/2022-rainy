package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Guestbook;

public interface GuestbookService {

	public static final Integer LIMIT=5;
	public List<Guestbook> getGuestbooks(Integer page);
	public void deleteGuestbook(Long id, String ip);
	public Guestbook putGuestbook(Guestbook guestbook, String ip);
	public int getGuestbookSize();
}
