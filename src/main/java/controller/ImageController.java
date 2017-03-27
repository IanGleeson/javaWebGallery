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
	public List<Image> randomizeImages (int numberToGet) {
		List<Image> images = getAllImages();
		List<Image> randomizedImages = new ArrayList<Image>();
		for (int i = 0; i < numberToGet; i++) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(images.size());
			Image image = images.get(randomNumber); //replace with for loop? / could be improved 
			randomizedImages.add(image);
		}	
		return randomizedImages;
	}
	
	/**
	 * Adds an image to the server.
	 *
	 * @param image The image to add.
	 * @return True if successful.
	 */
	public boolean addImage (File file) {
		if (dir.isDirectory()) {
			//check if file has same name
			BufferedImage img = null;
			String filename = file.getName();
			String fileExtension = "";
            int i = filename.lastIndexOf('.');
            if (i >= 0) {
                fileExtension = filename.substring(i+1);
                if(fileExtension.equalsIgnoreCase("jpg")){
                	try {
                        img = ImageIO.read(file);
                        File outputfile = new File("resources/images/gallery/" + filename);
            			ImageIO.write(img, fileExtension, outputfile);
                    } catch (final IOException e) {
                        // could not read image
                    	//return e.getMessage();
                    }
                }
            }
        }
		return true;
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
}
