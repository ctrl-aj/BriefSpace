function readTextFile(file,select_id) {
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function ()
    {
        if(rawFile.readyState === 4)
        {        	
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var selectElement = document.getElementById(select_id);
                var allText = rawFile.responseText;
                var arrayElem = [];
                arrayElem = allText.split("\n");
                for(var i = 0;i<arrayElem.length;i++) {

                    var opt = document.createElement("option");
                    opt.text=arrayElem[i];
                    opt.value=arrayElem[i];
                    selectElement.add(opt);
                    
                }
            }
        }
    }
    rawFile.send(null);
}

readTextFile("http://localhost:8080/briefSpace/file/elenco_uni.txt","select-uni");
readTextFile("http://localhost:8080/briefSpace/file/elenco_lauree.txt","select-corso");