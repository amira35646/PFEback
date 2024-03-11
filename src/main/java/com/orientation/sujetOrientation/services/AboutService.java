package com.orientation.sujetOrientation.services;

import com.orientation.sujetOrientation.models.AboutModel;

public interface AboutService {
	public AboutModel getAbout(long id);
	public AboutModel updateAbout(AboutModel about);
	public AboutModel addAbout(AboutModel about);

}
