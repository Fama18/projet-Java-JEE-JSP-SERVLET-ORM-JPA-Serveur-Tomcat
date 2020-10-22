<jsp:include page="../../header.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Content Row -->

          <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-8 col-lg-7">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Liste des villages</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  	<table class="table table-striped">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Nom</th>
						</tr>
		
						<tr>
							<c:forEach items="${listVillage}" var="v">
								<tr>
									<td>${v.id}</td>
									<td>${v.nom}</td>
								</tr>
							</c:forEach>
					   </tr>
					</table>
                </div>
              </div>
            </div>

            <!-- Pie Chart -->
            <div class="col-xl-4 col-lg-5">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Ajout de clients</h6>

                </div>
                <!-- Card Body -->
                <div class="card-body">
			    	<form method="post" action="Village">
			    		<div class="form-group">
					    	<label>Nom du village : </label>
					    	<input class="form-control" type="text" name="nom"/>
					    </div>
					    <div>
					    	<input class="btn btn-success" type="submit" value="Envoyer"/>
					    </div>
			    	</form>
				

                </div>
              
              
              </div>
            </div>
          </div>
<jsp:include page="../../footer.jsp"></jsp:include>

