package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the slide database table.
 * 
 */
@Entity
@Table(name = "slide")
@NamedQuery(name = "Slide.findAll", query = "SELECT s FROM Slide s")
public class Slide implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slide_id")
	private int slideId;

	@Lob
	@Column(name = "slide_content")
	private String slideContent;

	@Column(name = "slide_image")
	private String slideImage;

	@Column(name = "slide_title")
	private String slideTitle;

	public Slide() {
	}

	public int getSlideId() {
		return this.slideId;
	}

	public void setSlideId(int slideId) {
		this.slideId = slideId;
	}

	public String getSlideContent() {
		return this.slideContent;
	}

	public void setSlideContent(String slideContent) {
		this.slideContent = slideContent;
	}

	public String getSlideImage() {
		return this.slideImage;
	}

	public void setSlideImage(String slideImage) {
		this.slideImage = slideImage;
	}

	public String getSlideTitle() {
		return this.slideTitle;
	}

	public void setSlideTitle(String slideTitle) {
		this.slideTitle = slideTitle;
	}

}