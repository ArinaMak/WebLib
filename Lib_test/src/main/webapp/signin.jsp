<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Sliding Login & Signup Forms - HTML, CSS &JavaScript</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="form-container sign-in-form">
      <div class="form-box sign-in-box">
        <h2>Log in</h2>
        <form action="">
          <div class="field">
            <i class="	far fa-address-card"></i>
            <input type="email"  id="namehere" placeholder="Email ID"  required>
            	<script>
					function displayname() {
  					  document.getElementById("MM").innerHTML = 
						document.getElementById("namehere").value;
						}

</script>
          </div>
          <div class="field">
            <i class="fas fa-lock"></i>
            <input class="password-input" id="namehere" type="password" placeholder="Password"  required>
            	<script>
					function displayname() {
  					  document.getElementById("PP").innerHTML = 
						document.getElementById("namehere").value;
						}

</script>

            <div class="eye-btn"><i class="fas fa-eye-slash"></i></div>
          </div>
          <div class="forgot-link">
              <a href="#">Forgot password?</a>
          </div>
          <input class="submit-btn" type="submit" value="Login">
          <p> check email</p><br>
<input type= text><br><br><br><br>
<p id="MM"></p>
<br><br>
<p> check password</p><br>
<input type= password><br>
<p id="PP"></p>
        </form>
      </div>
    </div>
<% System.out.println("Now1 = test@mail.ru"); %>









<script type="text/javascript">
    System.out.println("Now2"); 

    function eventForm(value) {
    	  if (value == "test@mail.ru") {
    		  System.out.println("test");
    	    alert('sd')
    	  }
    	}

        const textInputs = document.querySelectorAll("input");
        textInputs.forEach(textInput => {
            textInput.addEventListener("focus", () => {
                let parent = textInput.parentNode;
                parent.classList.add("active");

            });

            textInput.addEventListener("blur", () => {
                let parent = textInput.parentNode;
                parent.classList.remove("active");

            });
        });
        </script>
     

</body>
</html>