<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="controller.ImageController"%>
<%
  ImageController im = new ImageController();
/*= List<Image> images = im.getAllImages(); */
  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AMG Art</title>
	<link rel="stylesheet" href="javascript/plugins/Photoswip-master/dist/photoswipe.css">
	<link rel="stylesheet" href="javascript/plugins/Photoswip-master/dist/default-skin/default-skin.css"> 
	<script src="javascript/plugins/Photoswip-master/dist/photoswipe.min.js"></script> 
	<script src="javascript/plugins/Photoswip-master/dist/photoswipe-ui-default.min.js"></script>
	<style type="text/css">
		header{
			height: 200px;
			padding: 20px;
			text-align: center;
		}
		
	</style>
	<script type="text/javascript">
		function initGallery(){
			var pswpElement = document.querySelectorAll('.pswp')[0];
			// build items array
			var imageDetails; //get JSON here
			var items =  new array();
			for (var imageDetail in imageDetails) {
				var item = {
						src: imageDetail.path,
				        w: imageDetail.width,
				        h: imageDetail.height
				};
				items.push(item);
			}
			var options = {
			    index: 0,
			    preload: [1, 2]
			};
			var gallery = new PhotoSwipe( pswpElement, PhotoSwipeUI_Default, items, options);
			gallery.init();
		}
	</script>
</head>

<body>
	<%@include file="header.html" %>
	<main>
		This is the main content of this site
		
		<div class="my-gallery" itemscope itemtype="http://schema.org/ImageGallery">
		    <figure itemprop="associatedMedia" itemscope itemtype="http://schema.org/ImageObject">
			      <a href="https://farm3.staticflickr.com/2567/5697107145_a4c2eaa0cd_o.jpg" itemprop="contentUrl" data-size="1024x1024">
			          <img src="https://farm3.staticflickr.com/2567/5697107145_3c27ff3cd1_m.jpg" itemprop="thumbnail" alt="Image description" />
			      </a>
			     <figcaption itemprop="caption description">Image caption  1</figcaption>                                 
		    </figure>
		    <figure itemprop="associatedMedia" itemscope itemtype="http://schema.org/ImageObject">
			      <a href="https://farm2.staticflickr.com/1043/5186867718_06b2e9e551_b.jpg" itemprop="contentUrl" data-size="964x1024">
			          <img src="https://farm2.staticflickr.com/1043/5186867718_06b2e9e551_m.jpg" itemprop="thumbnail" alt="Image description" />
			      </a>
			      <figcaption itemprop="caption description">Image caption 2</figcaption>
		    </figure>
		</div>
		
		<!-- Root element of PhotoSwipe. Must have class pswp. -->
		<div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">
		    <div class="pswp__bg"></div>
		    <div class="pswp__scroll-wrap">
		        <div class="pswp__container">
		            <div class="pswp__item"></div>
		            <div class="pswp__item"></div>
		            <div class="pswp__item"></div>
		        </div>
		        <div class="pswp__ui pswp__ui--hidden">
		            <div class="pswp__top-bar">
		                <div class="pswp__counter"></div>
		                <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>
		                <button class="pswp__button pswp__button--share" title="Share"></button>
		                <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>
		                <button class="pswp__button pswp__button--zoom" title="Zoom in/out"></button>
		                <div class="pswp__preloader">
		                    <div class="pswp__preloader__icn">
		                      <div class="pswp__preloader__cut">
		                        <div class="pswp__preloader__donut"></div>
		                      </div>
		                    </div>
		                </div>
		            </div>
		            <div class="pswp__share-modal pswp__share-modal--hidden pswp__single-tap">
		                <div class="pswp__share-tooltip"></div> 
		            </div>
		            <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button>
		            <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)"></button>
		            <div class="pswp__caption">
		                <div class="pswp__caption__center"></div>
		            </div>
		        </div>
		    </div>
		</div>
	</main>
	<aside>
		
	</aside>
	<footer>
		This is the footer content of this site
	</footer>
</body>
</html>