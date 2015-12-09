<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Duck Tales Cinema</title>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
        <link rel="stylesheet" type="text/css" href="static/css/style1.css" />
        <link rel="stylesheet" href="static/css/jquery-ui-themes.css">
        <script type="text/javascript" src="static/js/crawler.js"></script>
        <link rel="stylesheet" type="text/css" href="static/css/popup.css"/>
        <script src="static/js/popup.js"></script>
    </head>
    <body>
    <header>

<<<<<<< HEAD
        <div id="marquee">
            <c:forEach items="${films}" var="film">
                <img src="data:image/jpeg;base64,${film.poster}"  width="200" height="250"/>
            </c:forEach>
            <!-- <a href="film.html"><img src="static/pics/p1.jpg" /></a>
        <img src="static/pics/p2.jpg" />
        <img src="static/pics/p3.png" />
        <img src="static/pics/p11.jpg" />
        <img src="static/pics/p22.jpg" />
        <img src="static/pics/p33.png" /> -->
        </div>
        <script type="text/javascript">
            marqueeInit({
                uniqueid: 'marquee',
                inc: 15,
                mouse: 'cursor driven',
                moveatleast: 2,
                savedirection: true,
                random: false
=======
<div id="marquee">
    <c:forEach items="${films}" var="film">
        <%--<a href="<c:url value='#' />">--%>
        <img src="data:image/jpeg;base64,${film.poster}" width="200" height="250"/>
        <%--</a>--%>

    </c:forEach>

</div>



<script type="text/javascript">
marqueeInit({

	uniqueid: 'marquee',
	inc: 15,
	mouse: 'cursor driven',
	moveatleast: 2,
	savedirection: true,
	random: false

});
</script>
</header>
>>>>>>> origin/master

            });
        </script>
    </header>

    <p>DuckTales Cinema</p>

    <div class="center-block" id="gallery">
        <c:forEach items="${films}" var="film">
            <div class="booking">
                <a href="htmlOther/film.html"><img src="data:image/jpeg;base64,${film.poster}"  width="200" height="250" alt="movie" class="bubbles" title="Wanna see more? Just click!"/></a>
                <a href="#"><p class="mini">Buy/Book</p></a>
            </div>
        </c:forEach>
        <!--<div class="booking">
            <a href="htmlOther/film.html"> <img src="static/pics/img1.jpeg" alt="movie" class="bubbles" title="Wanna see more? Just click!"/></a>
            <a href="htmlOther/booking.html"><p class="mini">Buy/Book</p></a>
        </div>

        <div class="booking">
            <a href="htmlOther/film.html"> <img src="static/pics/img1.jpeg" alt="movie" class="bubbles" title="Wanna see more? Just click!"/></a>
            <a href="htmlOther/booking.html"><p class="mini">Buy/Book</p></a>
        </div>

        <div class="booking">
            <a href="htmlOther/film.html"> <img src="static/pics/img1.jpeg" alt="movie" class="bubbles" title="Wanna see more? Just click!"/></a>
            <a href="htmlOther/booking.html"><p class="mini">Buy/Book</p></a>
        </div>
        -->
    </div>
    <div class="popup1">
        <div class="bg"></div>
        <div class="container">
            <input type="button" class="close" value="x" />
            <div class="content">
                <div class="film">
                    <h1>${film.title}</h1>

                </div>

                <p> 
                <div id="dropboxSchedule">
                    <form:form action="${url}" method="POST" modelAttribute="">
                    <table>
                        <tr><td>Choose the cinema:</td><td>
                                <form:select path="cinema">
                                    <form:option value="Lublin" label="Select"/>
                                </form:select></td></tr>
                        <tr><td>Date:</td><td><form:select path="date">
                                    <form:options items="${date}" itemLabel="movieDate"/>
                                </form:select></td></tr>
                        <tr><td>Hour:</td><td><form:select path="hour">
                                    <form:options items="${hour}" itemLabel="movieHour"/>
                                </form:select></td></tr>
                        <tr><td>Row:</td><td><form:select path="row">
                                    <form:options items="${row}" itemLabel="row"/>
                                </form:select></td></tr>
                        <tr><td>Seat:</td><td><form:select path="seat">
                                    <form:options items="${seat}" itemLabel="seat"/>
                                </form:select></td></tr>
                    </table>
                        <input type="submit" value="Next"/>
                </form:form>
                </div>
                <!--<div class="popup2">
                    <h1>
                        SEAT RESERVATION
                    </h1>
                    <div class="data">
                        
                    </div>
                    <div class="seatChoose">
                        
                    </div>
                    <button name="back">Back</button>
                </div> -->
            </div>
        </div>
    </div>

    <script>
        $("body").append('<div id="bub"></div>');


        $(".bubbles").mousemove(function (event) {
            $("#bub").html($(this).attr('title'));
            $("#bub").css("top", event.pageX + 20).css("left", event.pageY + 20);
            $("#bub").show();
            return false;
        });
        $(".bubbles").mouseout(function () {
            $("#bub").hide();
        });
    </script>

    <div class="tab-panels">
        <ul class="tabs">
            <li rel="panel1" class="active">About Cinema</li>
            <li rel="panel2">Contact</li>
            <li rel="panel3">For admin</li>
        </ul>

        <div id="panel1" class="panel active">
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat<br/>
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat<br/>
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat<br/>
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat<br/>
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat<br/>
        </div>
        <div id="panel2" class="panel">
            Open:<br/>
            Monday-Sunday: 9.00-24.00<br/>
            <br/>
            E-mail address: dtcinema@gmail.com<br/>
            Phone number: (81)12-34-567<br/>
        </div>
        <div id="panel3" class="panel">
            To log in to admin panel click <a href="<c:url value='/admin' />">HERE</a>.
        </div>
    </div>
    <br>
    <br>

    <script>
        $(document).ready(function () {

            $("#panel").hide();
            $("#login").click(function () {
                $("#panel").slideToggle(500);
            });

        });
    </script>

    <script>
        $(function () {

            $('.tab-panels .tabs li').on('click', function () {

                var $panel = $(this).closest('.tab-panels');

                $panel.find('.tabs li.active').removeClass('active');
                $(this).addClass('active');


                var panelToShow = $(this).attr('rel');

                $panel.find('.panel.active').slideUp(300, showNextPanel);


                function showNextPanel() {
                    $(this).removeClass('active');

                    $('#' + panelToShow).slideDown(300, function () {
                        $(this).addClass('active');
                    });
                }
            });


<<<<<<< HEAD
        });
    </script>
    <!--
        Greeting : ${greeting}
        This is a index page.
    -->
=======

>>>>>>> origin/master
</body>
</html>


