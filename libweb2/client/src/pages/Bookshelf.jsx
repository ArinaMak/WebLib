import React, {useState} from 'react';
import MyInput from "../components/UI/input/MyInput";
import MyButton from "../components/UI/button/MyButton";
import BookService from "../API/book/BookService"

const Bookshelf = () => {
    const [newbook, setNewbook] = useState({title: '', description: '', section: 4, publishing_house: 3, year_of_publication: 20})

    const addBook = (e) => {
        e.preventDefault()
        BookService.postNewBook(newbook)
        setNewbook({title: '', description: '', section: 4, publishing_house: 3, year_of_publication: 20})
    }

    return (
        <div>
            <h1>Добавить новую книгу</h1>
            <form>
                <MyInput
                    value={newbook.title}
                    onChange={e => setNewbook({...newbook, title: e.target.value})}
                    type="text"
                    placeholder="title"
                />
                <MyInput
                    value={newbook.description}
                    onChange={e => setNewbook({...newbook, description: e.target.value})}
                    type="text"
                    placeholder="description"
                />
                <MyInput
                    value={newbook.section}
                    onChange={e => setNewbook({...newbook, section: e.target.value})}
                    type="text"
                    placeholder="section"
                />
                <MyInput
                    value={newbook.publishing_house}
                    onChange={e => setNewbook({...newbook, publishing_house: e.target.value})}
                    type="text"
                    placeholder="publishing_house"
                />
                <MyInput
                    value={newbook.year_of_publication}
                    onChange={e => setNewbook({...newbook, year_of_publication: e.target.value})}
                    type="text"
                    placeholder="year_of_publication"
                />
                <MyButton onClick={addBook}>Добавить книгу!</MyButton>
            </form>
        </div>
    );
};

export default Bookshelf;
