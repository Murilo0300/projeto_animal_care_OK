<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ page language="java" import="br.com.animalcare.bean.Ong, 
                                 br.com.animalcare.controller.ControllerOng"
                                 
%>

<%
String nome_ong = request.getParameter("nome_ong");
String email = request.getParameter("email");
String telefone = request.getParameter("telefone");
String cod2 = request.getParameter("cnpj");
int cnpj = Integer.parseInt(cod2);
String cod3 = request.getParameter("cep");
int cep = Integer.parseInt(cod3);
String logradouro = request.getParameter("logradouro");
String numero = request.getParameter("numero");
String complemento = request.getParameter("complemento");
String bairro = request.getParameter("bairro");
String cidade = request.getParameter("cidade");
String uf = request.getParameter("uf");

Ong ongEntrada = new Ong(nome_ong, email, telefone, cnpj, cep, logradouro, numero, complemento, bairro, cidade, uf);

ControllerOng contOng = new ControllerOng();
ongEntrada = contOng.inserir(ongEntrada);

String url = "sucessCadastro.jsp";
response.sendRedirect(url);
%>

