package model;

import java.sql.Date;
import java.util.Map;

public class Image {
	private String path;
	private String filename;
	private String caption;
	private int width;
	private int height;
	private Map<String, Integer> tags;
	private Date dateSubmitted;
	
	@Override
	public String toString() {
		return "Image [path=" + path + ", filename=" + filename + ", caption=" + caption + ", width=" + width
				+ ", height=" + height + ", tags=" + tags + ", dateSubmitted=" + dateSubmitted + "]";
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Map<String, Integer> getTags() {
		return tags;
	}
	public void setTags(Map<String, Integer> tags) {
		this.tags = tags;
	}
	public Date getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
}
