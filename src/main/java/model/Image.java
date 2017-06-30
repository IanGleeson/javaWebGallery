package model;

public class Image {
	private String path;
	private String filename;
	private String caption;
	private int width;
	private int height;
	
	@Override
	public String toString() {
		return "Image [path=" + path + ", filename=" + filename + ", caption=" + caption + ", width=" + width
				+ ", height=" + height + "]";
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
}
