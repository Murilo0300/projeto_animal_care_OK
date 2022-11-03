<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Cadastro Ong</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <link rel="icon" href="./resources/img/icone.png">
    <link rel="script" href="./resources/js/main.js" />
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="./resources/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans&family=Nunito:wght@600;700;800&display=swap"
        rel="stylesheet">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Flaticon Font -->
    <link href="./resources/lib/flaticon/font/flaticon.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="./resources/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="./resources/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="./resources/css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Topbar Start -->
    <div class="container-fluid">


        <div class="row py-3 px-lg-5">
            <div class="img-logo"><img src="./resources/img/icone.png" height="60px" width="60px"></div>
            <div class="col-lg-4">
                <a href="index.html" class="navbar-brand d-none d-lg-block">
                    <h1 class="m-0 display-5 text-capitalize"><span class="text-primary">Animal.</span>CARE</h1>

                </a>
            </div>
            <div class="col-lg-8 text-center text-lg-right">

            </div>
        </div>
    </div>
 
    <!-- Topbar End -->

    <!-- Contact Start -->
    <div class="container-fluid pt-5">
        <div class="d-flex flex-column text-center mb-5 pt-5">

            <h1 class="display-4 m-0">Cadastre<span class="text-primary"> sua ONG </span></h1>
            <h4 class="text-secondary mb-3">Cadastro da ONG</h4>
             <h2>Cadastro realizado com sucesso!!</h2>
        </div>
   
        <div class="row justify-content-center">
            <div class="col-12 col-sm-8 mb-5">
                <div class="contact-form">
                <form name="cadastro" action="validaCadastro.jsp" method="post"> 
                  
                  <div class="control-group">
                            <input type="text" class="form-control p-4" name="nome_ong" value="" placeholder="Nome da ONG" 
                                required="required" data-validation-required-message="Please enter your name" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="email" class="form-control p-4" name="email" value="" placeholder="E-mail da ONG"
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="tel" onkeydown="return mascaraTelefone(event)" class="form-control p-4 "
                                name="telefone" value="" placeholder="Telefone" required="required"
                                data-validation-required-message="Please enter a subject" />

                            <script>
                                function mascaraTelefone(event) {
                                    let tecla = event.key;
                                    let telefone = event.target.value.replace(/\D+/g, "");

                                    if (/^[0-9]$/i.test(tecla)) {
                                        telefone = telefone + tecla;
                                        let tamanho = telefone.length;

                                        if (tamanho >= 12) {
                                            return false;
                                        }

                                        if (tamanho > 10) {
                                            telefone = telefone.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
                                        } else if (tamanho > 5) {
                                            telefone = telefone.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
                                        } else if (tamanho > 2) {
                                            telefone = telefone.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
                                        } else {
                                            telefone = telefone.replace(/^(\d*)/, "($1");
                                        }

                                        event.target.value = telefone;
                                    }

                                    if (!["Backspace", "Delete"].includes(tecla)) {
                                        return false;
                                    }
                                }
                            </script>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="tel" class="form-control p-4" name="cnpj" value="" placeholder="CNPJ"
                                required="required" data-validation-required-message="Please enter your message">
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                           
                                CEP: <input type="text" class="form-control-cep p-4" name="cep" value="" maxlength="9"
                                    placeholder="00000-000" autofocus><br><br>
                                <input type="text" class="form-control-endereco p-4" name="endereco" value=""
                                    placeholder="Logradouro">
                                <input type="text" class="form-control-numero p-4" name="numero" value=""
                                    placeholder="Número"><br><br><br>
                                <input type="text" class="form-control-complemento p-4" name="complemento" value=""
                                    placeholder="Complemento">
                                <input type="text" class="form-control-bairro p-4" name="bairro" value=""
                                    placeholder="Bairro"><br><br><br>

                                <input type="text" class="form-control-cidade p-4" name="cidade" value="" placeholder="Cidade">
                                <input type="text" class="form-control-uf p-4" name="uf" value="" placeholder="UF"><br><br><br>
                            
							</div>
							
							
                                <br><br><br>   
                       </form>            
                   </div>                    
                </div>
            </div>

        </div>
    <!-- Contact End -->


    <!-- Footer Start -->
    <div class="container-fluid bg-dark text-white py-5 px-sm-3 px-md-5">
        <div class="img-logo"><img src="./resources/img/icone.png" height="60px" width="60px"></div>
    </div>
    <div class="container-fluid text-white py-4 px-sm-3 px-md-5" style="background: #111111;">

        <div class="row">

            <div class="col-md-6 text-center text-md-left mb-3 mb-md-0">
                <p class="m-0 text-white">
                    &copy; <a class="text-white font-weight-bold" href="./index.html">Animal.Care</a> Todos os direitos
                    reservados. 2022

                </p>
            </div>
        </div>
    </div>
    <!-- Footer End -->

    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="./resources/lib/easing/easing.min.js"></script>
    <script src="./resources/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="./resources/lib/tempusdominus/js/moment.min.js"></script>
    <script src="./resources/lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="./resources/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="./resources/mail/jqBootstrapValidation.min.js"></script>
    <script src="./resources/mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="./resources/js/main.js"></script>
</body>

</html>