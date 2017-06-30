package site;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import controller.ImageController;
import model.Image;

public class testImage {
	
	//ImageController ic = new ImageController();
	//Image im = new Image();
	
	@Test
	public void image() {
		File file = new File("src/main/resources/images/gallery/sample2.jpg");
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
	}
	
}
