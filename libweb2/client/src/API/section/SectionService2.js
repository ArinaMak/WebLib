import Axios from "axios"

export default class SectionService2 {
    static async getSection () {
        const response = await Axios.get("http://localhost:5000/section")
        return response;
    };
}