package site;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import controller.ImageController;
import model.Image;

public class testImage {
	
	ImageController ic = new ImageController();
	Image im = new Image();
	
	@Test
	public void image() {
		//webapp works. resources can't read file
		//should use resources to prevent unwanted images from being scraped by client
		File file = new File("src/main/webapp/images/gallery/sample.jpg");
		BufferedImage img = null;
        try {
			img = ImageIO.read(file);
	        Image image = new Image();
	        image.setFilename(file.getName());
	        image.setWidth(img.getWidth());
	        image.setHeight(img.getHeight());
	        image.setPath(file.getPath());
	        System.out.println(image.toString());
	        //store path in db for use with caption?
        } catch (IOException e) {
			e.printStackTrace();
		}
		
        
//		im.setPath("src/main/webapp/images/gallery/sample.jpg"); //path is correct
//		im.setFilename("");
//		im.setHeight(0);
//		im.setWidth(0);
//		im.setCaption("");
	    
		
		//assertNotNull(file);
		//System.out.println(file.exists());
        
	}
	
}
