function clock(){
	let element=document.createElement("h3")
	element.setAttribute("id","horavalor")
	document.body.appendChild(element);
	
	setInterval(()=>{
		let hora = new Date().toloctoLocaleDateString();
		document.getElementById("horavalor").innerHTML=hora
	},1000)
}