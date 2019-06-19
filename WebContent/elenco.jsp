<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/elenco.css">
    <title>Elenco - BriefSpace</title>
</head>
<body>
<div id="center">

    <%@include file="header.jsp"%>

    <div class="search-box">

        <input type="text" id="search-uni" onkeyup="searchUni()" placeholder="Inserisci Nome Università Da Cercare">

        <ul id="uni-elenco">

        </ul>

    </div>

    <div class="search-box">

        <input type="text" id="search-lauree" onkeyup="searchLaurea()" placeholder="Inserisci Corso di Laurea da Cercare">

        <ul id="lauree-elenco">

        </ul>

    </div>


</div>

<%@include file="footer.jsp"%>

<script src="script/search_script.js"></script>

</body>
</html>
