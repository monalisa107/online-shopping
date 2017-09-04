<div class="container">

 	<div class="row">
 		<!-- To display the sidebar -->
 		<div class="col-md-3">
 		     <%@include file="./shared/sidebar.jsp" %>        		
 		</div>
 		
 		<!-- To display the actual products -->
 		<div class="col-md-9">
 		
 			<div class="row">
 				<div class="col-lg-12">
 					<ol class="breadcrumb">
 					
 						<li><a href="${contextRoot}/home">Home</a></li>
 						<c:if test="${userClickCategoryProducts ==true}">
 							<li>Category</li>
 						</c:if>
 						<li class="active">${title}</li>
 					</ol>
 				</div>
 			</div>
 		</div>
 	
 	</div>


</div>