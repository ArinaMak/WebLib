import Axios from "axios"

export default class RegistrationService {
    static postNewUser = (newuser) => {
        Axios.post("http://localhost:5000/reg", {
            login: newuser.login,
            email: newuser.email,
            surname: newuser.surname,
            name: newuser.name,
            patronymic: newuser.patronymic,
            userpassword: newuser.userpassword
        }).then(() => {
          console.log("success");
        });
    };




}