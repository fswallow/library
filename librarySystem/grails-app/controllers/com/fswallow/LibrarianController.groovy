package com.fswallow

class LibrarianController {

    def scaffold = Librarian


def theLibArea(){
render view:'librarian'
}


























def login(){

}

def validate(){

def libUser = Librarian.findByUsername(params.username)

if(libUser && libUser.password==params.password){

session.libUser=libUser
render view:'home'

}

else{
    flash.message="Invalid username and password."

 render view:'login'

}
}

def logout={
  session.libUser=null
  redirect(uri:'/')
}
}
