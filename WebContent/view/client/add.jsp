<jsp:include page="../../header.jsp"></jsp:include>
<!-- Content Row -->

          <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-8 col-lg-7">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">Liste des clients</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  Tableau
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
			    	<form method="post" action="Client">
			    		<div class="form-group">
					    	<label>Nom de famille : </label>
					    	<input class="form-control" type="text" name="nomFamille"/>
					    </div>
					    <div class="form-group">
					    	<label>Adresse : </label>
					    	<input class="form-control" type="text" name="adresse"/>
					    </div>
					    <div class="form-group">
					    	<label>Telephone : </label>
					    	<input class="form-control" type="text" name="telephone"/>
					    </div>
					    <div class="form-group">
					    	<label>Sélectionner un village : </label>
					    	<select class="form-control" name="village_id">
					    		<option>--Sélectionner un village--</option>
					    	</select>
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

