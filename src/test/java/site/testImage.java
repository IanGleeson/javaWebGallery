package site;

import static org.junit.Assert.*;

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
