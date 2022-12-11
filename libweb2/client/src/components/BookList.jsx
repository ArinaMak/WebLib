import React from 'react';
import BookItem from "./BookItem";
import {TransitionGroup, CSSTransition} from "react-transition-group";

const BookList = ({books, title, remove}) => {

    if (!books.length) {
        return (
            <h1 style={{textAlign: 'center'}}>
                Посты не найдены!
            </h1>
        )
    }

    return (
        <div>
            <h1 style={{textAlign: 'center'}}>
                {title}
            </h1>
            <TransitionGroup>
                {books.map((book, index) =>
                    <CSSTransition
                        key={book.id_book}
                        timeout={500}
                        classNames="book"
                    >
                    <BookItem book={book} />
                    </CSSTransition>
                )}
            </TransitionGroup>
        </div>
    );
};

export default BookList;
