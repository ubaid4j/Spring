//global variables
var localArr = new Array();
localArr.push("green");
localArr.push("yellow");
localArr.push("orange")
localArr.push("blue");


window.onload = function()
{
    app();
}

function app()
{
    console.log("Java Script is loaded");
}

function changeColor()
{
    document.body.style.background = localArr[Math.floor((Math.random() * 3))];
}