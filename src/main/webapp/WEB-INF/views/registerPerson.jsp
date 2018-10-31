    <%@ page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Person</title>
    </head>
    <style>
    div.registrationForm {
    	text-align: right width:300px;
    	padding: 10px;
    	margin: 0px
    }
    </style>
    <body>
    	<h1>Registration Form</h1>
    	<div class="registrationForm">
    		<form action="registerPerson" method="post">
    			<table style="with: 50%">
    				<tr>
    					<td>First name</td>
    					<td><input type="text" name="firstName" /></td>
    				</tr>
    				<tr>
    					<td>Last name</td>
    					<td><input type="text" name="lastName" /></td>
    				</tr>
    				<tr>
    					<td>Company</td>
    					<td><input type="text" name="company" /></td>
    				</tr>
    				<tr>
    					<td>Access level</td>
    					<td>
    					    <select name="accessLevel">
                              <option>ORGANIZATOR</option>
                              <option>PARTICIPANT</option>
                              <option>VOLUNTEER</option>
                            </select>
                        </td>
    				</tr>
    			</table>
    			<input type="submit" value="Register" />
    		</form>
    	</div>
    </body>
    </html>