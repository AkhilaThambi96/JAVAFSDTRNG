/**
 * 
 */

const array1 = ["cecilie","lone"];
const array2 = ["Tobias","Emil"];
const array3 = ["Robin","Morgan"];

const myChildren = array1.concat(array2,array3);
document.getElementById("demo").innerHTML = myChildren;


const fruits = ["banana","orange","Apple","Mango"];
document.getElementById("demo1").innerHTML = fruits;
fruits.shift();
document.getElementById("demo2").innerHTML = fruits;
