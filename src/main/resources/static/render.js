document.addEventListener("DOMContentLoaded", function() {
    var templates = document.getElementsByClassName("dynamic-content");
    var data = {
        title: "Anwendung zum Hochladen von Zusicherungen",
        LoadFile: "Datei hochladen",
        Assurances: "Zusicherungen (XML/JSON)"
    };

    for (var i = 0; i < templates.length; i++) {
        var template = templates[i].innerHTML;
        var renderedHTML = Mustache.render(template, data);
        templates[i].innerHTML = renderedHTML;
    }
});