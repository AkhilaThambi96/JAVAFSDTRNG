/**
 * 
 */

let str = "please locate where 'locate' occurs!";
document.getElementById("demo").innerHTML = str.indexOf("locate");


function myFunction(){
	let text= document.getElementById("demo2").innerHTML;
	document.getElementById("demo2").innerHTML = text.replace("Microsoft","w3schools");
}




let text1 = "a,b,c,d,e,f";
const myArray = text1.split(",");
document.getElementById("demo3").innerHTML = myArray[0];