/**
 * 
 */

const points = [30,45,344,456];
document.getElementById("demo").innerHTML = myArrayMin(points);

function myArraymin(arr){
	return Math.min.apply(null,arr);
}