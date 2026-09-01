<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ChileMarket - Catálogo Regional</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body class="bg-light">
        <div class="container py-5">
            <h1 class="mb-4 text-primary">Plataforma ChileMarket - Región del Biobío</h1>
            <a href="ventas" class="btn btn-primary mb-3">Ver Dashboard de Ventas</a>
            <div class="table-responsive">
                <table class="table table-striped table-hover bg-white shadow-sm rounded">
                    <thead class="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Producto</th>
                            <th>Descripción</th>
                            <th>Precio (CLP)</th>
                            <th>Stock</th>
                            <th>Origen</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${productos}">
                            <tr>
                                <td>${p.id}</td>
                                <td><strong>${p.nombre}</strong></td>
                                <td>${p.descripcion}</td>
                                <td>$${p.precio}</td>
                                <td>${p.stock}</td>
                                <td><span class="badge bg-info">${p.regionOrigen}</span></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>