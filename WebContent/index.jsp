<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="css/index.css">
  <title>BriefSpace - Home</title>
</head>
<body>
<div id="center">

  <%@include file="header.jsp"%>

  <div id="presentazione">
    <div id="logo"><img src="img/logo/briefspace-cutted.png"></div>

    <div class="center-box">
      <a href="elenco.jsp"><img src="img/utility/download-icon2.png"></a>
      <p>Scarica riassunti pubblicati dagli utenti</p>
    </div>

    <div class="center-box">
      <a href="upload.jsp"><img src="img/utility/upload-icon2.png"></a>
      <p>Aggiungi i tuoi riassunti al nostro catalogo, aiuta gli altri studenti nello studio</p>
    </div>
  </div>



</div>

<%@include file="footer.jsp"%>

</body>
</html>