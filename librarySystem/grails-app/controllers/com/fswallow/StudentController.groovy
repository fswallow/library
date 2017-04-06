package com.fswallow

class StudentController {

    def scaffold = Student


def theStuArea(){
render view:'students'
}




def advSearch(){
}


def advResults(){
  def studentProps=Student.metaClass.properties*.name
  def students=Student.withCriteria{
      "${params.queryType}"{
         params.each {field,value->
          if(studentProps.grep(field)&&value){
           ilike(field,value)
}
}
}
}
[students : students]
}






def login(){

}

def validate(){

def stuUser = Student.findByUsername(params.username)

if(stuUser && stuUser.password==params.password){

session.stuUser=stuUser
render view:'home'

}

else{
    flash.message="Invalid username and password."

 render view:'login'

}
}

def logout={
  session.stuUser=null
  redirect(uri:'/')
}



}
