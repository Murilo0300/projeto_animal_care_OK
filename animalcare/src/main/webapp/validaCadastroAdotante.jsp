<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ page language="java" import="br.com.animalcare.bean.Adotante,
    								 br.com.animalcare.controller.ControllerAdotante" 
    								 
%>    
    
<%
String nome_adotante = request.getParameter("nome_adotante");
String cod = request.getParameter("cpf");
int cpf = Integer.parseInt(cod);
String email = request.getParameter("email");
String telefone = request.getParameter("telefone");
String cod2 = request.getParameter("cep");
int cep = Integer.parseInt(cod2);
String logradouro = request.getParameter("logradouro");
String numero = request.getParameter("numero");
String complemento = request.getParameter("complemento");
String bairro = request.getParameter("bairro");
String cidade = request.getParameter("cidade");
String uf = request.getParameter("uf");

Adotante adotEntrada = new Adotante(nome_adotante, cpf, email, telefone, cep, logradouro, 
		numero, complemento, bairro, cidade, uf);

ControllerAdotante contAdot = new ControllerAdotante();

adotEntrada = contAdot.inserir(adotEntrada);

String url ="sucessCadastroAdotante.jsp";
response.sendRedirect(url);
%>