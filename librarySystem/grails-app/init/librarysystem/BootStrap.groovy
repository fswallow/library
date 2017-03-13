package com.fswallow

class BootStrap {

    def init = { servletContext ->

 def ShefLibrary=new Library (

 building:'Charles Street',
 address:'Charles Street',
 openingHours:'9-5',
 location:'University',
 studySpaces:'20'

).save()








    }
    def destroy = {
    }
}
