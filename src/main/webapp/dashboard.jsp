<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ChileMarket - Dashboard Analítico</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body class="bg-light">
        <div class="container py-5">
            <div class="d-flex justify-content-between align-items-center mb-4">
                <h1 class="text-primary">Dashboard de Ventas - Región del Biobío</h1>
                <a href="productos" class="btn btn-outline-secondary">Volver al Catálogo</a>
            </div>

            <!-- Card Resumen Total -->
            <div class="row mb-4">
                <div class="col-md-4">
                    <div class="card text-white bg-success shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Ventas Totales</h5>
                            <h2 class="card-text">$${totalAcumulado}</h2>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Tabla de Analítica -->
            <div class="table-responsive">
                <table class="table table-striped table-hover bg-white shadow-sm rounded">
                    <thead class="table-dark">
                        <tr>
                            <th>Producto</th>
                            <th>Cantidad Vendida</th>
                            <th>Monto Total (CLP)</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="v" items="${ventas}">
                            <tr>
                                <td><strong>${v.producto}</strong></td>
                                <td>${v.cantidad}</td>
                                <td>$${v.total}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>