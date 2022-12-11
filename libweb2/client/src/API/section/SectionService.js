import Axios from "axios"

export default class SectionService {
    static getSection = (setSection) => {
        Axios.get("http://localhost:5000/section", {
        }).then((response) => {
          setSection(response.data);
          console.log("success");
          console.log(response.data);
        });
    };
}