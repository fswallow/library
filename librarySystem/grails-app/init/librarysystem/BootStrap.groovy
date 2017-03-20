package com.fswallow

class BootStrap {

    def init = { servletContext ->


 def library1=new Library (

 building:'Charles Street',
 address:'Charles Street',
 openingHours:'09:00 - 17:00',
 location:'University',
 studySpaces:'20'

).save()

def lib1 = new Librarian (

name:'Jack Jones',
email:'jjones@gmail.com',
office:'Office 101',
username:'JJones',
password:'password',
telephone:'0123530202',
library: library1

).save()

def cour1= new Course(

title:'Computing',
code:'COMP1',
leader:'peter ONeill',
department:'ACES',
description:'Computing Course',
studyMode:'Full time'

).save()



def stu1= new Student(

name:'Scott Robinson',
email:'srobinson@gmail.com',
username:'SRobinson',
password:'Password',	
studentId:'b032359',
course:cour1,
library:library1
).save()

def stu2= new Student(
name:'Ryan Wiggles',
email:'rwiggles@gmail.com',
username:'rwiggles',
password:'password',
studentId:'b502134',
course:cour1,
library:library1

).save()

def stu3= new Student(
name:'Jack Williams',
email:'jwilliams@gmail.com',
username:'jwilliams',
password:'password',
studentId:'b538299',
course:cour1,
library:library1

).save()


def book1 = new Book(
title:'html for dummies',
subject:'Computing',
author:'Peter Smith',
isbn:'974637284838',
dateBorrowed: new Date('15/03/2017'),
returnDate: new Date('25/03/2017'),
student:stu3,
overdue:false,
library:library1
).save()

def review1 = new BookReview(
book:book1,
dateMade:new Date('15/03/2017'),
student:stu3,
review:'Ok book'
).save()

def review2 = new BookReview(

book:book1,
dateMade:new Date('16/03/2017'),
student:stu1,
review:'very helpful'

).save()




    }
    def destroy = {
    }
}
