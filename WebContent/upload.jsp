<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/upload.css">
    <title>Upload riassunti - BriefSpace</title>
</head>
<body>
<div id="center">

    <%@include file="header.jsp"%>

    <div id="upload-centrale">
        Grazie per aver deciso di aiutare altri ragazzi nello studio della tua disciplina e di collaborare a migliorare la nostra piattaforma
        permettendo sempre a più persone......


        <form action="UploadServlet" method="POST" enctype="multipart/form-data">
            <div class=input-class">
                Inserisci nome del corso
                <input name="nome_corso">
            </div>
            <div class="input-class">
                Scegli università
                <select id="select-uni">

                </select>
            </div>
            <div class="input-class">
                Scegli Corso di Laurea
                <select id="select-corso">

                </select>
            </div>
            
            <div class="input-class">
            	Scegli il file: <input type="file" name="fileName">
            </div>
            
            <input type="submit">
        </form>
    </div>

<%
Boolean caricamento = (Boolean) session.getAttribute("caricamento_completato");
if(caricamento!=null && caricamento) {
	%> <h2>Il caricamento è andato a buon fine</h2> <%
}
else if(caricamento!=null && !caricamento) {
	%> <h2>Il caricamento dei file non è riuscito</h2> <%
}
session.removeAttribute("caricamento_completato");
%>

</div>

<script src="script/select_script.js"></script>

<%@include file="footer.jsp"%>

</body>
</html>