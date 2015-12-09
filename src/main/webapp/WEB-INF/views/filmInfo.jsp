<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Black Cat, White Cat</title>
    <link rel="stylesheet" type="text/css" href="style1.css"/>
</head>
<body>

<div class="img_film">
    <img src="data:image/jpeg;base64,${film.poster}" width="200" height="250"/>
</div>

<div class="film_title">
    ${film.title}
</div>

<div class="trailer">

    <iframe width="640" height="480" src="${film.linkTrailer}" frameborder="0"
            allowfullscreen></iframe>

</div>

<div class="description">

    ${film.description}
</div>

<div class="booking" class="center-block">
    <a href="/book"><p class="mini">Buy/Book</p></a>
</div>


</body>
</html>