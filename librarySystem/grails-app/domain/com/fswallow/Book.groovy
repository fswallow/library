package com.fswallow

class Book {

String title
String subject
String author
String isbn
String dateBorrowed
String returnDate
String student
boolean overdue






    static constraints = {

title blank:false, nullable:false
subject blank:false, nullable:false
author blank:false, nullable:false
isbn blank:false, nullable:false
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
student blank:false, nullable:false
overdue blank:false, nullable:false



    }
}
