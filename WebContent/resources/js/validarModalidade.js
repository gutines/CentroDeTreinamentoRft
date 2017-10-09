/**
 * 
 */

function validarPlano(){
	document.getElementById("in-nome-plano");
	alert("Teste JS.");
	
}

function validarTipoDePesquisa(){
	
	var tipoPesquisa = document.getElementById("cbx-tp-pesquisa");
	var valorSelecionado = tipoPesquisa.options[tipoPesquisa.selectedIndex].text;
	
	if(valorSelecionado == "Código"){			
		document.getElementById('pesquisa-codigo').style.display='inline';
		document.getElementById('pesquisa-nome').style.display='none';
		document.getElementById('pesquisa-status').style.display='none';
	}else{
		if(valorSelecionado == "Nome"){
			document.getElementById('pesquisa-codigo').style.display='none';
			document.getElementById('pesquisa-nome').style.display='inline';
			document.getElementById('pesquisa-status').style.display='none';
		}else{
			if(valorSelecionado == "Status"){
				document.getElementById('pesquisa-codigo').style.display='none';
				document.getElementById('pesquisa-nome').style.display='none';
				document.getElementById('pesquisa-status').style.display='inline';
			}		
		}	
	}
}

function apresentarResultado(){
	document.getElementById("dados-resultado").style.display='inherit';
}

function apresentaDetalhe(){	
	
	document.getElementById("form-plano-filtro").style.display='none';
	document.getElementById("dados-resultado").style.display='inherit';
	
}

function apresentarFiltro(){
	document.getElementById("form-plano-filtro").style.display='inherit';
	document.getElementById("dados-resultado").style.display='none';
	
}

