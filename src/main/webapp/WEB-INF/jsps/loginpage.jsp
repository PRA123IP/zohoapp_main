<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="css/loginpage.css">
</head>
<body>
  <div class="login-wrapper">
      <form action="verifylogin" class="form" method="post">
        <h2>Login</h2>
        <div class="input-group">
          <input type="text" name="email" id="loginUser" required />
          <label for="loginUser">User email</label>
        </div>
        <div class="input-group">
          <input
            type="password"
            name="password"
            id="loginPassword"
            required
          />
          <label for="loginPassword">Password</label>
        
        </div>

        <input type="submit" value="Login" class="submit-btn" />
     ${msg }
      </form>
      </div>
</body>
</html>