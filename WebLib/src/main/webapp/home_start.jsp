<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Responsive Sidebar Deshboard Template</title>
        <link rel="stylesheet" href="home.css">
        <!--<link rel="stylesheet" href="css/font-awesome.css" type="text/css">-->
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js" charset="utf-8"></script>
    </head>
    <body>

        <input type="checkbox" id="check_sidebar">
        <header>
            <div class="header_area">
                <h3>Web<span>Lib</span></h3>
                <label for="check_sidebar">
                    <i class="fas fa-bars" id="sidebar_btn"></i>
                </label>
                <a href="signin.html" class="sign_in_btn">Sign in</a>
                <a href="sidebarmenu.html" class="sign_up_btn">Sign up</a>
                <div class="search_box">
                    <input class="search_txt" type="text" name="" placeholder="Type to search">
                    <a class="search_btn" href="#">
                        <i class="fa fa-search"></i>
                    </a>
                </div>
            </div>
        </header>



        <div class="mobile_nav">
            <div class="nav_bar">
                <!--<img src="background.png" class="mobile_profile_image" alt="">-->
                <i class="fa fa-bars nav_btn"></i>
            </div>
            <div class="mobile_nav_items">
                <a value = "Reader_BD" href="home.html"><i class="fas fa-home"></i><span>Home</span></a>
                <a href="#"><i class="far fa-question-circle"></i><span>About</span></a>
                <a href="#"><i class="fas fa-sliders-h"></i><span>Services</span></a>
			    <a href="#"><i class="fas fa-stream"></i><span>Overview</span></a>
			    <a href="#"><i class="fas fa-envelope"></i><span>Contact</span></a>


            </div>
        </div>



        <div class="sidebar">
        <form action = "My_servlet">
            <a href="home.html"><i class="fas fa-home"></i><span>Home</span></a>
            
            <button value = "Book_BD_new" name = "act" ><div id="sidebar_button"><i class="far fa-question-circle"></i><span>About</span></div></button>
           <br></form>
            <button><div id="sidebar_button"><i class="fas fa-sliders-h"></i><span>Services</span></div></button>
			<br>
			<button><div id="sidebar_button"><i class="fas fa-stream"></i><span>Overview</span></div></button>
			<br>
			<button><div id="sidebar_button"><i class="fas fa-envelope"></i><span>Contact</span><div></button>
        </div>
        <div class="content">
            <div id="content1"></div>
            <div class="content2">
                <div class="card_name">
                    <p>Book<span>Sharing</span></p>
                </div>
                <div class="card1">
     