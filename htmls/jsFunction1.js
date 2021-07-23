/**
 * 
 */

function myfunction(txt){
	document.getElementById("demo").innerHTML = txt
}



function toCelsius(f){
	return(5/9)*(f-32);
}
document.getElementById("demo1").innerHTML = toCelsius;