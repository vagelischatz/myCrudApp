<html>
<head>
<TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>

<style type="text/css">
body {
	background-image:
		url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<head>
<title>Applying jQuery DataTables plugin in the Java Server
	application</title>
<link href="media/dataTables/demo_page.css" rel="stylesheet"
	type="text/css" />
<link href="media/dataTables/demo_table.css" rel="stylesheet"
	type="text/css" />
<link href="media/dataTables/demo_table_jui.css" rel="stylesheet"
	type="text/css" />
<link href="media/themes/base/jquery-ui.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="media/themes/smoothness/jquery-ui-1.7.2.custom.css"
	rel="stylesheet" type="text/css" media="all" />
<script src="scripts/jquery-1.4.4.min.js" type="text/javascript"></script>
<script src="scripts/jquery.dataTables.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#Users").dataTable({
			"sPaginationType" : "full_numbers",
			"bJQueryUI" : true
		});
	});
</script>
</head>

</head>


<body>

	<button id="add">Add User</button>
	<!-- 	<button id="json">json</button> -->

	<button id="get">Get User</button>



	<button onclick="fetch()">Get All Categories</button>
	<div id="Categories"></div>


	<script type="text/javascript">
		// 	$('#json').click(function(){ 
		// 	    alert('json');
		// 	     $.getJSON("http://localhost:8080/json/category/get",
		// 	     function(data) {
		// 	        alert(data);         
		// 	      });   
		// 	});

		$('#ajax').click(function() {
			alert('get');
			$.ajax({
				type : "GET",
				dataType : "json",
				url : "http://localhost:8080/json/category/get",
				success : function(data) {
					alert(data);
				}
			});
		});

		$('#ajax').click(function() {
			alert('add');
			$.ajax({
				type : "POST",
				dataType : "json",
				url : "http://localhost:8080/json/category/post",
				success : function(data) {
					alert(data);
				}
			});
		});

		//     function CategoryAddAjax() {
		//         $.ajax({
		//             url : 'CategoryAdd.html',
		//             success : function(data) {
		//                 $('#result').html(data);
		//             }
		//         });

		//     function CategoryDeleteAjax() {
		//         $.ajax({
		//             url : 'CategoryDelete.html',
		//             success : function(data) {
		//                 $('#result').html(data);
		//             }
		//         });

		//     function CategoryUpdateAjax() {
		//         $.ajax({
		//             url : 'CategoryUpdate.html',
		//             success : function(data) {
		//                 $('#result').html(data);
		//             }
		//         });
		//     }

		//          function fetch(){
		// // 	    var request = new XMLHttpRequest();
		// // 	    request.onreadystatechange = function(){
		// // 	       if(this.readyState == 4 && this.status == 200){
		// // 	          var response = this.responseText;
		// // 		  document.getElementById("Category").innerHTML=response;
		// // 	       }
		// //             };
		// //             request.open("GET", "Category.jsp", true);
		// // 	    request.send();

		// 	    var xhttp = new XMLHttpRequest();
		// 	    xhttp.open("POST", "http://localhost:8080/json/category/post", true);
		// 	    xhttp.setRequestHeader("Content-type", "interview/json");
		// 	    xhttp.send();
		// 	    var response = JSON.parse(xhttp.responseText);
		//          }
	</script>

	<script type="text/javascript" name="Categories"></script>
	<script name="Categories">
		$(document)
				.ready(
						function() {

							$('#butCallAjax')
									.click(
											function() {
												jQuery.support.cors = true;

												$
														.ajax({
															type : "GET",
															url : "http://localhost:8080/json/category/get",
															data : "{}",
															contentType : "application/json; charset=utf-8",
															dataType : "json",
															success : function(
																	data) {

																//alert('success');
																$
																		.each(
																				data,
																				function(
																						i,
																						theItem) {
																					var combo = document
																							.getElementById("cboFastBikes");
																					var option = document
																							.createElement("option");
																					option.text = theItem
																							.toString();
																					option.value = theItem
																							.toString();
																					try {
																						//alert('success add combo');
																						combo
																								.add(
																										option,
																										null); // Other browsers
																					} catch (error) {
																						alert('error found');
																						combo
																								.add(option); // really old browser
																					}

																				});
															},
															error : function(
																	msg, url,
																	line) {
																alert('error trapped in error: function(msg, url, line)');
																alert('msg = '
																		+ msg
																		+ ', url = '
																		+ url
																		+ ', line = '
																		+ line);

															}
														});

												//alert('button click');

											});
						});
	</script>


	<div id="stylized" class="myform">
		<form id="form" action="#" name="form">
			<h1>How to retrieve RESTful Data with jQuery</h1>
			<p>This is a basic example</p>
			<label> Fast Motorcycles <span class="small">RESTfully
					Retrieved</span>
			</label> <select id="cboFastBikes" name="cboFastBikes"></select>
			<button id="butCallAjax" type="button">Call Azure-hosted
				RESTful Service</button>
			<div class="spacer"></div>
		</form>
	</div>

	<div id="container">
		<div id="demo_jui">
			<table id="categories" class="display">
				<thead>
					<tr>
						<th>Company name</th>
						<th>Address</th>
						<th>Town</th>
					</tr>
				</thead>
				<tbody>
<%-- 					<%	for (Category c : DataRepository.GetCategories()) {%> --%>
<!-- 					<tr> -->
<%-- 						<td><%=c.getName()%></td> --%>
<%-- 						<td><%=c.getAddress()%></td> --%>
<%-- 						<td><%=c.getTown()%></td> --%>
<!-- 					</tr> -->
<%-- 					<% --%>
<!-- // // 						} -->
<%-- 					%> --%>
				</tbody>
			</table>
		</div>
	</div>


</body>
</html>