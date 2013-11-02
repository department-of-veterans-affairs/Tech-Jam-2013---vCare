
<%@ page import="metlife.Metlife" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'metlife.label', default: 'Metlife')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
					<g:javascript library="jquery" plugin="jquery 1.8.3"/>
			<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
			<script type="text/javascript">

				// Method is used to Expand and Hide on click of image using JQuery 
				$(document).ready(function() {
					$("#expand").click(function() {
						$("#hide").toggle();
					});
					
				});
			
		
			</script>

<script type='text/javascript'>

      // Google grails chart api is used to display charts on UI with data being fetched from Rest Webservice		 
      google.load('visualization', '1', {packages:['gauge']});
	  // Webservice Call on page load	
      google.setOnLoadCallback(a);

      // Method is used to call various javascript functions to display charts on page	
	  function processData(json){
		  // Weight Chart
		  drawWeightChart(json);
		  // Diastolic Blood Pressure Chart
		  drawLowBPChart(json);
		  // Systolic Blood Pressure Chart
		  drawHighBPChart(json);
		  // Cholesterol Chart
		  drawCholestorelChart(json);
		  // Blood Sugar Chart
		  drawSugarChart(json);			
		  }

      // Function is used to call Rest Webservice eventually populating the Chat data on UI
      function a(){
      $.ajax({  
          type: "GET",  
          url: "http://137.116.81.48:8080/MemberProfileServices/webresources/VitalDetails/memberId=667?callback=processData", 
          contentType: 'application/json; charset=utf-8',
          dataType: "jsonp",
                
          success: function(resp){  
            // we have the response  
            //alert("Server said ok:\n '" + resp );  
          },  
          error: function(e){  
            //alert('Error: ' + e.status);  
          }  
        });
      }

	  // Function draws google api's weight chart on UI using webservice data
      function drawWeightChart(json) {
    	var weight = json.Weight;
    	var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['Weight', parseInt(weight)]
        ]);

        var options = {
          width: 500, height: 120,
          //redFrom: 0, redTo: 100,
          greenFrom: 100, greenTo: 160,
          yellowFrom:160, yellowTo: 200,
          redFrom:200, redTo: 350,
          min:0, max:350, 
          minorTicks: 10
        };

        var chart = new google.visualization.Gauge(document.getElementById('weight_chart_div'));
        chart.draw(data, options);
      }

   // Function draws google api's Blood Pressure chart on UI using webservice data
      function drawLowBPChart(json) {
          var diastolic = json.Diastolic;
          var data = google.visualization.arrayToDataTable([
            ['Label', 'Value'],
            ['Diastolic', parseInt(diastolic)]
          ]);

          var options = {
            width: 500, height: 120,
            redFrom: 90, redTo: 200,
            yellowFrom:80, yellowTo: 90,
            greenFrom:0, greenTo: 80,
            min:0, max:200, 
            minorTicks: 5
          };

          var chart = new google.visualization.Gauge(document.getElementById('dia_pressure_div'));
          chart.draw(data, options);
        }

   // Function draws google api's Blood Pressure chart on UI using webservice data
      function drawHighBPChart(json) {
          var systolic=json.Systolic;
          var data = google.visualization.arrayToDataTable([
            ['Label', 'Value'],
            ['Systolic', parseInt(systolic)]
          ]);

          var options = {
            width: 500, height: 120,
            redFrom: 150, redTo: 300,
            yellowFrom:120, yellowTo: 150,
            greenFrom:0, greenTo: 120,
            min:0, max:300, 
            minorTicks: 5
          };

          var chart = new google.visualization.Gauge(document.getElementById('sys_pressure_div'));
          chart.draw(data, options);
        }

   // Function draws google api's Cholesterol chart on UI using webservice data	
      function drawCholestorelChart(json) {
          var cholesterol = json.Cholestrol;
          var data = google.visualization.arrayToDataTable([
            ['Label', 'Value'],
            ['Cholestorel', parseInt(cholesterol)]
          ]);

          var options = {
            width: 500, height: 120,
            redFrom: 280, redTo: 400,
            yellowFrom:200, yellowTo: 280,
            greenFrom:110, greenTo: 200,
            min:0, max:400, 
            minorTicks: 5
          };

          var chart = new google.visualization.Gauge(document.getElementById('cholestorel_div'));
          chart.draw(data, options);
        }


   // Function draws google api's Blood Sugar chart on UI using webservice data
      function drawSugarChart(json) {
          var sugarLevel = json.BloodSugar;
          var data = google.visualization.arrayToDataTable([
            ['Label', 'Value'],
            ['Blood Glucose', parseInt(sugarLevel)]
          ]);

          var options = {
            width: 500, height: 120,
            redFrom: 150, redTo: 300,
            yellowFrom:120, yellowTo: 150,
            greenFrom:0, greenTo: 120,
            min:0, max:300, 
            minorTicks: 5
          };

          var chart = new google.visualization.Gauge(document.getElementById('blood_glucose_div'));
          chart.draw(data, options);
        }
      
    </script>
		
	</head>
	<body>
		<a href="#list-metlife" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
		
		</div>
		<div id="list-metlife" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>

						<richui:tabView id="tabView">
							<richui:tabLabels>
								<richui:tabLabel selected="true" title="Vital Signs" />
								<richui:tabLabel title="Recovery Plan" />
								<richui:tabLabel title="Allergies" />
								<richui:tabLabel title="Reports" />
								<richui:tabLabel title="Notes" />
								<richui:tabLabel title="Medications" />
								
							</richui:tabLabels>
							
							<richui:tabContents>
								<richui:tabContent>
									 
									 
									 <table>
									 <tr><td colspan="2"><font color="blue"><b>Weight</b></font></td></tr>
									 <tr>
									 <td width="40%"> <div id="weight_chart_div"></div><br /></td><td style="vertical-align:middle;text-align:left">Goal <b>172.5</b><br> Last Reading <b>180</b></td>
									 
									 </tr>
									 
									  <tr><td colspan="2"><font color="blue"><b>Blood Pressure</b></font></td></tr>
									 <tr>
									 <td width="40%"> <div id="dia_pressure_div"></div><div id="sys_pressure_div"></div></td>
									 <td width="60%" style="vertical-align:middle;text-align:left">Goal <b>120/80</b><br> Last Reading <b>130/80</b></td>
									 
									 </tr>
									 
									  <tr><td colspan="2"><font color="blue"><b>Cholesterol</b></font></td></tr>
									 <tr>
									 <td width="30%"> <div id="cholestorel_div"></div><br /></td><td width="70%" style="vertical-align:middle;text-align:left">Goal <b>150</b><br> Last Reading <b>80</b></td>
									 
									 </tr>
									 
									  <tr><td colspan="2"><font color="blue"><b>Blood Glucose Level</b></font></td></tr>
									 <tr>
									 <td width="30%"><div id="blood_glucose_div"></div><br /></td><td width="70%" style="vertical-align:middle;text-align:left">Goal <b>96</b><br> Last Reading <b>130</b></td>
									 
									 </tr>
									 
									 </table>
							
							</richui:tabContent>
							
							<richui:tabContent>
					    		
					    		<richui:tabView id="tabView">
								<richui:tabLabels>
								<img width="100%" src="${resource(dir: 'images', file: 'status.jpg')}" alt="Metlife"/>
								<richui:tabLabel selected="true" title="Health" />
								<richui:tabLabel title="Finances" />
					    		</richui:tabLabels>
				
								<richui:tabContents>
								<richui:tabContent>
	
						
						<img width="10px;" id="expand" src="${resource(dir: 'images', file: 'arrow.jpg')}" alt="Metlife"/>  Behavioral Health & Substance Abuse</button>
							
							<div id="hide" style="display: none">
							<table>
							<tr><td width="10%"><input type="checkbox" name=""/></td><td width="90%">Discuss process</td></tr>
							<tr><td width="10%"><input type="checkbox" name=""/></td><td>Determine need</td></tr>
							<tr><td width="10%"><input type="checkbox" name=""/></td><td>Choose appropriate program</td></tr>
							<tr><td width="10%"><input type="checkbox" name=""/></td><td>Receive treatment</td></tr>
							<tr><td width="10%"><input type="checkbox" name=""/></td><td>Monitor Progress</td></tr>
						
							</table></div>
						<img width="10px;" id="expand1" src="${resource(dir: 'images', file: 'arrow.jpg')}" alt="Metlife"/>  Hearing/Audiology</button>	
					    		</richui:tabContent>
					    	
					    		</richui:tabContents>
					    		
							</richui:tabView>
					    		
							</richui:tabContent>
				
							<richui:tabContent>
					    	
				            </richui:tabContent>
							</richui:tabContents>
							</richui:tabView>
				
			
		</div>
	</body>
</html>
