package com.fswallow

class BookReview {

String book
Date dateMade
String student
String review
 

    static constraints = {

book blank:false, nullable:false
dateMade blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false, maxSize:5000





    }
}
