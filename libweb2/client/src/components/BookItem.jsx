import React from 'react';
import MyButton from "./UI/button/MyButton";
import {useHistory} from 'react-router-dom';

const BookItem = (props) => {
    const router = useHistory()

    return (
        <div className="book">
            <div className="book__content" key={props.index+1}>
                <strong>{props.index+1}. {props.book.title}</strong>
                <div>
                    {props.book.description}
                </div>
            </div>
            <div className="book__btns">
                <MyButton onClick={() => router.push(`/books/${props.book.id_book}`)}>
                    Открыть
                </MyButton>
                <MyButton>
                    Одолжить
                </MyButton>
            </div>
        </div>
    );
};

export default BookItem;
