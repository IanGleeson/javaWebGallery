package controller;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import javax.imageio.ImageIO;

import model.Image;

/**
 * @author Ian_G
 *
 */
public class ImageController {
	static final File dir = new File("resources/images/gallery");
    static final String[] EXTENSIONS = new String[]{
        "jpg", "png"
    };
    // filter to identify images based on their extensions
    static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };
    
	public static void main(String[] args) {
		
	}
	
	/**
	 * Randomizes all images.
	 *
	 * @param numberToGet How many Images to get.
	 * @return An array of random Images.
	 */
	public Image[] randomizeImages (int numberToGet) {
		List<Image> images = getAllImages();
		List<Image> randomizedImages = new ArrayList<Image>();
		for (int i = 0; i < numberToGet; i++) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(images.length) + 1;
			Image image = images[randomNumber];
			randomizedImages.add(image);
		}	
		return randomizedImages;
	}
	
	/**
	 * Searches for a specific image
	 *
	 * @param filenameToSearch Filename to search for.
	 * @return An array of Images that contain that filename if found, null if not.
	 */
	public List<Image> searchImage (String filenameToSearch) {
		List<Image> images = getAllImages();
		List<Image> foundImages  = new ArrayList<Image>();
		for (Image image : images) {
			if (filenameToSearch.contains(image.getFilename())){
				foundImages.add(image);
			}
		}
		if(foundImages.isEmpty()){
			return null;
		}else{
			return foundImages;
		}
	}
	
	/**
	 * Gets all Images from the gallery folder.
	 *
	 * @return An ArrayList of Images.
	 */
	public List<Image> getAllImages() {
		List<Image> images = new ArrayList<Image>();
		
		if (dir.isDirectory()) {
            for (final File f : dir.listFiles(IMAGE_FILTER)) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(f);
                    Image image = new Image();
                    image.setFilename(f.getName());
                    image.setWidth(img.getWidth());
                    image.setHeight(img.getHeight());
                    image.setPath(f.getPath());
                    images.add(image);
                } catch (final IOException e) {
                    // could not read image
                	//return e.getMessage();
                }
            }
        }
		if(images.isEmpty()){
			return null;
		}else{
			return images;
		}
	}

	/**
	 * Gets an image.
	 *
	 * @param number number to turn to 0.
	 * @return Description text text text.
	 */
	public Image getImage (int number) {
		
		return null;
	}

}
