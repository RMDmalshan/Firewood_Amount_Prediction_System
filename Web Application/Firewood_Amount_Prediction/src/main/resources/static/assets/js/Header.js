document.write(`  
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <title>Ammro Oil Refiner - Admin Panel</title>
    <meta content="" name="description" />
    <meta content="" name="keywords" />

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon" />
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

    <!-- Google Fonts -->
    <link href="https://fonts.gstatic.com" rel="preconnect" />
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
      rel="stylesheet"
    />

    <!-- Vendor CSS Files -->
    <link
      href="assets/vendor/bootstrap/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
      rel="stylesheet"
    />
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet" />
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
    <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet" />

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet" />
  </head>

  <body>
    <!-- ======= Header ======= -->
    <header id="header" class="header fixed-top d-flex align-items-center">
      <div class="d-flex align-items-center justify-content-between">
        <a href="Dashboard.html" class="logo d-flex align-items-center">
          <img src="assets/img/logo.png" alt="" />
          <span class="d-none d-lg-block">Ammro Oil Refiner</span>
        </a>
        <i class="bi bi-list toggle-sidebar-btn"></i>
      </div>
      <!-- End Logo -->
    </header>
    <!-- End Header -->

    <!-- ======= Sidebar ======= -->
    
      

    <main id="main" class="main">
      <!-- End Page Title -->

      <!-- ======= Sidebar ======= -->
      <aside id="sidebar" class="sidebar">
    
        <ul class="sidebar-nav" id="sidebar-nav">
    
          <li class="nav-item">
            <a class="nav-link collapsed" href="Dashboard.html">
              <i class="bi bi-grid"></i>
              <span>Dashboard</span>
            </a>
          </li><!-- End Dashboard Nav -->


          <li class="nav-item">
          <a class="nav-link collapsed" href="Products.html">
            <i class="bi bi-bag"></i>
            <span>Products</span>
          </a>
        </li><!-- End Products Nav -->




        <li class="nav-item">
          <a class="nav-link collapsed" href="Admin.html">
            <i class="bi bi-bag"></i>
            <span>Admin</span>
          </a>
        </li><!-- End Products Nav -->

          <li class="nav-item">
            <a class="nav-link collapsed" href="Customers.html">
              <i class="bi bi-people"></i>
              <span>Customers</span>
            </a>
          </li><!-- End Customers Nav -->

          <li class="nav-item">
            <a class="nav-link collapsed" href="#">
              <i class="bi bi-calculator-fill"></i>
              <span>Predict</span>
            </a>
          </li><!-- End Customers Nav -->

      
    
          <li class="nav-item">
            <a class="nav-link collapsed" href="index.html">
              <i class="bi bi-box-arrow-in-right"></i>
              <span>Log Out</span>
            </a>
          </li><!-- End Login Page Nav -->
    
    
        </ul>
    
      </aside><!-- End Sidebar-->

      <script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script> 

`);
