import Axios from "axios"

export default class BookService {

    static postNewBook = (newbook) => {
        Axios.post("http://localhost:5000/bookshelf", {
            title: newbook.title,
            description: newbook.description,
            section: newbook.section,
            publishing_house: newbook.publishing_house,
            year_of_publication: newbook.year_of_publication
        }).then(() => {
          console.log("success");
        });
    };

    static async getBooks3 (/*setBooks*/) {
        const response = await Axios.get("http://localhost:5000/bookshelf/books")
        return response;
    };




}