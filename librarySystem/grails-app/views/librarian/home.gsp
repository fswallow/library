<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <assest:stylesheet src="home.css"/>
</head>
<body>
<a href="main.gsp" onclick="javascript:window.history.back();">Back</a> 

    <div id="content" role="main">
    <div class="row">
    <div class="first">




         <h3>Student Management</h3>

     <p>Here you are able to create add and register students</p>

          <button type="button" class="btn btn-success">
          
            <g:link controller="student" action="create">student manager</g:link>
         </button>
    </div>
  

   
      <div class="second">

         <h3>Book Management</h3>

     <p>Here you are able to create and add books</p>

          <button type="button" class="btn btn-success">
          
            <g:link controller="book" action="create">Book manager</g:link>
         </button>
    </div>

<div class="first">

         <h3>Course Management</h3>

     <p>Here you are able to create courses and add course details</p>

          <button type="button" class="btn btn-success">
          
            <g:link controller="course" action="create">Course manager</g:link>
         </button>
    </div>


   <div class="second">

         <h3>librarian Management</h3>

     <p>Here you are able to create add and register students</p>

          <button type="button" class="btn btn-success">
          
            <g:link controller="librarian" action="create">librarian manager</g:link>
         </button>
    </div>

 <div class="second">

         

     <h3>Student Search</h3>

          <button type="button" class="btn btn-success">
          
            <g:link controller="student" action="advSearch">student search</g:link>
         </button>
    </div>

</div
</div>
</body>
</html>






