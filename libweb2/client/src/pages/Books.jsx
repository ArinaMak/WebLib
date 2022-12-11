import React, {useState, useEffect} from 'react';
import '../styles/App.css';
import Signin from "../pages/Signin"
import Bookshelf from "../pages/Bookshelf"
import MyButton from "../components/UI/button/MyButton";
import BookItem from "../components/BookItem"
import BookList from "../components/BookList"

import Axios from "axios"
import BookService from "../API/book/BookService"

function Books() {
    const [section, setSection] = useState([])
    const [books, setBooks] = useState([])
    async function getSection () {
        const response = await Axios.get("http://localhost:5000/section")
        console.log(response.data)
        setSection(response.data)
    };
    async function getBooks () {
        const response = await Axios.get("http://localhost:5000/bookshelf/books")
        console.log(response.data)
        setBooks(response.data)
    };
    async function getBooks4 () {
        const response = await BookService.getBooks3();
        console.log(response)
        console.log("response.data")
        console.log(response.data)
        setBooks(response.data)
        console.log(response.data.length)
    }
    useEffect(() => {
        getBooks4()
    }, [])
    return (

        <div className="App">

            {books.map((books, index) =>
                <BookItem book={books} key={index} index={index}/>

            )}
        </div>


    )
}

export default Books;