<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <assest:stylesheet src="home.css"/>
</head>
<body>


    <div id="content" role="main">
    <div class="row">
    <div class="first">

         <h3>Create Reviews<h3>

     <p>Here you are create a review for a book</p>

          <button type="button" class="btn btn-success">
         
           <g:link controller="bookReview" action="create">Reviews creator</g:link>
          </button>
          <button type="button" class="btn btn-success">
            <g:link controller="bookReview" action="index">Reviews</g:link>

         </button>
    </div>
   
   
      <div class="second">

         <h3>Book Viewer<h3>

     <p>Here you are able to see the books within the library</p>

          <button type="button" class="btn btn-success">
          
            <g:link controller="book" action="index">Library book listings</g:link>
         </button>
    </div>

  <h3>book Search</h3>

          <button type="button" class="btn btn-success">
          
            <g:link controller="book" action="advSearch">book search</g:link>
         </button>
    </div>


</div
</div>
</body>
</html>
