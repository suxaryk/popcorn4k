<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Popcorn4K</title>

    <link rel="stylesheet" type="text/css" href="/static/css/style1.css"/>
    <link rel="stylesheet" href="/static/css/jquery-ui-themes.css">
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="/static/js/crawler.js"></script>
</head>
<body>
<header>

    <%--<div id="marquee">--%>
    <%--<c:forEach items="${films}" var="film">--%>
    <%--<a href="<c:url value='#' />">--%>
    <%--<img src="data:image/jpeg;base64,${film.poster}" width="200" height="250"/>--%>
    <%--</a>--%>
    <%--</c:forEach>--%>

    <%--</div>--%>


    <script>
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

<p>Popcorn4K</p>

<div class="center-block" id="gallery">
    <c:forEach items="${films}" var="film">
        <div class="booking">
            <a href="<c:url value='/filmInfo/${film.id}' />">
                <img src="data:image/jpeg;base64,${film.poster}" width="200" height="250"/>
            </a>
            <a href="<c:url value='/buy/${film.id}' />"><p class="mini">Buy/Book</p></a>
        </div>
    </c:forEach>
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
        dolore magna aliquyam erat<br/>
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
    });
</script>


</body>
</html>


