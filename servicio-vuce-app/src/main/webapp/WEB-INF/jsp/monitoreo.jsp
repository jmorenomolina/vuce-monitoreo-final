<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
    <head>

        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <title>Consola de Monitoreo</title>
        <meta name="description" content=""/>
        <meta name="author" content="" />
        <meta name="robots" content="index, follow"/>
        <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1, user-scalable=no" />
   

        
        
       <c:url value="/css" var="jstlCss" />
       <c:url value="/js" var="jstlJs" />
        
       <c:url value="/bower_components" var="staticSource" />
	   <c:url value="/dist" var="staticSourceDis" />
       <c:url value="/plugins" var="staticSourcePlugin" />
       
       <c:url value="/images" var="staticImages" />
      
        
       <link href="${staticSource}/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />  
       <link href="${staticSource}/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
       <link href="${staticSource}/Ionicons/css/ionicons.min.css"/>        
       <link href="${staticSource}/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet" />   
       <link href="${staticSourceDis}/css/AdminLTE.min.css" rel="stylesheet" /> 
       <link href="${staticSourceDis}/css/skins/_all-skins.min.css" rel="stylesheet" />       
       <link href="${staticSourcePlugin}/pace/pace.min.css" rel="stylesheet" />
       
             
        <link href="${jstlCss}/bootstrap-select.min.css" rel="stylesheet"/>
        <link href="${jstlCss}/codemirror.css" rel="stylesheet"/>
		<link href="${staticSource}/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" rel="stylesheet"/>
		

       <link href="${jstlCss}/starter.css" rel="stylesheet" />
       
       

	   <script type="text/javascript" src="${staticSource}/jquery/dist/jquery.min.js"></script>
       <script type="text/javascript" src="${staticSource}/bootstrap/dist/js/bootstrap.min.js"></script>
       <script type="text/javascript" src="${staticSource}/datatables.net/js/jquery.dataTables.min.js"></script>
       

            
       <script type="text/javascript" src="${staticSource}/datatables.net/js/dataTables.buttons.min.js"></script>
       <script type="text/javascript" src="${staticSource}/datatables.net/js/jszip.min.js"></script>
       <script type="text/javascript" src="${staticSource}/datatables.net/js/pdfmake.min.js"></script>
       <script type="text/javascript" src="${staticSource}/datatables.net/js/vfs_fonts.js"></script>
       <script type="text/javascript" src="${staticSource}/datatables.net/js/buttons.html5.min.js"></script>
       <script type="text/javascript" src="${staticSource}/jquery-slimscroll/jquery.slimscroll.min.js"></script> 
       <script type="text/javascript" src="${staticSource}/fastclick/lib/fastclick.js"></script>
       <script type="text/javascript" src="${staticSource}/PACE/pace.min.js"></script>
   


       <script type="text/javascript" src="${staticSource}/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
		
       <script type="text/javascript" src="${jstlJs}/bootstrap-select.js"></script>
       <script type="text/javascript" src="${jstlJs}/vuce-chart.js"></script>
       <script type="text/javascript" src="${jstlJs}/vuce-util.js"></script>
       <script type="text/javascript" src="${jstlJs}/monitoreoIncidentes.js"></script>
       <script type="text/javascript" src="${jstlJs}/vuce-api-rest.js"></script>
       
       <script type="text/javascript" src="${jstlJs}/lib/Chart.min.js"></script>
       <script type="text/javascript" src="${jstlJs}/lib/codemirror.js"></script>
       <script type="text/javascript" src="${jstlJs}/lib/xml.js"></script>

      
      
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Google Font -->
  
    </head>


    <body class="sidebar-mini skin-red-light">
        <div class="wrapper">

            <!-- Main Header -->
            <header class="main-header">

                <!-- Logo -->
                <a href="./monitoreo" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>VUCE</b></span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>VUCE</b></span>
                </a>

                <!-- Header Navbar -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="./" class="sidebar-toggle" data-toggle="push-menu" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>
                    <!-- Navbar Right Menu -->
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">   
                            <!-- Notifications Menu -->
                            <li class="dropdown notifications-menu">
                                <!-- Menu toggle button -->
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="fa fa-bell-o"></i>
                                    <span class="label label-warning">1</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="header">Tienes 1 notificationes</li>
                                    <li>
                                        <!-- Inner Menu: contains the notifications -->
                                        <ul class="menu">

                                            <li><!-- start notification -->
                                                <a href="#" title="Notificacion de prueba">
                                                    <i class="fa fa-bell"></i> Descripcion de la notificacion
                                                </a>
                                            </li>

                                            <!-- end notification -->
                                        </ul>
                                    </li>
                                    <li class="footer">
                                       
                                    </li>
                                </ul>
                            </li>
                            <!-- User Account Menu -->
                            <li class="dropdown user user-menu">
                                <!-- Menu Toggle Button -->
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <!-- The user image in the navbar-->

									 <img src="${staticSourceDis}/img/avatar5.png" alt="user"  class="user-image" />
                                  

                                    <!-- hidden-xs hides the username on small devices so only the image appears. -->
                                    <span class="hidden-xs">Joel Moreno </span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- The user image in the menu -->
                                    <li class="user-header">

                        				 <img src="${staticSourceDis}/img/avatar5.png" alt="user"  class="img-circle" />
										
                                        <p>
                                            Joel Moreno           
                                            <small>jmoreno</small>
                                            <small>Especialista VUCE</small>                                         
                                        </p>
                                    </li>

                                    <!-- Menu Footer-->
                                    <li class="user-footer">
                                        <div class="pull-left">
                                      
                                        </div>
                                        <div class="pull-right">
				                   
                                        </div>
                                    </li>
                                </ul>
                            </li>                            
                        </ul>
                    </div>
                </nav>
            </header>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">

                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">

                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel">
                        <div class="pull-left image">                            
                           
                            <img src="${staticSourceDis}/img/avatar5.png" alt="user"  class="img-circle" />                 
                        </div>
                        <div class="pull-left info">
                            <p>Joel Moreno  </p>
                            <!-- Status -->
                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>

                    <!-- search form (Optional) -->
                    <!--form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..." />
                            <span class="input-group-btn">
                                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </form-->
                    <!-- /.search form -->

                    <ul class="sidebar-menu tree" data-widget="tree">
                        <li class="header">Reportes</li>
                        <li class="active treeview menu-open">
                            <a href="#">
                                <i class="fa fa-dashboard"></i> <span>Consola</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="/monitoreo"><i class="fa fa-circle-o"></i>Incidentes</a></li>

                            </ul>
                        </li>                                                  


                    </ul>
                    <!-- /.sidebar-menu -->
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">            
               <jsp:include page='page/app.jsp'></jsp:include>
            </div>
            <!-- /.content-wrapper -->

            <!-- Main Footer -->
            <footer class="main-footer">
                <!-- To the right -->
                <div class="pull-right hidden-xs">

                </div>
                <!-- Default to the left -->
                <strong>© Copyright 2018 - <a href="https://www.apn.gob.pe/site/"> MINCETUR </a> </strong> Todos los derechos reservados.
            </footer>

            <!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
            immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div>
        <!-- ./wrapper -->
        <script type="text/javascript">
            // To make Pace works on Ajax calls
            $(document).ajaxStart(function () {
                Pace.restart();
            });
        </script>


    </body>
</html>