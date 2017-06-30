<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="controller.ImageController"%>
<%
  ImageController im = new ImageController();
 /*   List<Image> images = im.getAllImages(); */ /* add getJSON method to imagecontroller? */
  //use servlet
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AMG Art</title>
	<link rel="shortcut icon" href="favicon.ico"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="javascript/plugins/PhotoSwipe-master/dist/photoswipe.css">
	<link rel="stylesheet" href="javascript/plugins/PhotoSwipe-master/dist/default-skin/default-skin.css">
	
	<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="javascript/plugins/PhotoSwipe-master/dist/photoswipe.min.js"></script> 
	<script src="javascript/plugins/PhotoSwipe-master/dist/photoswipe-ui-default.min.js"></script>
	<script src="javascript/site.js"></script>
	<style type="text/css">
		header{
		
		}
		main{
			
		}
		header{
			background-color: aliceblue;
		}
		.gallery {
			width: 100%;
			float: left;
		}
		.gallery img{
			max-width: 300px
		}
		#search:focus{
			box-shadow: none;
			border-color: #17b98b;
		}
		@media (max-width: 480px) {
			header{
				text-align: center;
			}
			.navbar-brand{
				float: none;
			}
		}
	</style>
	<script type="text/javascript">
	$( document ).ready(function() {
		initPhotoSwipeFromDOM('.gallery');
	});
	</script>
</head>
<body>
	<%@include file="WEB-INF/pages/header.html" %>
	<section class="container">
		<main>
			<h4>This is the main content of this site</h4>
			<div class="gallery">
			    <figure>
				      <a href="https://farm3.staticflickr.com/2567/5697107145_a4c2eaa0cd_o.jpg" data-size="1024x1024">
				          <img src="https://farm3.staticflickr.com/2567/5697107145_3c27ff3cd1_m.jpg" alt="Image description" />
				      </a>
				     <figcaption>Image caption  1</figcaption>                                 
			    </figure>
			    <figure>
				      <a href="images/gallery/sample.jpg" data-size="717x478">
				          <img src="images/gallery/sample.jpg" alt="Image description" />
				      </a>
				      <figcaption>Image caption 2</figcaption>
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
	</section>
</body>
</html>