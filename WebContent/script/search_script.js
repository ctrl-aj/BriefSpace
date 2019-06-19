function readTextFile(file,ul_id) {
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function ()
    {
        if(rawFile.readyState === 4)
        {
            console.log(rawFile.status);
            if(rawFile.status === 200 || rawFile.status === 0)

            {
                console.log("Sei in readystate");
                var allText = rawFile.responseText;
                var arrayElem = [];
                console.log(ul_id);
                var ul = document.getElementById(ul_id);
                console.log(ul);
                arrayElem = allText.split("\n");
                for(var i = 0;i<arrayElem.length;i++) {

                    var newItem = document.createElement("LI");
                    var new_a = document.createElement("a");
                    new_a.innerHTML = arrayElem[i];
                    new_a.href = arrayElem[i];
                    //newItem.appendChild(textNode);
                    newItem.append(new_a);
                    ul.insertBefore(newItem,ul.childNodes[0]);
                }
            }
        }
    }
    rawFile.send(null);
}

readTextFile("http://localhost:8080/briefSpace/file/elenco_uni.txt","uni-elenco");
readTextFile("http://localhost:8080/briefSpace/file/elenco_lauree.txt","lauree-elenco");

function searchUni() {

    var input,filter,ul,li;
    input = document.getElementById("search-uni");
    filter = input.value.toUpperCase(),
    ul = document.getElementById("uni-elenco");
    li = ul.getElementsByTagName("li");

    for(var i = 0;i<li.length;i++) {
        if(li[i].innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        }
        else {
            li[i].style.display = "none";
        }
    }

}

function searchLaurea() {

    var input,filter,ul,li;
    input = document.getElementById("search-lauree");
    filter = input.value.toUpperCase(),
    ul = document.getElementById("lauree-elenco");
    li = ul.getElementsByTagName("li");

    for(var i = 0;i<li.length;i++) {
        if(li[i].innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        }
        else {
            li[i].style.display = "none";
        }
    }

}