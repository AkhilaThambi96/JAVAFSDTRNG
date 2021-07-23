/**
 * 
 */


function person(first,last,age,eye){
	this.fName = first;
	this.lName = last;
	this.age = age;
	this.eyeColor= eye;
	
}
const myFather = new person("john","doe",50,"blue");
document.getElementById("demo").innerHTML = 
"My Father is" +  myFather.age+".";